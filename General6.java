import java.util.Scanner;

public class General6 {
  public static void main(String[] args) {
    int a, b;

    Scanner obj = new Scanner(System.in);
    System.out.println("Introduce el primer numero");
    a = obj.nextInt();
    System.out.println("Introduce el segundo numero");
    b = obj.nextInt();
    obj.close();

    if (SumaDivisores(a) == b && SumaDivisores(b) == a) {
      System.out.println("Son numeros amigos");
    } else {
      System.out.println("No son numeros amigos");
    }
  }

  // El metodo SumaDivisores regresa la suma de los divisores del numero dado
  static int SumaDivisores(int numero) {
    int suma = 0;
    for (int divisor = 1; divisor < numero; divisor++) {
      if (numero % divisor == 0) {
        suma += divisor;
      }
    }
    return suma;
  }
}