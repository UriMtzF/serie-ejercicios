import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double catA, catO, hip;

    System.out.println("Dame el valor de un cateto");
    catA = obj.nextDouble();
    System.out.println("Dame el valor del otro cateto");
    catO = obj.nextDouble();
    obj.close();

    hip = Math.sqrt(Math.pow(catA, 2) + Math.pow(catO, 2));
    System.out.println("El valor de la hipotenusa es: " + hip);
  }
}
