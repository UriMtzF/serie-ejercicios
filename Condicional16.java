import java.util.Scanner;

public class Condicional16 {
  public static void main(String[] args) {
    double n1, n2, r;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame el primer numero");
    n1 = obj.nextDouble();
    System.out.println("Dame el segundo numero");
    n2 = obj.nextDouble();
    obj.close();

    if (n1 < n2) {
      if (n1 == 0) {
        System.out.println("La division entre cero no esta definida");
      } else {
        r = n2 / n1;
        System.out.println("La division de " + n2 + " entre " + n1 + " es: " + r);
      }
    } else if (n1 > n2) {
      if (n2 == 0) {
        System.out.println("La division entre cero no esta definida");
      } else {
        r = n1 / n2;
        System.out.println("La division de " + n1 + " entre " + n2 + " es: " + r);
      }
    }
  }
}
