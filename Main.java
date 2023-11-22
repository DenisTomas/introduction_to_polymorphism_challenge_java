public class Main {
    public static void main(String[] args) {
        ControleCalculadora controle = new ControleCalculadora();

        double resultadoSoma = controle.realizarOperacao(10, 5, "+");
        System.out.println("O resultado da soma é: " + resultadoSoma);

        double resultadoSubtracao = controle.realizarOperacao(10, 5, "-");
        System.out.println("O resultado da subtração é: " + resultadoSubtracao);

        double resultadoMultiplicacao = controle.realizarOperacao(10, 5, "*");
        System.out.println("O resultado da multiplicação é: " + resultadoMultiplicacao);

        double resultadoDivisao = controle.realizarOperacao(10, 5, "/");
        System.out.println("O resultado da divisão é: " + resultadoDivisao);
    }
}
