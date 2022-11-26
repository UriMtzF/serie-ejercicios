import java.util.Scanner;

class Condicional11 {
  public static void main(String[] args) {
    char l1, l2;

    Scanner obj = new Scanner(System.in);
    System.out.println("Escribe la primer letra");
    l1 = obj.next().charAt(0);
    System.out.println("Escribe la segunda letra");
    l2 = obj.next().charAt(0);
    obj.close();

    if (Character.isLowerCase(l1) && Character.isLowerCase(l2)) {
      System.out.println("Las dos letras son minúsculas");
    } else if (Character.isLowerCase(l1) || Character.isLowerCase(l2)) {
      System.out.println("Solo una de las letras son minusculas");
    } else {
      System.out.println("Ninguna de las dos letras son minusculas");
    }
  }
}