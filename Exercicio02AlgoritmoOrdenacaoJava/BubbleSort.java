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
    int[] vetor = { 20, 11, 16, 9, 12, 14, 17, 19, 13, 15 };
    BubbleSort b = new BubbleSort();
    b.bubblesort(vetor);

    for (int n : vetor) {
      System.out.println(n);
    }
  }
}