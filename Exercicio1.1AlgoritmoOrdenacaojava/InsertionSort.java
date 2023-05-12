import java.util.Arrays;

class InsertionSort {
  
  public static int[] insertionsort(int[] lista) {
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

  public static void main(String[] args){
    int lista[] = {6, 3, 4, 2, 5, 1};
    System.out.println(Arrays.toString(InsertionSort.insertionsort(lista)));
  }
}
