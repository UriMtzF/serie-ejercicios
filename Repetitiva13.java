import java.util.Scanner;

public class Repetitiva13 {
  public static void main(String[] args) {
    double mill, km;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce la distancia en millas (Escribe -1 para acabar)");
    mill = obj.nextDouble();

    while (mill != -1) {
      km = mill * 1.609344;
      System.out.println(mill + " millas, son " + km + " km");
      System.out.println("Introduce la distancia en millas (Escribe -1 para acabar)");
      mill = obj.nextDouble();
    }

    obj.close();
  }
}
