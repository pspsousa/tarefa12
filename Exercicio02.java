package tarefa12;
public class Exercicio02 {
public static long Exercicio02(int numero) {

	// Calcular Fatorial: Escreva um método para calcular o fatorial de um número inteiro positivo passado como parâmetro.


        if (numero < 0) {
            throw new IllegalArgumentException("O número deve ser positivo.");
        }
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        int numeroParaCalcularFatorial = 5;
        long resultado = Exercicio02(numeroParaCalcularFatorial);
        System.out.println("O fatorial de " + numeroParaCalcularFatorial + " é " + resultado);
    }
}
