import java.util.Scanner;

public class Arreglos3 {
  public static void main(String[] args) {
    int nAlum;
    double promedio,
        suma = 0;

    Scanner obj = new Scanner(System.in);
    do {
      System.out.println("Introduce la cantidad de alumnos");
      nAlum = obj.nextInt();
    } while (nAlum <= 0);

    double calif[] = new double[nAlum];

    for (int i = 0; i < nAlum; i++) {
      System.out.println("Introduce la calificación del alumno " + i);
      calif[i] = obj.nextDouble();
    }
    obj.close();

    for (int i = 0; i < calif.length; i++) {
      suma += calif[i];
    }

    promedio = suma / nAlum;

    for (int i = 0; i < calif.length; i++) {
      if (calif[i] >= promedio) {
        System.out.println("El alumno " + (i + 1) + " tiene calificacion " + calif[i] + ", mayor a la media");
      }
    }
    System.out.println("El promedio es: " + promedio);
  }
}
