public class ShellSort {

    public void shellsort(int[] vetor) {
        int h = 1;
        int tamanho = vetor.length;

        while (h < tamanho) {
            h = h * 3 + 1;
        }
        h = h / 3;
        int aux, j;
        while (h > 0) {
            for (int i = h; i < tamanho; i++) {
                aux = vetor[i];
                j = i;
                while (j >= h && vetor[j - h] > aux) {
                    vetor[j] = vetor[j - h];
                    j = j - h;
                }
                vetor[j] = aux;
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        ShellSort shellsort = new ShellSort();

        int quantidade = 100000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        shellsort.shellsort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
    }
}