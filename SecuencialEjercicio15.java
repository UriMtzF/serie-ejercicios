import java.util.Scanner;

public class SecuencialEjercicio15 {
  public static void main(String[] args) {
    int n, cifrasQuitar, temp;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un número");
    n = obj.nextInt();
    System.out.println("Cuantas cifras a partir de la derecha deseas quitar?");
    cifrasQuitar = obj.nextInt();
    obj.close();

    for (int i = 0; i < cifrasQuitar; i++) {
      temp = n % 10;
      n = (n - temp) / 10;
    }

    System.out.println("La nueva cifra es: " + n);
  }
}
