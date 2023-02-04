public class mdcRecursivo {
        public static int mdcRecursivo(int m, int n){
            int r = m % n;

            if(r == 0){
                return n;
            }
            return mdcRecursivo(n, r);
        }
    }
