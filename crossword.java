import java.util.*;
public class crossword {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    int i,j,n;
     n=a.length();
    for(i=0;i<n;i++){
      for(j=0;j<n;j++){
      if(i==j)
      {
System.out.println(a.charAt(i));
      }
      else if(i+j==n-1)
      {
        System.out.println(a.charAt(j));
    }
    else{
        System.out.println(" ");
    }
  }
  System.out.println();
  }
}
}
