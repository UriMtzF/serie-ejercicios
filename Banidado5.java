import java.util.Scanner;

public class Banidado5 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    do {
      System.out.println("Introduce un numero");
      n = obj.nextInt();
    } while (n <= 0);
    obj.close();

    for (int i = 2; i < n; i++) {
      if (CheckPrime(i)) {
        System.out.println(i);
      }
    }
  }

  static boolean CheckPrime(int n) {
    boolean isPrime = true;
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }
}
