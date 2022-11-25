import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double x, y, z, s, a;

    System.out.println("Dame el valor del primer lado del triángulo");
    x = obj.nextDouble();
    System.out.println("Dame el valor del segundo lado del triángulo");
    y = obj.nextDouble();
    System.out.println("Dame el valor del tercer lado del triángulo");
    z = obj.nextDouble();
    obj.close();
    // Para conocer el area de un triangulo dados sus lados se usa el semiperimetro
    s = (x + y + z) / 2;
    // Se calcula el area
    a = Math.sqrt(s * (s - x) * (s - y) * (s - z));

    System.out.println("El area del triangulo es: " + a);
  }
}
