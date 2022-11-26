import java.util.Scanner;

public class Condicional13 {
  public static void main(String[] args) {
    int y;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un año");
    y = obj.nextInt();
    obj.close();

    if (y % 4 == 0) {
      System.out.println("El año es bisiesto");
    } else {
      System.out.println("El año no es bisiesto");
    }
  }
}
