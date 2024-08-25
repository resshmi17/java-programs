class a{
    public void get(){
    System.out.println("getii");
  }
  static class b{
    void display(){
    System.out.println("get");

  }
}
}

public class ab{
  public static void main(String[] args) {
  a obj= new a();
    a.b obj1=new a.b();
    obj1.display();


    
  }
}