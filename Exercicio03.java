package tarefa12;
public class Exercicio03 {
public static boolean Exercicio03(String texto) {

	//  Verificar Palíndromo: Desenvolva um método que receba uma string como entrada e retorne verdadeiro se ela for um palíndromo (ou seja, se ela pode ser lida da mesma forma de trás para frente), e falso caso contrário.

        String textoSemEspacos = texto.replaceAll("\\s+", "").toLowerCase();
        
        String textoInvertido = new StringBuilder(textoSemEspacos).reverse().toString();
        return textoSemEspacos.equals(textoInvertido);
    }

    public static void main(String[] args) {
        String textoExemplo = "A base do teto desaba";
        boolean resultado = Exercicio03(textoExemplo);
        System.out.println("É um palíndromo? " + resultado);
    }
}
