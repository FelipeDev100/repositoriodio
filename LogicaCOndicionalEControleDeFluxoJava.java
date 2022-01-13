package com.company;

public class LogicaCOndicionalEControleDeFluxoJava {
   public static void  Main (String[] args) {
       boolean b1 = true;
       boolean b2 = false;
       boolean b3 = true;
       boolean b4 = false;

       System.out.println("b1 && b2" + (b1 && b2)); //conjunção &&
       System.out.println("b1 && b2" + (b1 && b3));

       System.out.println("b2 || b3" + (b1 || b3)); //dijunção ||
       System.out.println("b2 || b4" + (b2 || b4));

       System.out.println("b1 ^ b3" + (b1 ^ b3)); //or ^
       System.out.println("b4 ^ b1" + (b4 ^ b1));

       System.out.println(!b1); //negação
       System.out.println(!b1);

       int i1 = 10;
       int i2 = 5;
       float f1 = 20f;
       float f2 = 50f;

       System.out.println("((i1 + i2) < (f2 - f1)) && true" + (((i1 + i2) <(f2 - f1)) && true));
       System.out.println("((i1 > i2) || (f2 - f1) " + ((i1 > i2) || (f2 < f1)));

       double SalarioMensal = 11893.58d;
       double mediaSalario = 10500d;

       int quantidadedependentes = 4;
       int mediadependentes = 2;

       System.out.println((SalarioMensal < mediaSalario) && (quantidadedependentes >= mediadependentes));

       boolean salarioBaixo = SalarioMensal < mediaSalario;
       boolean muitosDependentes = quantidadedependentes >=mediadependentes;

       System.out.println((salarioBaixo) && (muitosDependentes));

       boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
       System.out.println("recebeAuxilio " + recebeAuxilio);



   }
}
