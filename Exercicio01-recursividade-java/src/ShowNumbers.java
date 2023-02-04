public class ShowNumbers {
    public static void showNumbers(int i) {
      if (i == 0) {
        System.out.println(i);
        return;
        }
      System.out.println(i);
      showNumbers(i-1);
        }
    }




  