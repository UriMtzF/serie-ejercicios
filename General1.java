import java.util.Scanner;

public class General1 {
  public static void main(String[] args) {
    int n, m, temp;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce el valor de n");
    n = obj.nextInt();
    System.out.println("Introduce el valor de m");
    m = obj.nextInt();
    obj.close();

    System.out.println("El valor de n es: " + n + ", el valor de m es: " + m);

    temp = n;
    n = m;
    m = temp;

    System.out.println("El valor de n es: " + n + ", el valor de m es: " + m);
  }
}
