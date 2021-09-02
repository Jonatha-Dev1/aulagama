package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        String nome; // String = texto

        nome = "jonatha";

        // equals - faz diferença maiúscula e minúscula
        // equalsIgnoreCase - não considera maiúsculas ou minúsculas

        // if (nome.equals("Jonatha"))
        if (nome.equalsIgnoreCase("Jonatha")) {
            System.out.println("Olá Jonatha");
        } else {
            System.out.println("Você não é o Jonatha");
        }
    }
}
