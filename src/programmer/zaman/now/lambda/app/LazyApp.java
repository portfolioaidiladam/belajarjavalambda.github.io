package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;
// belajar lambda lazy parameter
// Lazy parameter artinya, parameter tersebut hanya akan dieksekusi ketika diakses

public class LazyApp {
  public static void main(String[] args) {
    testScore(60, () -> getName());
  }
  // ini contoh yang bukan lazy parameter
  public static void testScore(int score, Supplier<String> name) {
    if (score > 80) {
      System.out.println("Selamat " + name.get() + ", Anda Lulus");
    } else {
      System.out.println("Coba Lagi Tahun Depan");
    }
  }
   // ini contoh lazy parameter
  public static String getName(){
    System.out.println("Method getName() dipanggil");
    return "Aidil";
  }
}
