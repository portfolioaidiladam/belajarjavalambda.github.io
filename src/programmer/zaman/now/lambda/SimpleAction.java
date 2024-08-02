package programmer.zaman.now.lambda;

// belajar lambda
// Lambda berasal dari lambda calculus, yang mengacu pada anonymous function (function tanpa nama)
// Berupa Interface
// Memiliki 1 method abstract
// Ditambahkan annotation @FunctionalInterface di Interface-nya

@FunctionalInterface
public interface SimpleAction {

  String action(String name);

}
