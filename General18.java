import java.util.Scanner;

public class General18 {
  public static void main(String[] args) {
    int n, cTemp,
        pos = 0,
        cMayor = (Integer.MAX_VALUE * -1);

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    int cifras[] = new int[CCifras(n)];

    for (int i = CCifras(n) - 1; i >= 0; i--) {
      cTemp = n % 10;
      cifras[i] = cTemp;
      n = (n - cTemp) / 10;
    }

    for (int i = 0; i < cifras.length; i++) {
      if (cifras[i] > cMayor) {
        cMayor = cifras[i];
        pos = i + 1;
      }
    }

    System.out.println("La cifra mayor es: " + cMayor + ", esta en la posicion " + pos);
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
