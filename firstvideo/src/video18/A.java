package video18;
// use func in different class (which is B & C) with object method in B and without
// object in C because C is a static function so we call it with its class name only.
public class A {
 public static void main(String[] args) {
  B obj = new B();
  int x = obj.add(5,9);
  int y = B.sub(9,5);
  System.out.println(x);
  System.out.println(y);

  double z = C.multi(5,6);
  System.out.println(z);
 }
 }