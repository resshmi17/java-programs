import java.util.*;
public class school {
String passorfail(int x){
if(x>=50){
  return "pass";
}
else
return "fail";
}
public static void main(String[] args) {
  Scanner sc =new Scanner(System.in);
  int a=sc.nextInt();
  school obj=new school();
  String result=obj.passorfail(a);
  System.out.println(result);
}
}
