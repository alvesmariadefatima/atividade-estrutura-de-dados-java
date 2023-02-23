public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.enfileirar("Maria");
        fila.enfileirar("João");
        fila.enfileirar("Yana");
        fila.enfileirar("Guilherme");
        fila.desenfileirar();
        fila.enfileirar("Ulpio");
        fila.imprimir();
    }
}