package tarefa12;
public class Exercicio06 {
public static int Exercicio06(String input) {

	// Contar Vogais: Escreva uma função que conte o número de vogais em uma string.


        if (input == null) {
            throw new IllegalArgumentException("A string fornecida é nula.");
        }

        int count = 0;
        String vowels = "AEIOUaeiou";

        for (char c : input.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String text = "Hello, World!";
        int vowelCount = Exercicio06(text);

        System.out.println("Texto: " + text);
        System.out.println("Número de vogais: " + vowelCount);
    }
}