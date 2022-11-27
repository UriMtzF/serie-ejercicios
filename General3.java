import java.util.Scanner;

public class General3 {
  public static void main(String[] args) {
    double tempC, tempF;
    String opc;

    Scanner num = new Scanner(System.in);
    System.out.println("Dame una temperatura en Celsius");
    tempC = num.nextDouble();

    tempF = 32 + ((9 / 5) * tempC);

    System.out.println("La temperatura en Farenheit es: " + tempF);
    Scanner obj = new Scanner(System.in);
    System.out.println("Repetir proceso? (s/n)");
    opc = obj.nextLine();

    while (opc == "s") {
      System.out.println("Dame una temperatura en Celsius");
      tempC = num.nextDouble();

      tempF = 32 + ((9 / 5) * tempC);

      System.out.println("La temperatura en Farenheit es: " + tempF);
      System.out.println("Repetir proceso? (s/n)");
      opc = obj.nextLine();
    }
    num.close();
    obj.close();
  }
}