package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double num1, num2;

        System.out.println("Digite 2 numeros:");
        num1 = entrada.nextDouble();
        num2= entrada.nextDouble();

        if (num1 > num2) {
            System.out.println(num1 + ", " + num2);
        } else {
            System.out.println(num2 + ", " + num1);
        }

        entrada.close();
    }
}
