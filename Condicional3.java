import java.util.Scanner;

public class Condicional3 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");
    n = obj.nextInt();
    obj.close();

    if (n % 10 == 0) {
      System.out.println("El numero es multiplo de 10");
    } else {
      System.out.println("El numero no es multiplo de 10");
    }
  }
}
