package programmer.zaman.now.lambda.app;

import java.util.function.Function;
// belajar util function
// menggunakan function
public class FunctionApp {
  public static void main(String[] args) {

    Function<String, Integer> functionLength = value -> value.length();

    System.out.println(functionLength.apply("Aidil"));

  }
}
