import java.util.Scanner;

public class remove {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  String a,b,c=" ";

  for(int i=0;i<n;i++){
    a=sc.nextLine();
    b=sc.nextLine();
  }
  for(int k=0;k<a.length();k++){
    for(int j=0;j<b.length();j++){
      if(a.charAt(k)!=b.charAt(j)){
        c+=b.charAt(j);
      }
    }
  }
  System.out.println(c);
}
