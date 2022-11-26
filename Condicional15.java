import java.util.Scanner;

public class Condicional15 {
  public static void main(String[] args) {
    double n1, n2, r;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame el primer numero");
    n1 = obj.nextDouble();
    System.out.println("Dame el segundo numero");
    n2 = obj.nextDouble();
    obj.close();

    if (n2 == 0) {
      System.out.println("La division entre cero no esta definida");
    } else {
      r = n1 / n2;
      System.out.println("El resultado es: " + r);
    }
  }
}
