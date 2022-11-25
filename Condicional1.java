import java.util.Scanner;

public class Condicional1 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");
    n = obj.nextInt();
    obj.close();

    if (n % 2 == 0) {
      System.out.println("El numero es par");
    } else {
      System.out.println("El numero es impar");
    }
  }
}
