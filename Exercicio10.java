package tarefa12;
public class Exercicio10 {
public static double Exercicio10(double valor1, double valor2, double valor3, double peso1, double peso2, double peso3) {

	// Calcular Média Ponderada: Escreva uma função que calcule a média ponderada de três valores, onde os pesos são passados como argumentos.

        if (peso1 + peso2 + peso3 != 1) {
            System.out.println("Erro: Os pesos devem somar 1.");
            return -1; // Valor inválido para indicar erro
        }

        double mediaPonderada = (valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3);
        return mediaPonderada;
    }

    public static void main(String[] args) {
        double valor1 = 10;
        double valor2 = 20;
        double valor3 = 30;
        double peso1 = 0.2;
        double peso2 = 0.3;
        double peso3 = 0.5;

        double media = Exercicio10(valor1, valor2, valor3, peso1, peso2, peso3);
        System.out.println("A média ponderada é: " + media);
    }
}