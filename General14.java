import java.util.Scanner;

public class General14 {
  public static void main(String[] args) {
    int n;
    boolean isPrime = true;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        isPrime = false;
      }
    }

    if (isPrime) {
      System.out.println("Es un numero primo");
    } else {
      System.out.println("No es un numero primo");
    }
  }
}
