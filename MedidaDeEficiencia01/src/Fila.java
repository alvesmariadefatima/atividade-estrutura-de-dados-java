import java.util.Queue;

public class Fila {

    private Queue<String> fila;
    private Object[] vetor;
    private String primeiro, ultimo, atual;
    private int tamanho;

    Fila(int tamanho) {
        this.primeiro = "";
        this.ultimo = "";
        this.tamanho = tamanho;
        this.vetor = new Object[tamanho];
    }

    boolean estaVazio() {
        if (this.primeiro.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    boolean estaCheio() {
        if (this.ultimo.equals("")) {
            return false;
        } else {
            return true;
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
        return "Primeiro da fila de espera do banco: " + primeiro + "Último da Fila de espera do banco: " + ultimo + "Atual da Fila de espera do banco: " + atual;
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

    public String getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(String primeiro) {
        this.primeiro = primeiro;
    }

    public String getUltimo() {
        return ultimo;
    }

    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }

    public String getAtual() {
        return atual;
    }

    public void setAtual(String atual) {
        this.atual = atual;
    }

    public Object[] getVetor() {

        return vetor;
    }

    public void setVetor(Object[] vetor) {
        this.vetor = vetor;
    }
}
