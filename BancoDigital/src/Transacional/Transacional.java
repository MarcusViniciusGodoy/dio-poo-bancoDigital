package Transacional;

import Conta.Conta;

public interface Transacional {

    void depositar(double valor);
    void sacar(double valor);
    void transferir(Conta destino, double valor);
}
