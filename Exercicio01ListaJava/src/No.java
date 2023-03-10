public class No<T> {
    public No<T> proximo;
    private T value;
    private No<T> next;

    No(T value, No<T> next){
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public No<T> getNext() {
        return next;
    }

    public void setNext(No<T> next) {
        this.next = next;
    }
}
