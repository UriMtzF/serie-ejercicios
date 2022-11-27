import java.util.Scanner;

public class General12 {
  public static void main(String[] args) {
    int nAlum;
    double cMayor = 0,
        suma = 0,
        promedio,
        cMenor;

    Scanner obj = new Scanner(System.in);
    do {
      System.out.println("Introduce la cantidad de alumnos");
      nAlum = obj.nextInt();
    } while (nAlum <= 0);

    double calif[] = new double[nAlum];

    for (int i = 0; i < nAlum; i++) {
      System.out.println("Introduce la calificación del alumno");
      calif[i] = obj.nextDouble();
    }
    obj.close();

    for (int i = 0; i < calif.length; i++) {
      if (calif[i] > cMayor) {
        cMayor = calif[i];
      }
    }

    cMenor = cMayor;

    for (int i = 0; i < calif.length; i++) {
      if (calif[i] < cMenor) {
        cMenor = calif[i];
      }
    }

    for (int i = 0; i < calif.length; i++) {
      suma += calif[i];
    }

    promedio = suma / nAlum;

    System.out.println("La calificación mayor es: " + cMayor);
    System.out.println("La calificación menor es: " + cMenor);
    System.out.println("El promedio es: " + promedio);
  }
}
