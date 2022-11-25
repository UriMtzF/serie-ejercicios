import java.util.Scanner;

public class SecuencialEjercicio4 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double tempC, tempF;

    System.out.println("Introduce una temperatura en Centigrados");
    tempC = obj.nextDouble();
    obj.close();

    tempF = 32 + ((9 / 5) * tempC);

    System.out.println("La temperatura en grados Centigrados: " + tempC);
    System.out.println("La temperatura en grados Farenheit: " + tempF);
  }
}
