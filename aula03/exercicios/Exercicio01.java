package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero;

        // entrada
        System.out.println("Digite um valor:");
        numero = teclado.nextInt();

        //processamento
        if (numero > 20) {
          //System.out.println("A metade de " + numero + " é " + (numero / 2.0));
          // casting = conversão de tipos, só temporário
          System.out.println("A metade de " + numero + " é " + ((double) numero / 2));
        }

        teclado.close();
    }
}
