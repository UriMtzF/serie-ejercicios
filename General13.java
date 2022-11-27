import java.util.Scanner;

public class General13 {
  public static void main(String[] args) {
    int n,
        fact = 1;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    for (int i = n; i > 0; i--) {
      fact *= i;
    }

    System.out.println("El factorial es: " + fact);
  }
}
