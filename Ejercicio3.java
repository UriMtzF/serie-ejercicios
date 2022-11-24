import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double num;

    System.out.println("Introduce un numero");
    num = obj.nextDouble();

    System.out.println("El doble del numero introducido es: " + num * 2);
    System.out.println("El triple del numero introducido es: " + num * 3);
  }
}
