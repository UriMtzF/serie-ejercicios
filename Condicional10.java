import java.util.Scanner;

class Condicional10 {
  public static void main(String[] args) {
    char l1, l2;

    Scanner obj = new Scanner(System.in);
    System.out.println("Escribe la primer letra");
    l1 = obj.next().charAt(0);
    System.out.println("Escribe la segunda letra");
    l2 = obj.next().charAt(0);
    obj.close();

    if (l1 == l2) {
      System.out.println("Las letras son iguales");
    } else {
      System.out.println("Las letras no son iguales");
    }
  }
}