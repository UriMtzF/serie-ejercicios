import java.util.Scanner;

public class General9 {
  public static void main(String[] args) {
    int nBinario, lDigit, num,
        nDecimal = 0;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");

    nBinario = obj.nextInt();
    obj.close();

    if (ChechBinary(nBinario)) {
      for (int i = 0; i < NDigitos(nBinario); i++) {
        lDigit = nBinario % 10;
        num = (int) Math.pow(2, i);
        nDecimal = nDecimal + (lDigit * num);
        nBinario /= 10;
      }
      System.out.println("El numero en decimal es " + nDecimal);
    } else {
      System.out.println("El numero no es binario");
    }

  }

  // Revisa si es un binario
  static boolean ChechBinary(int binario) {
    int lDigit;
    boolean isBin = true;

    while (binario > 0) {
      lDigit = binario % 10;
      if (lDigit == 0 || lDigit == 1) {
        binario /= 10;
      } else {
        isBin = false;
        // Si no es binario se asigna cero para cerrar ciclo
        binario = 0;
      }
    }
    return isBin;
  }

  static int NDigitos(int binario) {
    int digitos = 0;
    while (binario > 0) {
      binario /= 10;
      digitos++;
    }
    return digitos;
  }
}
