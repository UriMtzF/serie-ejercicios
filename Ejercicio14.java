import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
    double pProducto, pFinal;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce el precio real del producto");
    pProducto = obj.nextDouble();
    obj.close();

    pFinal = (pProducto * 0.16) + pProducto;

    System.out.println("El precio final del producto es: " + pFinal);
  }
}
