import java.util.Arrays;

class Main {

  public static int[] selectionsort(int[] lista) {
    int min, aux;
    for (int i = 0; i < lista.length; i++) {
      min = i;
      for (int j = 0; j < lista.length; j++) {
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
    int lista[] = { 6, 3, 4, 2, 5, 1 };
    System.out.println(Arrays.toString(Main.selectionsort(lista)));
  }
}