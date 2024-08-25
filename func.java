interface A {
  void show(int a);
}

class B implements A {
  public void show(int a) {  // The method must be public
      System.out.println(a);
  }
}

public class func {
  public static void main(String[] args) {
      A obj = new B();
      obj.show(5);
  }
}
