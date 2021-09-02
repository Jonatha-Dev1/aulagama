package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade, novaIdade;

        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();

        System.out.println("Sua idade é " + idade + " anos");

        novaIdade = idade + 10;
        System.out.println("Dentro de 10 anos você terá " + novaIdade + " anos");

        entrada.close();
    }

}
