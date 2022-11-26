import java.util.Scanner;

class Condicional9 {
  public static void main(String[] args) {
    char letra;

    Scanner obj = new Scanner(System.in);
    System.out.println("Escribe una letra");
    letra = obj.next().charAt(0);
    obj.close();

    if (Character.isUpperCase(letra)) {
      System.out.println("La letra es mayúscula");
    } else {
      System.out.println("La letra es minuscula");
    }
  }
}