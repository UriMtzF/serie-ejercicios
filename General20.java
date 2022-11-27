import java.util.Scanner;

public class General20 {
  public static void main(String[] args) {
    int n, cTemp, suma = 0;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    // Crea un arreglo del tamaño segun cifras tenga n
    int cifras[] = new int[CCifras(n)];

    // Introduce las cifras en un arreglo
    for (int i = CCifras(n) - 1; i >= 0; i--) {
      cTemp = n % 10;
      cifras[i] = cTemp;
      n = (n - cTemp) / 10;
    }

    for (int i = 0; i < cifras.length; i++) {
      suma += cifras[i];
    }

    System.out.println("La suma de cifras es: " + suma);
  }

  // Cuenta la cantidad de cifras
  static int CCifras(int num) {
    int cifras = 0;
    while (num != 0) {
      num /= 10;
      cifras++;
    }
    return cifras;
  }
}
