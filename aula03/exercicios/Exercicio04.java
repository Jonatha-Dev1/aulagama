package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salarioBruto, prestacao, limite;

        System.out.println("Informe o valor do salario bruto:");
        salarioBruto = teclado.nextDouble();
        System.out.println("Informe o valor da prestação:");
        prestacao = teclado.nextDouble();

        limite = salarioBruto * 0.3;

        if (prestacao <= limite) {
            System.out.println("O emprestimo pode ser concedido.");
        } else {
            System.out.println("Não é possível fazer o emprestimo.");
        }

        teclado.close();
    }
}
