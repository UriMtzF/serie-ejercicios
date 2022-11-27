import java.util.Scanner;

public class General17 {
  public static void main(String[] args) {
    int cNum;
    double numTemp,
        numMayor = (Double.MAX_VALUE * -1);

    Scanner obj = new Scanner(System.in);
    do {
      System.out.println("Introduce la cantidad de numeros");
      cNum = obj.nextInt();
    } while (cNum <= 0);

    for (int i = 0; i < cNum; i++) {
      System.out.println("Introduzca un numero");
      numTemp = obj.nextDouble();
      if (numTemp > numMayor) {
        numMayor = numTemp;
      }
    }
    obj.close();
    System.out.println("El numero mayor es: " + numMayor);
  }
}
