import java.util.Scanner;

public class General7 {
  public static void main(String[] args) {
    int f = 0,
        t1 = 1,
        t2,
        n;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");
    n = obj.nextInt();
    obj.close();

    for (int i = 1; i < n; i++) {
      t2 = f;
      f = t1 + f;
      t1 = t2;
      System.out.println(t1);
    }
  }
}
