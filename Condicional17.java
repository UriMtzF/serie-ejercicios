import java.util.Scanner;

public class Condicional17 {
  public static void main(String[] args) {
    double n1, n2, n3;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame el primer numero");
    n1 = obj.nextDouble();
    System.out.println("Dame el segundo numero");
    n2 = obj.nextDouble();
    System.out.println("Dame el tercer numero");
    n3 = obj.nextDouble();
    obj.close();

    if (n1 > n2 && n1 > n3) {
      System.out.println(n1 + " es el numero mas grande");
    } else if (n2 > n1 && n2 > n3) {
      System.out.println(n2 + " es el numero mas grande");
    } else if (n3 > n1 && n3 > n2) {
      System.out.println(n3 + " es el numero mas grande");
    }
  }
}
