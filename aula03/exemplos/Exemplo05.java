package exemplos;


public class Exemplo05 {
    public static void main(String[] args) {
        // % = o resto da divisão
        System.out.println(10 / 2);
        System.out.println(10 % 2);
        System.out.println(11 / 2);
        System.out.println(11 % 2);

        int resto = 10 % 2;

        System.out.println("10 é par? " + (resto == 0));
        System.out.println("11 é par? " + (11 % 2 == 0));
    }
}
