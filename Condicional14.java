import java.util.Scanner;

public class Condicional14 {
  public static void main(String[] args) {
    int n, c1, c3;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero de 3 cifras");
    n = obj.nextInt();
    obj.close();

    c3 = n % 10;
    c1 = n / 100;

    if (c1 == c3) {
      System.out.println("El numero es capicua");
    } else {
      System.out.println("El numero no es capicua");
    }
  }
}
