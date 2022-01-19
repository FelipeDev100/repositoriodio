package com.company;

public class COntroleDeFluxoJava {
    /** anotações:
     * São estruturas que tem a capacidade de direcionar o fluxo de execução do código
     * Decisão: if, if-else, if-else-if, switch e operador ternário
     * Repetição: for, while, do while
     * Interrupção: break, continue e return
     * Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução
     * Opções de Decisão: if(se), switch(escolha) e operador ternário
     * exemplos usando a decisão , estrutura

     * if(idade>18){
     *
     * }
     *
     * if(aprovado){
     *
     * }else{
     *
     * }
     *
     * if(casado && temFilhos){
     *
     * }else if(casado && semFilhos){
     * }else{
     *
     * }
     *
     * Operador ternário
     * o que delimita quando o operador ternário acaba é o uso de ";" ao final obs(por ser uma estrutura linear, evite ao maximo o uso do operador ternário)
     * condicao ? true :false;
     * condicao ? true: null;
     * ligado ? desligar : ligar;
     * emMovimento ? freia : null;
     *
     * switch
     * variavel     switch (variavel){
     * byte                 case1:
     * short                break;
     * char                 case...:
     * int --mais usados/comuns--      break;
     * enum  --mais usados/comuns--    default:
     * string  --mais usados/comuns--  break;
     *                        }
     *  Boas Práticas
     *  Switch é para valores exatos e if para expresões booleanas
     *  Evitar usar default do switch para "cases genéricos"
     *  Evitar o efeito "flecha" dos if's
     *  Evitar muitos if's aninhados
     *  Usar a boa prática da aula 2 para diminuir o tamanho if usar as variaveis intermediaria
     * */

    public static void main (String [] args) {
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

/**não faça isso , esse é um exemplo de codigo com o efeito flecha :/  */
            private static void  ifFlecha () {
                int mes = 9;
                if (mes == 1) {
                         System.out.println("Janeiro");
                                 } else if (mes == 2) {
                                 System.out.println("Fevereiro");
                                 } else if (mes == 3) {
                                    System.out.println("Março");
  }                              else if (mes == 4) {
                                    System.out.println("Abril");
  }                              else if (mes == 5) {
                                    System.out.println("Maio");
 }                             else if (mes == 6) {
                                         System.out.println("Junho");
 }                                     else if (mes == 7) {
                           System.out.println("Julho");
                                } else if (mes == 8) {
                    System.out.println("Agosto");
                } else if (mes == 9) {
                    System.out.println("Setembro");
                } else if (mes == 10) {
                    System.out.println("Outubro");
                } else if (mes == 11) {
                    System.out.println("Novembro");
                } else if (mes == 12) {
                    System.out.println("Dezembro");
                } else {
                     if  (mes == 12) {
                         System.out.println("Dezembro");


                      }else{
                    System.out.println ("Mês indefinido");
                }

            }
        }
        }

        private static void  ifSemFlecha () {
            int mes = 9;
            if (mes == 1) {
                System.out.println("Janeiro");
            } else if (mes == 2) {
                System.out.println("Fevereiro");
            } else if (mes == 3) {
                System.out.println("Março");
            } else if (mes == 4) {
                System.out.println("Abril");
            } else if (mes == 5) {
                System.out.println("Maio");
            } else if (mes == 6) {
                System.out.println("Junho");
            } else if (mes == 7) {
                System.out.println("Julho");
            } else if (mes == 8) {
                System.out.println("Agosto");
            } else if (mes == 9) {
                System.out.println("Setembro");
            } else if (mes == 10) {
                System.out.println("Outubro");
            } else if (mes == 11) {
                System.out.println("Novembro");
            } else if (mes == 12) {
                System.out.println("Dezembro");
            }
            //  }else if  (mes == 12){
            //  System.out.println("Dezembro");
            // }else{
            //    System.out.println ("Mês indefinido");
            //}
    }
/** nesse caso não dse deve usar o if , nesse caso a melhor opção era o switch , pois temos um valor exato*/

        private static void ifFerias () {

        String mes = "Julho";
        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Ferias");
        }
    }

         private  void static void ifMenor() {
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionários deve receber auxilio.");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionários deve receber auxílio.");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio) {
            System.out.println("Funcionário deve receber auxílio.");
        } else {
            System.out.println("Funcionários não deve receber auxílio.");
        }
    }
        private static void switchSemana() {
            String dia = "terça";
            switch (dia) {
                case "Segunda":
                    System.out.println(2);
                    break;
                case "Terça":
                    System.out.println(3);
                    break;
                case "Quarta":
                    System.out.println(4);
                    break;
                case "Quinta":
                    System.out.println(5);
                    break;
                case "Sexta":
                    System.out.println(6);
                    break;
                case "Sábado":
                    System.out.println(7);
                    break;
                case "Domingo":
                       System.out.println(1);
                     break;
                default:
                //    System.out.println(1);
                      System.out.println("Dia inválido");
                    break;

            }
        }

        private static void switchNumero(){
        int numero = 4;
        switch(numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;

        }
    }

    private static void switchFerias(){
        String mes = "Dezembro";
        switch (mes){
            case "Dezenmbro":
            case "Julho":
            case "Janeiro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Mês Indefinido");
                break;
        }
    }
}



