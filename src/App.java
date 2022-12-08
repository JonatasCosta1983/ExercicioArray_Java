import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leituraDePosicoes = new Scanner(System.in);

        System.out.println("Quantos elementos você quer no seu vetor?");
        int numeroDeposicoes = leituraDePosicoes.nextInt();

        int[] vetor = new int[numeroDeposicoes];

        for (int i = 0; i < numeroDeposicoes; i++) {
            System.out.println("Digite o elemento:");
            vetor[i] = leituraDePosicoes.nextInt();
        }
        int posicao = 0;

        System.out.println("Posição no vetor" + "-" + posicao++ + "- elemento" + "=" + vetor[0]);
        System.out.println("Posição no vetor" + "-" + posicao++ + "- elemento" + "=" + vetor[1]);
        System.out.println("Posição no vetor" + "-" + posicao++ + "- elemento" + "=" + vetor[2]);

        leituraDePosicoes.close();
    }
}
