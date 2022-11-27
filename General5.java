import java.util.Scanner;

public class General5 {
  public static void main(String[] args) {
    int n,
        opc = 0,
        i = 0;
    Scanner rNum = new Scanner(System.in);
    Scanner rOpc = new Scanner(System.in);

    while (opc == 0) {
      System.out.println("Escribe un numero");
      n = rNum.nextInt();
      if ((n % 10) == 2) {
        i++;
      }
      System.out.println("Escriba 0 si desea continuar");
      opc = rOpc.nextInt();
    }
    rNum.close();
    rOpc.close();
    System.out.println("Escribio " + i + " numeros que acaban en 2");

  }
}
