import java.util.Scanner;

public class Ejercicio12 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int n, cTemp;
    int cifras[] = new int[5];

    System.out.println("Dame un numero");
    n = obj.nextInt();
    obj.close();

    for (int i = 0; i < cifras.length; i++) {
      cTemp = n % 10;
      cifras[i] = cTemp;
      n = (n - cTemp) / 10;
    }

    System.out.println("Las cifras son:");
    for (int i = 0; i < cifras.length; i++) {
      System.out.print(cifras[i] + " ");
    }
  }
}
