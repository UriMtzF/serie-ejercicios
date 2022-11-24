import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int num1, num2;

    System.out.println("Dame un numero");
    num1 = obj.nextInt();
    System.out.println("Dame otro numero");
    num2 = obj.nextInt();

    System.out.println("El primer número fue: " + num1 + ", el segundo número fue: " + num2);

  }
}