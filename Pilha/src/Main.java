public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);
        System.out.println(pilha.pilhaVazia());
        pilha.empilhar(6);
        pilha.empilhar(9);
        System.out.println(pilha.elementoTopo());
        pilha.numeroPar(6);
        pilha.numeroImpar(9);
        pilha.desempilhar();
        System.out.println(pilha.elementoTopo());
    }
}