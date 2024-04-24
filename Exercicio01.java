package tarefa12;
public class Exercicio01 {
public static boolean Exercicio01(int numero) {

	// Verificar Número Primo: Crie um método que receba um número inteiro como argumento e retorne verdadeiro se o número for primo, e falso caso contrário


        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numeroParaVerificar = 17;
        System.out.println(numeroParaVerificar + " é primo: " + Exercicio01(numeroParaVerificar));
    }
}
