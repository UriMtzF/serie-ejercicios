import java.util.Scanner;

class Condicional12 {
  public static void main(String[] args) {
    char l1;

    Scanner obj = new Scanner(System.in);
    System.out.println("Escribe el caracter");
    l1 = obj.next().charAt(0);
    obj.close();

    if (Character.isDigit(l1)) {
      System.out.println("El caracter es un numero");
    } else {
      System.out.println("El caracter no es un numero");
    }
  }
}