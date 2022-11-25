import java.util.Scanner;

public class SecuencialEjercicio10 {
  public static void main(String[] args) {
    try (Scanner obj = new Scanner(System.in)) {
      int n, c1, c2, c3;

      System.out.println("Dame un numero");
      n = obj.nextInt();

      c3 = n % 10;
      c2 = ((n % 100) - c3) / 10;
      c1 = (n - ((c2 * 10) + c3)) / 100;

      System.out.println("El numero " + n + " se separa en las cifras " + c1 + " " + c2 + " " + c3);
    }
  }
}
