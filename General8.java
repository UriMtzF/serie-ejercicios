import java.util.Scanner;

public class General8 {
  public static void main(String[] args) {
    int nDecimal,
        residuo;
    StringBuilder nBinario = new StringBuilder();

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");
    nDecimal = obj.nextInt();
    obj.close();

    while (nDecimal > 0) {
      residuo = nDecimal % 2;
      nDecimal /= 2;
      nBinario.insert(0, String.valueOf(residuo));
    }

    System.out.println("El numero en binario es: " + nBinario);
  }
}
