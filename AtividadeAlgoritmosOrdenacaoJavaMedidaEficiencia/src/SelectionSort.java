public class SelectionSort {
    public static int[] selectionSort(int[] lista) {
        int min, aux;
        for (int i = 0; i < lista.length; i++) {
            min = i;
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[j] < lista[min]) {
                    min = j;
                }
            }
            aux = lista[min];
            lista[min] = lista[i];
            lista[i] = aux;

        }
        return lista;
    }
    public static void main(String[] args) {

        int quantidade = 100000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random()*quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

        selectionSort(vetor);

        long tempoFinal = System.currentTimeMillis();

        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

        }
    }