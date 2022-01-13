package com.company;

public class LaçosDeRepetição {

    public static void main(String[] args){
        int[] idades = new int [10]; //quero criar um array de 10 possições// // 2*não se define a quantidade
        idades[0] = 27;
        idades[1] = 31;
        System.out.println("Idade 0: " + idades[0]);
        System.out.println("Idade 1: " + idades[1]);
        System.out.println("Idade 2: " + idades[2]); //a dois n foi inicializada ela vai exibir o valor o , como n foi definida ela assume o valor int que vai ser 0

        int[] i = {10,25}; //2*toda vez que se usa os elementos
        System.out.println("i 0: " + i[0]);
        System.out.println("i 1: " + i[1]);

        int[] k = new int[] {1,2,3};
        System.out.println("k 0: " + k[0]);
        System.out.println("k 1: " + k[1]);
        System.out.println("k 2: " + k[2]);

        int[] j = new int[2];
        System.out.println("j 0: " + j[1]);

        idades= new int[] {12,35,45,22,9,37,51,61}; // for each
        for (int idade: idades) { //estou solicitando que o for dentro do array idade , percorrá ele e coloquye cada um de seus elementos dentro da variavel idade  inteira
            System.out.println("Idade: " + idade);
        }
//           inicio    //controle         //fim
        for(int a = 0; a < idades.length; a++) { // for classico
            int idade = idades[a];
            System.out.println("Idade " + idade);
        } // for each

        for (int idade: idades) {
            if (idade >=10 ){
                System.out.println("Idade " + idade + "maior que 18 anos");
            }
        }
        for (int a = 0; a < idades.length; a++) {
            int idade = idades[a];
            if(idade >= 18) {
                System.out.println("Idade " + idade + "maior que  18 anos")
            }
        }
    }
}
