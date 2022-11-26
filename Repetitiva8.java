import java.util.Scanner;

public class Repetitiva8 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    System.out.println("Por ciclo while");
    int i = n;
    while (i > 0) {
      System.out.println(i);
      i--;
    }

    System.out.println("Por ciclo do-while");
    i = n;
    do {
      System.out.println(i);
      i--;
    } while (i > 0);

    System.out.println("Por ciclo for");
    i = n;
    for (i = n; i > 0; i--) {
      System.out.println(i);
    }
  }
}
