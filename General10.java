import java.util.Scanner;

public class General10 {
  public static void main(String[] args) {
    int u, d, c, m, n;
    StringBuilder nRomano = new StringBuilder();

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    if (n > 3999) {
      System.out.println("Fuera de rango");
    }

    u = n % 10;
    d = ((n % 100) - u) / 10;
    c = ((n % 1000) - (d * 10 + u)) / 100;
    m = ((n % 10000) - ((c * 100) + (d * 10) + u)) / 1000;

    switch (u) {
      case 1:
        nRomano.insert(0, "I");
        break;
      case 2:
        nRomano.insert(0, "II");
        break;
      case 3:
        nRomano.insert(0, "III");
        break;
      case 4:
        nRomano.insert(0, "IV");
        break;
      case 5:
        nRomano.insert(0, "V");
        break;
      case 6:
        nRomano.insert(0, "VI");
        break;
      case 7:
        nRomano.insert(0, "VII");
        break;
      case 8:
        nRomano.insert(0, "VIII");
        break;
      case 9:
        nRomano.insert(0, "IX");
        break;
      case 0:
        nRomano.insert(0, "");
        break;
    }

    switch (d) {
      case 1:
        nRomano.insert(0, "X");
        break;
      case 2:
        nRomano.insert(0, "XX");
        break;
      case 3:
        nRomano.insert(0, "XXX");
        break;
      case 4:
        nRomano.insert(0, "XL");
        break;
      case 5:
        nRomano.insert(0, "L");
        break;
      case 6:
        nRomano.insert(0, "LX");
        break;
      case 7:
        nRomano.insert(0, "LXX");
        break;
      case 8:
        nRomano.insert(0, "LXXX");
        break;
      case 9:
        nRomano.insert(0, "XC");
        break;
      case 0:
        nRomano.insert(0, "");
        break;
    }

    switch (c) {
      case 1:
        nRomano.insert(0, "C");
        break;
      case 2:
        nRomano.insert(0, "CC");
        break;
      case 3:
        nRomano.insert(0, "CCC");
        break;
      case 4:
        nRomano.insert(0, "CD");
        break;
      case 5:
        nRomano.insert(0, "D");
        break;
      case 6:
        nRomano.insert(0, "DC");
        break;
      case 7:
        nRomano.insert(0, "DCC");
        break;
      case 8:
        nRomano.insert(0, "DCCC");
        break;
      case 9:
        nRomano.insert(0, "CM");
        break;
      case 0:
        nRomano.insert(0, "");
        break;
    }

    switch (m) {
      case 1:
        nRomano.insert(0, "M");
        break;
      case 2:
        nRomano.insert(0, "MM");
        break;
      case 3:
        nRomano.insert(0, "MMM");
        break;
      case 0:
        nRomano.insert(0, "");
        break;
    }

    System.out.println("El numero es: " + nRomano);
  }
}
