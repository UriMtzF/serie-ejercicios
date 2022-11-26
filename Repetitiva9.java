import java.util.Scanner;

public class Repetitiva9 {
  public static void main(String[] args) {
    int n, m;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce el primer numero");
    n = obj.nextInt();
    System.out.println("Introduce el segundo numero");
    m = obj.nextInt();
    obj.close();

    while (n <= m) {
      System.out.println(n);
      n++;
    }
  }
}
