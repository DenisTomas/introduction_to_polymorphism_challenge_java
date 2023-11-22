public class ControleCalculadora {
    public double realizarOperacao(double num1, double num2, String operacao) {
        Calculadora calculadora = null;
        switch (operacao) {
            case "+":
                calculadora = new Soma();
                break;
            case "-":
                calculadora = new Subtracao();
                break;
            case "*":
                calculadora = new Multiplicacao();
                break;
            case "/":
                calculadora = new Divisao();
                break;
            default:
                throw new IllegalArgumentException("Operação Inválida");
        }
        return calculadora.calcular(num1, num2);
    }
}
