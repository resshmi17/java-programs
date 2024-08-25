public class arrg {
  void sum(int x,int y){
    System.out.println(x+y);
  }
  void sub(int x,int y){
    System.out.println(x-y);
  }
  void mul(int x,int y){
    System.out.println(x*y);
  }
  void div(int x,int y){
    System.out.println(x/y);
  }
  public static void main(String[] args) {
arrg obj1=new arrg();
obj1.sum(20,30);    
obj1.sub(20,30);  
obj1.mul(20,30);  
obj1.div(20,30);  
}
}
