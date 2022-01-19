package com.company;

public abstract class Conta  implements iConta {

    private static  final int  AGENCIA_PADRAO = 1; /*Protected faz com que as classe filhas enxerguem  os códigos da codigo mãe*/
    private static  int SEQUENCIAL = 1; /*Classe static tenha relação com a classe ContaCorrente e não com a instância  */

    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }


    @Override
    public void sacar(double valor) {
         saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    public void sacar(String[] args) {

    }

    public  void depositar(String[] args) {

    }

    public void transferir(String[] args) {

    }

    public  int getAgencia(){
        return agencia;
    }

    public int getNumero(){
        return numero;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void imprimirInfoComuns() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo)); /* operação %2.f cria dois pontos flutuantes*/
    }
}