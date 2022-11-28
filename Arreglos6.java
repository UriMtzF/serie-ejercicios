import java.util.Scanner;

public class Arreglos6 {
  public static void main(String[] args) {
    int n[] = new int[10];

    Scanner obj = new Scanner(System.in);
    for (int i = 0; i < n.length; i++) {
      System.out.println("Escribe un numero");
      n[i] = obj.nextInt();
    }
    obj.close();

    int nPos[] = new int[CCifras(n)[2]];
    int nCero[] = new int[CCifras(n)[1]];
    int nNeg[] = new int[CCifras(n)[1]];

    for (int i = 0; i < n.length; i++) {
      if (n[i] > 0) {
        for (int j = 0; j < nPos.length; j++) {
          nPos[j] = n[i];
        }
      } else if (n[i] == 0) {
        for (int j = 0; j < nCero.length; j++) {
          nCero[j] = n[i];
        }
      } else if (n[i] < 0) {
        for (int j = 0; j < nNeg.length; j++) {
          nNeg[j] = n[i];
        }
      }
    }

    if (nPos.length == 0) {
      System.out.println("No introdujiste positivos");
    } else {
      System.out.println("El promedio de los numeros positivos es: " + Promedio(nPos));
    }

    if (nNeg.length == 0) {
      System.out.println("No introdujiste negativos");
    } else {
      System.out.println("El promedio de los numeros negativos es: " + Promedio(nNeg));
    }

    System.out.println("Introduciste " + nCero.length + " ceros");
  }

  static int[] CCifras(int[] n) {
    int pos = 0,
        cero = 0,
        neg = 0;
    for (int i = 0; i < n.length; i++) {
      if (n[i] > 0) {
        pos++;
      } else if (n[i] == 0) {
        cero++;
      } else if (n[i] < 0) {
        neg++;
      }
    }
    int contador[] = new int[3];
    contador[0] = neg;
    contador[1] = cero;
    contador[2] = pos;
    return contador;
  }

  static double Promedio(int[] n) {
    int suma = 0;
    double promedio = 0;
    for (int i = 0; i < n.length; i++) {
      suma += n[i];
    }
    promedio = suma / n.length;
    return promedio;
  }
}