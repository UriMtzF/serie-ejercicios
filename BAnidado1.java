import java.util.Scanner;

public class BAnidado1 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    do {
      System.out.println("Introduce un numero");
      n = obj.nextInt();
    } while (n > 13 || n < 0);
    obj.close();

    for (int i = 0; i <= n; i++) {
      int fac = 1;
      for (int j = 1; j <= i; j++) {
        fac *= j;
      }
      System.out.println("El factorial de " + i + " es: " + fac);
    }
  }
}
