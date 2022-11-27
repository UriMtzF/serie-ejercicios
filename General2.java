import java.util.Scanner;

public class General2 {
  public static void main(String[] args) {
    int n,
        i = 0;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero entero");
    n = obj.nextInt();
    obj.close();

    while (n != 0) {
      n = (n - (n % 10)) / 10;
      i++;
    }

    System.out.println("El numero tiene " + i + " cifras");
  }
}
