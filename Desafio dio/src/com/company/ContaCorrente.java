package com.company;

public class ContaCorrente  extends Conta { /*Estou usando  o modo herança de orientação a objeto para dizer que a classe ContaCorrente está herdando o código da classe Conta inclusive os métodos*/
    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoComuns();
    }
}