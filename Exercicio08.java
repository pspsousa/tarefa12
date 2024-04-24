package tarefa12;
public class Exercicio08 {
public static double Exercicio08(double base, int expoente) {

	// Calcular Potência: Crie uma função que calcule a potência de um número inteiro base elevado a um expoente inteiro positivo.

        if (expoente < 0) {
            throw new IllegalArgumentException("O expoente deve ser um número inteiro positivo.");
        }

        double resultado = 1;
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        double base = 2.0;
        int expoente = 3;

        try {
            double potencia = Exercicio08(base, expoente);
            System.out.println("A potência de " + base + " elevado a " + expoente + " é igual a " + potencia);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}