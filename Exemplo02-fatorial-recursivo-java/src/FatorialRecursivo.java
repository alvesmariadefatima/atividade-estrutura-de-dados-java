public class FatorialRecursivo {
    public static void main(String[] args) throws Exception {
        int FatorialRecursivo(int n){
            if (n==1) || (n==0)
                return 1;
            else 
                return FatorialRecursivo(n-1)*n;
        }
    }
}
