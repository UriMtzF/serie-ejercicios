import java.util.Scanner;

public class Repetitiva15 {
  public static void main(String[] args) {
    char n;
    int i = 0;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero (Escribe cualquier letra para acabar)");
    n = obj.next().charAt(0);

    while (!Character.isLetter(n)) {
      if (Character.getNumericValue(n) > 0) {
        i++;
      }
      System.out.println("Introduce un numero (Escribe cualquier letra para acabar)");
      n = obj.next().charAt(0);
    }

    obj.close();
    System.out.println("Se escribieron " + i + " numeros enteros");
  }
}
