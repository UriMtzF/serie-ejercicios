import java.util.Scanner;

public class Condicional2 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");
    n = obj.nextInt();
    obj.close();

    if (n == 0) {
      System.out.println("Es un cero");
    } else if (n > 0) {
      System.out.println("Es positivo");
    } else {
      System.out.println("Es negativo");
    }
  }
}
