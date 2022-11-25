import java.util.Scanner;

public class SecuencialEjercicio6 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    double vKm, vM;

    System.out.println("Dame una velocidad en km/h");
    vKm = obj.nextDouble();
    obj.close();

    vM = (vKm * 10) / 36;

    System.out.println(vKm + "km/h son " + vM + " m/s");
  }
}