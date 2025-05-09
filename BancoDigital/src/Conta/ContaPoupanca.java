package Conta;

import Cliente.Cliente;

public class ContaPoupanca extends Conta{

     private float taxaRendimento;

    public ContaPoupanca(int numero, Cliente cliente, float taxaRendimento) {
        super(numero, cliente);
        this.taxaRendimento = taxaRendimento;
    }

    public void renderJuros() {
        saldo += saldo * taxaRendimento;
    }

    public float getTaxaRendimento() {
        return taxaRendimento;
    }
}
