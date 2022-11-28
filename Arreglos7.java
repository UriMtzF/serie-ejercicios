import java.util.Scanner;

public class Arreglos7 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    do {
      System.out.println("Introduce la cantidad de alturas");
      n = obj.nextInt();
    } while (n <= 0);

    int alturas[] = new int[n];

    for (int i = 0; i < alturas.length; i++) {
      System.out.println("Escribe una altura");
      alturas[i] = obj.nextInt();
    }

    obj.close();

    double promedio = Promedio(alturas);
    int mayor = 0, menor = 0, igual = 0;

    for (int i = 0; i < alturas.length; i++) {
      if (alturas[i] > promedio) {
        mayor++;
      } else if (alturas[i] < promedio) {
        menor++;
      } else if (alturas[i] == promedio) {
        igual++;
      }
    }

    System.out.println("Promedio de altura: " + promedio);
    System.out.println("Mayores al promedio: " + mayor);
    System.out.println("Menores al promedio: " + menor);
    System.out.println("Iguales al promedio: " + igual);
  }

  static double Promedio(int[] n) {
    int suma = 0;
    for (int i = 0; i < n.length; i++) {
      suma += n[i];
    }
    double promedio = suma / n.length;
    return promedio;
  }
}
