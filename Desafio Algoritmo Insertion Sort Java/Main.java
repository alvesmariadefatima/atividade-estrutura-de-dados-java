package Main;

public class Main {
  private int[] lista;

  public Main(int[] lista) {
    this.lista = lista;
  }

  public static void selectionSort(int lista[]) {
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
  }

  public static int[] insertionSort(int lista[]) {
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

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < lista.length; i++) {
      sb.append(lista[i]);
      if (i != lista.length - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

  public static void main(String[] args) {
    int lista[] = { 0, 7, 4, 5, 3 };
    Main.insertionSort(lista);
    Main m = new Main(lista);
    System.out.println(m.toString());
  }
}
