import java.util.Queue;

public class Fila {

    private Queue<String> fila;
    Object[] vetor;
    String primeiro, ultimo, atual;
    int tamanho;

    Fila() {
        this.primeiro = "";
        this.ultimo = "";
        this.tamanho = tamanho;
    }

    boolean estaVazio() {
        if (this.primeiro.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    boolean estaCheio() {
        if (this.ultimo.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    void enfileira(Object elemento) {
        if (estaCheio()) {
            System.out.println("Fila Cheia!!");
        } else {
            this.vetor[Integer.parseInt(ultimo)] = elemento;
            System.out.println("Elemento Inserido!");
        }
    }

    void desenfileirar() {
        if (estaVazio()) {
            System.out.println("Fila Vazia!!");
        } else {
            this.vetor[Integer.parseInt(primeiro)] = "";
            this.primeiro = "";
            System.out.println("Elemento removido!");
        }
    }

    void imprimir() {

        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.vetor[i]);
        }
    }

    @Override
    public String toString() {
        return "Primeiro da Fila: " + primeiro + "Último da Fila: " + ultimo + "Atual da Fila: " + atual;
    }

    public void primeiroFila() {
        System.out.println(primeiro);
    }

    public void ultimoFila() {
        System.out.println(ultimo);
    }

    public void atualFila() {
        System.out.println(atual);
    }
}

