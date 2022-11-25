import java.util.Scanner;

public class Condicional6 {
  public static void main(String[] args) {
    double n1, n2;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame el primer numero");
    n1 = obj.nextDouble();
    System.out.println("Dame el segundo numero");
    n2 = obj.nextDouble();
    obj.close();

    if ((n1 % 10) == (n2 % 10)) {
      System.out.println("La ultima cifra de los numeros es igual");
    } else {
      System.out.println("La ultima cifra de los numeros no es igual");
    }
  }
}
