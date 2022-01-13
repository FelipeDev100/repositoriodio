package com.company;

public class OperadoresRelacionais {
    private static void main (String [] args){


                int i1 = 10;
                int i2 = 20;

                short s1 = 20000;
                //short s2 = 40000; // tamnho do s2 está ultrapassando e muito o limete do comando short

                //int i1 = -10000000000; //  novamente estavmos ultrapassando  o valor limeite de negativo que o comando inteiro armazena
                //int i2 = 28500;

                long l1 = 1000000000000000000l;
                long l2 = 2004005005000550000l;

                //float f1 = 4.5;// erro causado por falta da letra f na frente do fim do numero , sem a letra f na frente o java le o comando como double , por esse motivo ocorreu o erro
                float f2 =  10.60f;

                double  d1 = 85.69; // quando n inserir nenhuma letra  em alguma variável , o hjava entente automáticamente que  a variável é um ddouble
                double  d2 = 99.04d;

                char c1 = 'f';
                //char c2 = 'Fe'; // O char so usa um caracter
                char c3 = '\u0057'; // código unicode de um determinado caracter  referente a letra W

                String st1 = "Siclano";
                String st2 =  "blablabla";
                // String st3 = " mais um pouco de bla bla bla bla bla bla 35245643120 bla bla !@($&%@$& )!(*$&@";

                boolean b01= true;
                boolean b02 = false;

                System.out.println("i1==i2" + (i1 ==i2));
                System.out.println("i1!=i2" + (i1 !=i2));
                System.out.println("i1>i2" + (i1 >i2));
                System.out.println("i1<=i2" + (i1 <=i2));
    }
}
