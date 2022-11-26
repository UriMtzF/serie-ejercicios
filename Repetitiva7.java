import java.util.Scanner;

public class Repetitiva7 {
  public static void main(String[] args) {
    int n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce un numero");
    n = obj.nextInt();
    obj.close();

    System.out.println("Por ciclo while");
    int i = 1;
    while (i <= n) {
      System.out.println(i);
      i++;
    }

    System.out.println("Por ciclo do-while");
    i = 1;
    do {
      System.out.println(i);
      i++;
    } while (i <= n);

    System.out.println("Por ciclo for");
    i = 1;
    for (i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }
}
