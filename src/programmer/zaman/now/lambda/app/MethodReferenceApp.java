package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;
// belajar method reference
//
public class MethodReferenceApp {
  public static void main(String[] args) {

    // Predicate<String> predicateIsLowerCase = value -> StringUtil.isLowerCase(value);
    // contoh parameter methodreference static
    Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

    System.out.println(predicateIsLowerCase.test("aidil"));
    System.out.println(predicateIsLowerCase.test("Aidil"));

    // Method Reference di Parameter yang ada dilamdanya

    // Function<String, String> functionUpper = (String value) -> value.toUpperCase();
    Function<String, String> functionUpper = String::toUpperCase;

    System.out.println(functionUpper.apply("Aidil"));

  }

  // pengen pake method reference yang punya object dia sendiri
  public void run(){
    Predicate<String> predicateIsLowerCase = this::isLowerCase;

    System.out.println(predicateIsLowerCase.test("aidil"));
    System.out.println(predicateIsLowerCase.test("Aidil"));
  }

  // pengen pake method reference Object orang lain
  public void run2(){
    MethodReferenceApp app = new MethodReferenceApp();

    Predicate<String> predicateIsLowerCase = app::isLowerCase;

    System.out.println(predicateIsLowerCase.test("aidil"));
    System.out.println(predicateIsLowerCase.test("Aidil"));
  }


  // pengen pake method reference non static
  public boolean isLowerCase(String value) {
    for (var c : value.toCharArray()) {
      if (!Character.isLowerCase(c)) {
        return false;
      }
    }
    return true;
  }

}
