import java.util.Scanner;

public class Arreglos5 {
  public static void main(String[] args) {
    int pos = 0, neg = 0, cero = 0;
    int n[] = new int[10];

    Scanner obj = new Scanner(System.in);
    for (int i = 0; i < n.length; i++) {
      System.out.println("Escribe un numero");
      n[i] = obj.nextInt();
    }
    obj.close();

    for (int i = 0; i < n.length; i++) {
      if (n[i] > 0) {
        pos++;
      } else if (n[i] == 0) {
        cero++;
      } else if (n[i] < 0) {
        neg++;
      }
    }
    System.out.println("Escribiste " + neg + " negativos, " + cero + " ceros y " + pos + " positivos");
  }
}
