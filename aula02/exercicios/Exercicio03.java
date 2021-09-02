package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        // entrada
        System.out.println("Informe o salário atual:");
        salario = entrada.nextDouble();
        
        // processamento
        //novoSalario = salario + salario * 0.25;
        novoSalario = salario * 1.25;

        // saída
        System.out.println("Seu novo salário é " + novoSalario);
        novoSalario = entrada.nextDouble();

        entrada.close();
    }    
}
