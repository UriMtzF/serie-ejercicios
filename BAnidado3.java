public class BAnidado3 {
  public static void main(String[] args) {
    StringBuilder letras = new StringBuilder("ZYXWVUTSRQPONMLKJIHGFEDCBA");

    for (int i = letras.length(); i > 0; i--) {
      System.out.println(letras);
      letras.delete(0, 1);
    }
  }
}
