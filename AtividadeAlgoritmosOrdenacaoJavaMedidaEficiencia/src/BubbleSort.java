public class BubbleSort {

    public void bubblesort(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;

                }
            }
        }
    }
            public static void main(String[] args) {
                BubbleSort bubbleSort = new BubbleSort();

                int quantidade = 100000;
                int[] vetor = new int[quantidade];

                for (int i = 0; i < vetor.length; i++) {
                    vetor[i] = (int) (Math.random()*quantidade);
                }

                long tempoInicial = System.currentTimeMillis();

                bubbleSort.bubblesort(vetor);

                long tempoFinal = System.currentTimeMillis();

                System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

                }
            }