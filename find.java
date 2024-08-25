import java.util.*;
public class find {
  void evenorordd(int x){
    if(x%2==0){
      System.out.println("even");
    }
    else
    System.out.println("odd");
  }
  public static void main(String[] args) {
    find obj=new find();
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    obj.evenorordd(a);
  }
}

