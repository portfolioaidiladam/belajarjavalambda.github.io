package programmer.zaman.now.lambda.app;

import java.util.List;
import java.util.function.Consumer;
// belajar lambda di collection
public class ForEachApp {
  public static void main(String[] args) {

    List<String> list = List.of("Aidil", "Adam", "Baik");

    // for loop
    for (var value : list) {
      System.out.println(value);
    }

    // forEach anonymous class
    list.forEach(new Consumer<String>() {
      @Override
      public void accept(String value) {
        System.out.println(value);
      }
    });

    // lambda
    list.forEach(value -> System.out.println(value));

    // lambda method reference
    list.forEach(System.out::println);

  }
}
