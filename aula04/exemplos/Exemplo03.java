package exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        // printf( FORMATAÇÃO, DADOS ) == print formatado
        // formatação = COMO exibir
        // dados = O QUE exibir

        // caracter de controle: 
        // %d = int 
        // %s = String
        // %f = números com decimal
        // %.2f = números com decimal .2 = 2 casas decimais
        // %2f = número de digitos na parte inteira
        // \n = pula linha

        System.out.printf("sua idade é %d\n" , 28);
        System.out.printf("sua idade é %d e seu telefone é %s\n" , 28, "83-988485274");
        System.out.printf("idade: %d altura: %f peso: %f\n" , 28, 1.83, 79.12345);
        System.out.printf("idade: %d altura: %.2f peso: %.2f\n" , 28, 1.83, 79.12345);
    }
}
