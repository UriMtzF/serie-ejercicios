import java.util.Scanner;

public class Condicional8 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");
    n = obj.nextInt();
    obj.close();

    if (n % 3 == 0 || n % 2 == 0) {
      System.out.println("El numero es multiplo de 2 o 3");
    } else {
      System.out.println("El numero no es multiplo de 2 o 3");
    }
  }
}
