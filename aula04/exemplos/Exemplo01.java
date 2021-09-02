package exemplos;


public class Exemplo01 {
    public static void main(String[] args) {
        int cont;

        cont = 1; // ponto de inicio

        while (cont <= 10) {
            System.out.println(cont);
            //cont++; // soma 1 na variável
            // cont += 1; 
            cont = cont + 1;
        }

        System.out.println("final: " + cont);
    }
    
}