import java.util.Scanner;

public class Condicional7 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");
    n = obj.nextInt();
    obj.close();

    if (n % 3 == 0 && n % 5 == 0) {
      System.out.println("El numero es multiplo de 3 y 5");
    } else {
      System.out.println("El numero no es multiplo de 3 y 5");
    }
  }
}
