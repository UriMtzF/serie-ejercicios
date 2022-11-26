import java.util.Scanner;

public class Repetitiva11 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println(i + " es un multiplo de " + n);
      }
    }
  }
}
