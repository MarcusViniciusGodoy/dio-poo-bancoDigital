package Conta;

import Cliente.Cliente;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, Cliente cliente, double limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    public void usarLimite(double valor) {
        if (valor <= (saldo + limite)) {
            saldo -= valor;
        }
    }

    public double getLimite() {
        return limite;
    }

}
