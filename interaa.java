abstract class Demo{
  public abstract void code();
}
class D extends Demo{
  public void code(){
    System.out.println("hei");
  }
}
  class E extends Demo{
    public void code(){
      System.out.println("hoi");
    }
    public void coding(){
      System.out.println("hiiiiii");
    }
  }
  class Develop{
    void perform(Demo a){
      a.code();
    }
  }
public class interaa {
  public static void main(String[] args) {
    
  
  Develop obj3=new Develop();
  Demo obj=new D();
  Demo obj1=new E();
  obj3.perform(obj);
  }
}
