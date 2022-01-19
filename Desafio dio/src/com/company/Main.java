package com.company;

public class Main {

    public static void main(String[] args) {
      Conta cc = new ContaCorrente();
      Conta poup = new ContaPoup();

        cc.depositar(100);
        cc.transferir(100, poup);

        cc.imprimirExtrato();
        poup.imprimirExtrato();
    }
}
