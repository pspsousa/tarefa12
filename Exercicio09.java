package tarefa12;
public class Exercicio09 {
public static boolean Exercicio09(int a, int b, int c) {

	// Verificar Triângulo: Implemente um método que receba três números inteiros como argumentos e retorne verdadeiro se eles podem ser os comprimentos dos lados de um triângulo, e falso caso contrário.

        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        int lado1 = 3;
        int lado2 = 4;
        int lado3 = 5;

        boolean podeFormarTriangulo = Exercicio09(lado1, lado2, lado3);
        System.out.println("Os lados " + lado1 + ", " + lado2 + " e " + lado3 + " podem formar um triângulo? " + podeFormarTriangulo);
    }
}