package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma, cont;

        soma = 0;
        cont = 1;
        numero = 1;
        while (numero != 0) { // enquanto o número não for zero
            System.out.printf("Digite o %d° número (0=fim): ", cont++);
            numero = entrada.nextInt();
            soma = soma + numero;
            // cont++;
        }

        System.out.println("A soma dos valores é " + soma);

        cont = 1;
        System.out.printf("Digite o %dº número (0=fim): ", cont++);
        numero = entrada.nextInt();

        soma = 0;
        while (numero != 0) { // enquanto o numero não for zero
            soma = soma + numero;

            System.out.printf("Digite o %dº numero (0=fim): ", cont++);
            numero = entrada.nextInt();            
        }

        System.out.println("A soma dos valores é " + soma);

        entrada.close();
    }
}
