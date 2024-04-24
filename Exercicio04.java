package tarefa12;
public class Exercicio04 {
public static double Exercicio04(double[] numeros) {

	//Calcular Média: Crie uma função que calcule a média de uma lista de números passada como parâmetro.

        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("A lista de números está vazia ou é nula.");
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.length;
    }

    public static void main(String[] args) {
        double[] numeros = {10.5, 20.0, 15.3, 7.8, 12.6};

        try {
            double media = Exercicio04(numeros);
            System.out.println("A média dos números fornecidos é: " + media);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}