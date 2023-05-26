import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BTree<T> {
    private BTNode<T> root; // raiz da arvore

    // Construtor
    BTree() {
        root = null;
    }

    // Getter e Setter para a raiz
    public BTNode<T> getRoot() {return root;}
    public void setRoot(BTNode<T> r) {root = r;}

    // Verificar se arvore esta vazia
    public boolean isEmpty() {
        return root == null;
    }

    // --------------------------------------------------------

    // Numero de nos da arvore
    public int numberNodes() {
        return numberNodes(root);
    }

    private int numberNodes(BTNode<T> n) {
        if (n == null) return 0;
        return 1 + numberNodes(n.getLeft()) + numberNodes(n.getRight());
    }

    // --------------------------------------------------------

    // Altura da arvore
    public int depth() {
        return depth(root);
    }

    private int depth(BTNode<T> n) {
        if (n == null) return -1;
        return 1 + Math.max(depth(n.getLeft()), depth(n.getRight()));
    }

    // --------------------------------------------------------

    // O elemento value esta contido na arvore?
    public boolean contains(T value) {
        return contains(root, value);
    }

    private boolean contains(BTNode<T> n, T value) {
        if (n==null) return false;
        if (n.getValue().equals(value)) return true;
        return contains(n.getLeft(), value) || contains(n.getRight(), value);
    }

    // --------------------------------------------------------

    // Imprimir arvore em PreOrder
    public void printPreOrder() {
        System.out.print("PreOrder:");
        printPreOrder(root);
        System.out.println();
    }

    private void printPreOrder(BTNode<T> n) {
        if (n==null) return;
        System.out.print(" " + n.getValue() );
        printPreOrder(n.getLeft());
        printPreOrder(n.getRight());
    }

    // --------------------------------------------------------

    // Imprimir arvore em InOrder
    public void printInOrder() {
        System.out.print("InOrder:");
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(BTNode<T> n) {
        if (n==null) return;
        printInOrder(n.getLeft());
        System.out.print(" " + n.getValue());
        printInOrder(n.getRight());
    }

    // --------------------------------------------------------

    // Imprimir arvore em PostOrder
    public void printPostOrder() {
        System.out.print("PostOrder:");
        printPostOrder(root);
        System.out.println();
    }

    private void printPostOrder(BTNode<T> n) {
        if (n==null) return;
        printPostOrder(n.getLeft());
        printPostOrder(n.getRight());
        System.out.print(" " + n.getValue());
    }

    // --------------------------------------------------------

    // Imprimir arvore numa visita em largura (usando TAD Fila)
    public void printBFS() {
        System.out.print("BFS:");

        Queue<BTNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            BTNode<T> cur = q.remove();
            if (cur != null) {
                System.out.print(" " + cur.getValue());
                q.add(cur.getLeft());
                q.add(cur.getRight());
            }
        }
        System.out.println();
    }

    // --------------------------------------------------------

    // Imprimir arvore numa visita em profundidade (usando TAD Pilha)
    public void printDFS() {
        System.out.print("DFS:");

        Stack<BTNode> q = new Stack<>();
        q.push(root);
        while (!q.isEmpty()) {
            BTNode<T> cur = q.pop();
            if (cur != null) {
                System.out.print(" " + cur.getValue());
                q.push(cur.getLeft());
                q.push(cur.getRight());
            }
        }
        System.out.println();
    }

}