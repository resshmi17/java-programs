import java.util.*;
/*ip1:
n=5 d=3
ip2:
1 2 100
2 4 100
3 5 100
[0,0,0,0,0]
1st=> st=1,en=2,value=100
[100,100,0,0,0]
2nd=> st=2,en=4,val=100
[100,200,100,100,0]
3rd=>st=3,en=5,value=100
[100,200,200,200,100]=>max of array=200 */ 
public class unknwn {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<d;i++){
      int start=sc.nextInt();
      int end=sc.nextInt();
      int value=sc.nextInt();
    
    for(int k=start-1;k<=end-1;k++){
      arr[k]+=value;
    }
  }
  int max=arr[0];
  for(int i=1;i<n;i++){
    if(max<arr[i]){
      max=arr[i];
    }
  }
  System.out.println(max);
  }
  
}
