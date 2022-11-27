import java.util.Scanner;

public class General19 {
  public static void main(String[] args) {
    int n, cTemp;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    // Crea arreglo del tamaño a cantidad de cifras
    int cifras[] = new int[CCifras(n)];

    // Introduce los numeros en su posicion
    for (int i = CCifras(n) - 1; i >= 0; i--) {
      cTemp = n % 10;
      cifras[i] = cTemp;
      n = (n - cTemp) / 10;
    }

    // Saca los numeros del arreglo y muestra su nombre
    for (int i = 0; i < cifras.length; i++) {
      switch (cifras[i]) {
        case 0:
          System.out.println(cifras[i] + " - Cero");
          break;
        case 1:
          System.out.println(cifras[i] + " - Uno");
          break;
        case 2:
          System.out.println(cifras[i] + " - Dos");
          break;
        case 3:
          System.out.println(cifras[i] + " - Tres");
          break;
        case 4:
          System.out.println(cifras[i] + " - Cuatro");
          break;
        case 5:
          System.out.println(cifras[i] + " - Cinco");
          break;
        case 6:
          System.out.println(cifras[i] + " - Seis");
          break;
        case 7:
          System.out.println(cifras[i] + " - Siete");
          break;
        case 8:
          System.out.println(cifras[i] + " - Ocho");
          break;
        case 9:
          System.out.println(cifras[i] + " - Nueve");
          break;
      }
    }
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
