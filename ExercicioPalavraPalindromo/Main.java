import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite uma palavra: ");
    String palavraPalindromo = entrada.nextLine();

    String palindromo = "";

    for (int i = palavraPalindromo.length() - 1; i >= 0; i--) {
      palindromo += palavraPalindromo.charAt(i);

      if (palindromo.equals(palavraPalindromo)) {
        System.out.println("Essa palavra é um palíndromo!!!" + "/n" + palindromo);
      } else {
        System.out.println("Essa palavra não é um palíndromo!!!" + "/n" + palindromo);
      }
      entrada.close();
    }
  }
}
