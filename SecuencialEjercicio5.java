import java.util.Scanner;

public class SecuencialEjercicio5 {
  public static final double PI = 3.14159;

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double r, p, a;

    System.out.println("Dame el radio de una circunferencia");
    r = obj.nextDouble();
    obj.close();
    p = 2 * r * PI;
    a = PI * r * r;

    System.out.println("El circulo de radio " + r + " tiene un perimetro de " + p + " y un area de " + a);
  }
}
