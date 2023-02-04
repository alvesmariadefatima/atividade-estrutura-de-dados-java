public class sumNumbers {
    public static int main(String[] args) {
         public static int sumNumbers(int n) {
            if (n == 1) {
              return 1;
            }
            return n + sumNumbers(n-1);
          }
    }
}

  
