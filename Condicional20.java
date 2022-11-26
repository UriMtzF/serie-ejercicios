import java.util.Scanner;

public class Condicional20 {
  public static void main(String[] args) {
    float calif;

    Scanner obj = new Scanner(System.in);
    System.out.println("Dame la calificación");
    calif = obj.nextFloat();
    obj.close();

    if (calif <= 5) {
      System.out.println("Reprobado");
    } else if (calif > 5 && calif < 8) {
      System.out.println("Ordinario");
    } else if (calif >= 8) {
      System.out.println("Excentado");
    }
  }
}
