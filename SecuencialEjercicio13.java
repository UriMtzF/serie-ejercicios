import java.util.Scanner;
import java.util.stream.IntStream;

public class SecuencialEjercicio13 {
  public static void main(String[] args) {
    int d, m, a, suma, cTemp, nSuerte;
    int cifras[] = new int[4];

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce tu dia de nacimiento");
    d = obj.nextInt();
    System.out.println("Introduce tu mes de nacimiento");
    m = obj.nextInt();
    System.out.println("Introduce tu año de nacimiento");
    a = obj.nextInt();
    obj.close();

    suma = d + m + a;

    for (int i = 0; i < cifras.length; i++) {
      cTemp = suma % 10;
      cifras[i] = cTemp;
      suma = (suma - cTemp) / 10;
    }

    // IntStream.of introduce los datos del arreglo "cifras" a la clase sum() y
    // regresa la suma del stream
    nSuerte = IntStream.of(cifras).sum();

    System.out.println("Tu numero de la suerte es: " + nSuerte);
  }
}
