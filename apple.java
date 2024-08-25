import java.util.*;
public class apple {
  public static void main(String[] args) {
    
  int gate,apple=1;
  Scanner sc=new Scanner(System.in);
  gate=sc.nextInt();
  for(int i=gate;i>0;i--){
  apple=(apple+1)*2;
  }
  System.out.println(apple);
}
}
