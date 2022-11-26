import java.util.Scanner;

public class Condicional18 {
  public static void main(String[] args) {
    int h, m, s;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame la hora");
    h = obj.nextInt();
    System.out.println("Dame los minutos");
    m = obj.nextInt();
    System.out.println("Dame los segundos");
    s = obj.nextInt();
    obj.close();

    if ((h >= 0 && h <= 24) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59)) {
      System.out.println("La hora: " + h + ":" + m + ":" + s + " es valida");
    } else {
      System.out.println("La hora no es valida");
    }
  }
}
