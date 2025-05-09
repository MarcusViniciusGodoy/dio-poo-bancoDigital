package Conta;

import Cliente.Cliente;
import Transacional.Transacional;

public abstract class Conta implements Transacional{

    private int numero;
    protected double saldo;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }
}
