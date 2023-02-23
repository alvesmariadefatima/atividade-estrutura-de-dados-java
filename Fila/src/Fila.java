public class Fila {
    Object[] vetor;
    int primeiro, ultimo, tamanho;

    Fila(int quantidade){
        this.primeiro = 0;
        this.ultimo = 0;
        this.tamanho = 0;
        this.vetor = new Object[quantidade];
    }

    boolean estaVazio(){
        if(this.tamanho == 0){
            return true;
        } else {
            return false;
        }
    }
    boolean estaCheio(){
        if(this.tamanho == this.vetor.length){
            return true;
        } else {
            return false;
        }
    }

    void enfileirar(Object elemento){
        if(estaCheio()){
            System.out.println("Fila Cheia!!!");
        } else {
            this.vetor[ultimo] = elemento;
            this.ultimo = (this.ultimo + 1) % this.vetor.length;
            this.tamanho++;

            System.out.println("Elemento Inserido!!!");
        }
    }

    void desenfileirar(){
        if(estaVazio()){
            System.out.println("Fila Vazia!!!");
        } else {
            this.vetor[primeiro] = null;
            this.primeiro = (this.primeiro + 1) % this.vetor.length;
            this.tamanho--;

            System.out.println("Elemento Removido!!!");
        }
    }

    void imprimir(){
        for(int i = 0; i <= this.vetor.length; i++){
            System.out.println(this.vetor[i]);
        }
    }
}
