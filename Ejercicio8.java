import java.util.Scanner;

public class Ejercicio8 {
  public static final double PI = 3.14159;

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double r, v;

    System.out.println("Dame el radio de una esfera");
    r = obj.nextDouble();
    obj.close();
    v = (4 * PI * Math.pow(r, 3) / 3);

    System.out.println("El volumen de la esfera de radio " + r + " es: " + v);
  }
}
