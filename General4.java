import java.util.Scanner;

public class General4 {
  public static void main(String[] args) {
    int n,
        i = 1;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame un numero");
    n = obj.nextInt();

    while (i <= 10) {
      System.out.println(n + " x " + i + " = " + n * i);
      i++;
    }
    obj.close();
  }
}
