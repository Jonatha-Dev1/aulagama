package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int limite, cont;


        System.out.println("Informe o valor limite:");
        limite = entrada.nextInt();
        entrada.close();

        /* SOLUÇÃO 1*/
        System.out.println();

        cont = 1;
        while (cont <= limite) {
            if (cont <= limite / 2) { // se não for o ultimo numero
                System.out.print(cont + ", ");
            } else {
                System.out.print(cont);
            }
            cont *= 2; // cont = cont * 2;
        }

        /* SOLUÇÃO 2*/
        System.out.println();

        cont = 1;
        while (cont <= limite) {
            System.out.print(cont);
            if (cont <= limite / 2) { // se não for o ultimo numero
                System.out.print(", ");
            }
            cont *= 2; // cont = cont * 2;
        }

        /* SOLUÇÃO 3*/
        System.out.println();

        cont = 1;
        while (cont <= limite / 2) { // para o laço no penultimo número
            System.out.print(cont + ", ");
            cont *= 2; // cont = cont * 2;
        }
        System.out.print(cont); // exibe o último número sem a virgula

        /* SOLUÇÃO 4*/
        System.out.println();

        System.out.print(1);
        cont = 2;
        while (cont <= limite) {
            System.out.print(", " + cont);
            cont *= 2; // 1, 2, 4, 8, 16 etc...
        }
    }
}

/* 
print = escreve e para
println = escreve a vai para a próxima linha
printf = print com formatação de saída */