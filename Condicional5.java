import java.util.Scanner;

public class Condicional5 {
  public static void main(String[] args) {
    double n1, n2;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame el primer numero");
    n1 = obj.nextDouble();
    System.out.println("Dame el segundo numero");
    n2 = obj.nextDouble();
    obj.close();

    if (n1 > n2) {
      System.out.println(n1 + " es mayor que " + n2);
    } else if (n2 > n1) {
      System.out.println(n2 + " es mayor que " + n1);
    } else {
      System.out.println("Los numeros son iguales");
    }
  }
}
