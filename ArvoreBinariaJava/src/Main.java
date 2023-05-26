import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler arvore de inteiros em preorder
        Scanner in = new Scanner(System.in);
        BTree<Integer> t = LibTree.readIntTree(in);

        // Escrever resultado de chamada a alguns metodos
        System.out.println("numberNodes = " + t.numberNodes());
        System.out.println("depth = " + t.depth());
        System.out.println("contains(2) = " + t.contains(2));
        System.out.println("contains(3) = " + t.contains(3));

        // Escrever nos da arvore seguindo varias ordens possiveis
        t.printPreOrder();
        t.printInOrder();
        t.printPostOrder();
        t.printBFS();
        t.printDFS();
    }
}