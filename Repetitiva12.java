import java.util.Scanner;

public class Repetitiva12 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero (0 para acabar el programa)");
    n = obj.nextInt();

    while (n != 0) {
      if (n > 0) {
        System.out.println("Es un numero positivo");
      } else {
        System.out.println("Es un numero negativo");
      }
      if (n % 2 == 0) {
        System.out.println("Es un numero par");
      } else {
        System.out.println("Es un numero impar");
      }

      System.out.println("Introduce un numero (0 para acabar el programa)");
      n = obj.nextInt();
    }
    obj.close();
  }
}
