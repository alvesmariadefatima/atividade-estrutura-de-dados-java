public class fibIterativo {
    public static void main(String[] args) {
        int fibIte(int n){
            if(n == 0 || n == 1)
                return n;
            else
                int aux1 = 0, aux2 = 1;
                int fib;

        for(int i = 1; i < n; i++){
            fib = aux2 + aux1;
            aux1 = aux2;
            aux2 = fib;
            }   
        return fib;
    }
}