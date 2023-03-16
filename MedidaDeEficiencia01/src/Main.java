class Main {
  public static void main(String[] args) {
    Fila fila = new Fila(3);

    // set valores para primeiro, ultimo e atual
    fila.setPrimeiro("Joana");
    fila.setUltimo("Marcela");
    fila.setAtual("Juliana");

    // imprime os valores usando os métodos get
    System.out.println("Primeiro da fila de espera do banco: " + fila.getPrimeiro());
    System.out.println("Último da fila de espera do banco: " + fila.getUltimo());
    System.out.println("Atual da fila de espera do banco: " + fila.getAtual());
  }
}
