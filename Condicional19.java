import java.util.Scanner;

public class Condicional19 {
  public static void main(String[] args) {
    int m;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame el mes");
    m = obj.nextInt();
    obj.close();

    if ((m >= 1 && m <= 12) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)) {
      System.out.println("El mes tiene 31 dias");
    } else if ((m >= 1 && m <= 12) && (m == 4 || m == 6 || m == 9 || m == 11)) {
      System.out.println("El mes tiene 30 dias");
    } else if ((m >= 1 && m <= 12) && (m == 2)) {
      System.out.println("El mes tiene 28 o 29 dias");
    } else {
      System.out.println("No es un mes valido");
    }
  }
}
