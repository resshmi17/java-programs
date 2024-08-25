interface computer {
  void code();
}
class Desktop implements computer{
  public void code(){
    System.err.println("codingg");
  }
}class Laptop implements computer{
  public void code(){
    System.out.println("codeeeeee");
  }
}class Developer{
  void dev(computer lap){
    lap.code();
  }
}
class inter{
  public static void main(String[] args) {
    Developer dev=new Developer();
    computer desk=new Desktop();
    computer lap=new Laptop();
    dev.dev(desk);
  }
}