package com.company;

/**
 * Classe de exemplo para exercicios da Aula I de Variavéis, Tipos de Dados e Operadores aritméticos
 */
public class Main {


    public static void main(String[] args) {

        int i = 5;
       // int i; mesmo nome de variavle por tanto não pode deixar
        int I; // java é uma linguagem case sensitive por esse motivo pode se criar variavéis com a mesma letra por exemplo porém maiúsculo , o java diferencia
       // int _1a; não se pode nunca começar uma variável com número o "_" é permitido
       // int 1a; como dito acima , nunca se pode começar uma variável com número
        int $aq; // Pode-se começar uma variável com cifrão ou anderline poré, vc está ferindo as Boas Práticas :-|


        i = 0;
        I = 10;
       // _1a = 20;
        $aq = 7;

        final int j = 10; //Variavel final é uma variavel constante  ou seja o "j" sempre terá seu valor 10
       // j = 15; // erro que diz que é impossível mudar o valor da variável "j"
        int asrn24678md;// Definição valida porém não muto usual
       // int asrn246 78md; // erro , nã se pode deixar espaços nas variavéis
        int asrn2$4678_md = 10; // válido porém não é boas práticas de usar o cifrão e o anderline
       // int asrn2$40%78_md = 10; // não pode se inserir caracteres como % , () , não se pode usar poois causará erro

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        int QuantidadeProduto; // Primeira letra da variavel sempre tem que ser miniscúla devido a bos práticas
        final int NUMERO_TENTATIVAS = 5; // regra na classe final tem que ser tudo maiúsculo e separados com o anderline
       // final int numeroTentativas = 5; // a classe final  está sendo desrepeitada devido ao n separamento atrvez do anderline
        int QUANTIDADE_OPCOES = 25;

        System.out.println(i);
        System.out.println(I);
       // System.out.println(_Ia);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
    }
}
