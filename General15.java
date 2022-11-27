import java.util.Scanner;

public class General15 {
  public static void main(String[] args) {
    int n, cTemp;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    int cifras[] = new int[CCifras(n)];

    for (int i = 0; i < cifras.length; i++) {
      cTemp = n % 10;
      cifras[i] = cTemp;
      n = (n - cTemp) / 10;
    }

    System.out.println("Las cifras son:");
    for (int i = 0; i < cifras.length; i++) {
      System.out.print(cifras[i]);
    }
  }

  static int CCifras(int num) {
    int cifras = 0;
    while (num != 0) {
      num /= 10;
      cifras++;
    }
    return cifras;
  }
}
