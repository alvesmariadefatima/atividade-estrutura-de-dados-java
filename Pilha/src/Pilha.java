public class Pilha {

    int topo;
    int tamanho;
    Object vetor[];

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.topo = -1;
        this.vetor = new Object[tamanho];
    }

    public boolean pilhaCheia() {
        if (this.topo >= tamanho) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pilhaVazia() {
        if (this.topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    void empilhar(Object elemento) {
        if (!pilhaCheia()) {
            this.topo = this.topo + 1;
            this.vetor[topo] = elemento;
        } else {
            System.out.println("Pilha cheia!!");
        }
    }

    public void numeroPar(int numeroPar) {
        if (numeroPar % 2 == 0) {
            System.out.println("Número Par!!!");
        }
    }
    public void numeroImpar(int numeroImpar){
        if(numeroImpar %2 != 0){
            System.out.println("Número Ímpar!!!");
        }
    }
        void desempilhar(){
            Object desempilhado = null;
            if (pilhaVazia()) {
                System.out.println("Pilha vazia!!");
            } else {
                desempilhado = this.vetor[topo];
                this.vetor[topo] = null;
                this.topo = this.topo - 1;
                System.out.println("Elemento removido!" + desempilhado);
            }
        }

        public Object elementoTopo () {
            if (pilhaVazia()) {
                return null;
            } else {
                return this.vetor[topo];
            }
        }
    }

