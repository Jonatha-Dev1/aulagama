package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        // int cont;

        for (int cont = 1; cont < 5; cont++) { //variável cont é LOCAL ao for
            System.out.println(cont);
        }

        //System.out.println("final: " + cont); // variável cont não é reconhecida
    }
}
