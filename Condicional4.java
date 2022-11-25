import java.util.Scanner;

public class Condicional4 {
  public static void main(String[] args) {
    double n1, n2;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame el primer numero");
    n1 = obj.nextDouble();
    System.out.println("Dame el segundo numero");
    n2 = obj.nextDouble();
    obj.close();

    if (n1 == n2) {
      System.out.println("Ambos numero son iguales");
    } else {
      System.out.println("Los numeros no son iguales");
    }
  }
}
