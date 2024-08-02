package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;
// belajar lambda
// Lambda berasal dari lambda calculus, yang mengacu pada anonymous function (function tanpa nama)
// Berupa Interface
// Memiliki 1 method abstract
// Ditambahkan annotation @FunctionalInterface di Interface-nya

public class SimpleActionApp {
  public static void main(String[] args) {

//    SimpleAction simpleAction1 = new SimpleAction() {
//      @Override
//      public String action(String name) {
//        return "Eko";
//      }
//    };
//
//    System.out.println(simpleAction1.action("Eko"));
//
//    SimpleAction simpleAction2 = (String name) -> {
//      return "Eko";
//    };
//
//    System.out.println(simpleAction2.action("Eko"));

    SimpleAction simpleAction1 = (String value) -> {
      return "Hello " + value;
    };

    SimpleAction simpleAction2 = (name) -> {
      return "Hello " + name;
    };
    // contoh menggunakan parameter dan buka kurung tutup , tanpa block
    SimpleAction simpleAction3 = (String value) -> "Hello " + value;
    // contoh tanpa parameter, tanpa block
    SimpleAction simpleAction4 = (value) -> "Hello " + value;
    // contoh tanpa kurung buka kurung tutup, tanpa block
    SimpleAction simpleAction5 = value -> "Hello " + value;

  }
}
