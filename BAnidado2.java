import java.util.Scanner;

public class BAnidado2 {
  public static void main(String[] args) {
    int n, suma = 0;

    Scanner obj = new Scanner(System.in);
    do {
      System.out.println("Introduce un numero");
      n = obj.nextInt();
    } while (n > 12 || n < 0);
    obj.close();

    for (int i = 0; i <= n; i++) {
      int fac = 1;
      for (int j = 1; j <= i; j++) {
        fac *= j;
      }
      suma += fac;
    }
    System.out.println("La suma de factoriales es de " + suma);
  }
}
