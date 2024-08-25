import java.util.Scanner;

public class reverse {
  public static void main(String[] args) {
    
    int rem=0,rev=0,trev=0,c=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(;n>0;){
    rem=n%10;
    rev=(rev*10)+rem;
    n=n/10;
    c++;
    }
    for(;rev>0;)  {
      rem=rev%100;
      trev=(trev*100)+rem;
      rev=rev/100;
}
if(c%2==0)
System.out.println(trev);
else{
  rem=trev%10;
  trev=trev/10;
  trev=trev+rem;
  System.out.println(trev);

}}
}
