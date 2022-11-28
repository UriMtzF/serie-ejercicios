import java.util.Scanner;

public class Arreglos2 {
  public static void main(String[] args) {
    int prom, suma = 0;
    int n[] = new int[10];

    Scanner obj = new Scanner(System.in);
    for (int i = 0; i < n.length; i++) {
      System.out.println("Introduce un numero");
      n[i] = obj.nextInt();
    }
    obj.close();

    for (int i = 0; i < n.length; i++) {
      if (i % 2 == 0 || i == 0) {
        suma += n[i];
      }
    }

    prom = suma / 5;

    System.out.println("El promedio es: " + prom);
  }
}
