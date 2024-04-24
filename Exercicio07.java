package tarefa12;
public class Exercicio07 {
public static boolean Exercicio07(int ano) {

	// Verificar Ano Bissexto: Desenvolva um método que determine se um ano é bissexto ou não.

        if (ano < 0) {
            throw new IllegalArgumentException("O ano deve ser um número positivo.");
        }

        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static void main(String[] args) {
        int ano = 2024;

        try {
            boolean bissexto = Exercicio07(ano);
            if (bissexto) {
                System.out.println(ano + " é um ano bissexto.");
            } else {
                System.out.println(ano + " não é um ano bissexto.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}