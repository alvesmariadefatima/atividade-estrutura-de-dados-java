public class InsertionSort {
    public static int[] insertionSort(int[] lista) {
        int aux, j;
        for (int i = 1; i < lista.length; i++) {
            aux = lista[i];
            j = i - 1;
            while (j >= 0 && aux < lista[j]) {
                lista[j + 1] = lista[j];
                j--;
            }
            lista[j + 1] = aux;
        }
        return lista;
    }

    public static void main(String[] args) {
        int quantidade = 100000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        insertionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
    }
}
