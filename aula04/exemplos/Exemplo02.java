package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int cont = 1;

        // cont++; // pós incremento: soma depois de ter usado a variável
        // ++cont; // pré incremento: soma antes de usar a variável

        // cont--; // subtrai 1 do valor da variável

        System.out.println(cont++); // mostra valor 1, e depois soma 1, ficando cont = 2
        System.out.println(cont); // mostra o valor atual que será 2

        System.out.println(++cont); // primeiro soma 1 na variável, depois mostra o valor 3
        System.out.println(cont); // mostra o valor aual que será 3
    }
}
