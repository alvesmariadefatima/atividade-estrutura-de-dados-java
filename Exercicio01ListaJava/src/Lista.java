public class Lista<T, lista> {
    private No<T> first;
    private int size;

    No lista;
    public Lista() {
        this.first = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void addFirst(T v){
        No<T> newnode = new No<>(v, first);
        this.first = newnode;
        this.size++;

    }

    public void addLast(T v){
        No<T> newnode = new No<>(v, null);
        if (isEmpty()){
            first = newnode;
        }else{
            No<T> cur = first;
            while (cur != cur.getNext()){
                cur = cur.getNext();
            }
            cur.setNext(newnode);
            this.size++;

        }
    }
    public T getFirst(){
        if (isEmpty()){
            return null;
        }else {
            return this.first.getValue();
        }
    }

    public T getLast(){
        if (isEmpty()){
            return null;
        }else{
            No<T> cur = this.first;
            while (cur.getNext() != null){
                cur = cur.getNext();
            }
            return cur.getValue();
        }
    }

    public void removeFirst(){
        if (!isEmpty()){
            this.first = first.getNext();
            this.size--;
        }
    }

    public void removeLast() {
        if (isEmpty())
            return;
        else if (this.size == 1) {
            this.first = null;
        } else {
            No<T> cur = this.first;
            for (int i = 0; i < this.size - 2; i++) {
                cur = cur.getNext();
            }
            cur.setNext(cur.getNext().getNext());
            this.size--;
        }
    }
        public No<T> removerPrimeirosNo(int n) {
            No<T> inicioNo = lista;
            for(int i = 0; i < n && inicioNo != null; i++){
                inicioNo = inicioNo.proximo;
            }
            return inicioNo;
        }
        public No<T> removerPrimeirosNo(No<T> lista, int n){
            if (lista == null || lista.proximo == null) {
                return null;
        }
        if (n >= comprimento(lista)) {
            return null;
        }
        No<T> inicioNo = lista;
        for(int i = 0; i < n && inicioNo != null; i++){
            inicioNo = inicioNo.proximo;
        }
        return inicioNo;
        }
        private int comprimento(No<T> lista) {
        int len = 0;
        while (lista != null) {
            len++;
            lista = lista.proximo;
        }
        return len;
    }

}