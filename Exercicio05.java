package tarefa12;
public class Exercicio05 {
public static String Exercicio05(String input) {

	// Inverter String: Implemente um método que inverta uma string passada como argumento.


        if (input == null) {
            throw new IllegalArgumentException("A string fornecida é nula.");
        }

        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String inverted = Exercicio05(original);

        System.out.println("String original: " + original);
        System.out.println("String invertida: " + inverted);
    }
}