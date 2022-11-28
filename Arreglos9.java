import java.util.Random;

public class Arreglos9 {
  public static void main(String[] args) {
    Random ran = new Random();
    int nRan[] = new int[ran.nextInt(9) + 1];

    for (int i = 0; i < nRan.length; i++) {
      nRan[i] = ran.nextInt(100);
    }

    for (int i = 0; i < nRan.length; i++) {
      System.out.println(nRan[i]);
    }
  }
}
