import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    String nombre;

    System.out.println("Introduce un nombre");
    nombre = obj.nextLine();
    System.out.println("Buenos días " + nombre);
  }
}
