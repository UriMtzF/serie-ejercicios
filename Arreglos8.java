import java.util.Scanner;

public class Arreglos8 {
  public static void main(String[] args) {
    double salario[] = new double[3];
    String nombre[] = new String[3];

    Scanner num = new Scanner(System.in);
    Scanner text = new Scanner(System.in);
    for (int i = 0; i < salario.length; i++) {
      System.out.println("Introduce nombre del empleado");
      nombre[i] = text.nextLine();
      System.out.println("Introduce el salario");
      salario[i] = num.nextDouble();
    }
    num.close();
    text.close();

    System.out.println(
        "El empleado que más gana es " + nombre[PosNMayor(salario)] + " y gana " + salario[PosNMayor(salario)]);
  }

  static int PosNMayor(double[] n) {
    int nMayorPos = 0;
    for (int i = 0; i < n.length; i++) {
      if (n[i] > nMayorPos) {
        nMayorPos = i;
      }
    }
    return nMayorPos;
  }
}
