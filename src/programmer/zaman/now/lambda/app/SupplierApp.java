package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;
// belajar util function
// menggunakan Supplier
public class SupplierApp {
  public static void main(String[] args) {

    Supplier<String> supplier = () -> "Aidil Adam Baik Hati";

    System.out.println(supplier.get());

  }
}
