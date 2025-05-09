import Banco.Banco;
import Cliente.Cliente;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        ContaCorrente cc = new ContaCorrente(1001, cliente1, 500);
        ContaPoupanca cp = new ContaPoupanca(1002, cliente1, 0.05f);

        Banco banco = new Banco();
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        cc.depositar(1000);
        cc.transferir(cp, 200);

        cp.renderJuros();

        System.out.println("Dados da conta do cliente " + cliente1.getNome() + " com cpf " + cliente1.getCpf());
        System.out.printf("Saldo Conta Corrente: %.2f%n", cc.getSaldo());
        System.out.printf("Saldo Conta Poupança: %.2f%n", cp.getSaldo());
    }
}
