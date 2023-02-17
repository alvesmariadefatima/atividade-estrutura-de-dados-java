import java.util.Stack;

public class verificarExpressao {

  public static boolean verificarExpressao(String expressao) {
    Stack<Character> pilha = new Stack<Character>();

    for (int i = 0; i < expressao.length(); i++) {
      char c = expressao.charAt(i);
      if (c == '(') {
        pilha.push(c);
      } else if (c == ')') {
        if (pilha.isEmpty() || pilha.pop() != '(') {
          return false;
        }
      }
    }

    return pilha.isEmpty();
  }

  public static void main(String[] args) {
    String expressao1 = "((8+5)*7)";
    String expressao2 = "((8+5)*7";
    String expressao3 = ")(8+5)*7(";

    if (verificarExpressao(expressao1)) {
      System.out.println(expressao1 + " está com a parametrização correta.");
    } else {
      System.out.println(expressao1 + " está com a parametrização incorreta.");
    }

    if (verificarExpressao(expressao2)) {
      System.out.println(expressao2 + " está com a parametrização correta.");
    } else {
      System.out.println(expressao2 + " está com a parametrização incorreta.");
    }

    if (verificarExpressao(expressao3)) {
      System.out.println(expressao3 + " está com a parametrização correta.");
    } else {
      System.out.println(expressao3 + " está com a parametrização incorreta.");
    }
  }
}
