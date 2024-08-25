import java.util.*;
public class oddevenpattern {
  public static void main(String[] args) {
    
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++){
    int odd=(2*i)+1;
    System.out.println((odd+1)*odd+" "+(odd+1)+" "+odd);
  }
}
}
/*n=4
 * op:
 * 2 2 1
 * 12 4 3
 * 30 6 5
 * 56 8 7
 */
