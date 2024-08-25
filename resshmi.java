import java.util.*;
public class resshmi 
  {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int []arr=new int[n];
      int k=sc.nextInt();
      int []brr=new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      int y=k;
      for(int i=0;i<n-k;i++)
      {
          brr[i]=arr[y];
          y++;
      }
      int j=k+1;
      
      for(int i=0;i<k;i++)
      {
          if(j<n){
          brr[j]=arr[i];
          j++;}
          
      }
      for(int i=0;i<n;i++)
      {
          System.out.print(brr[i]+" ");
      }
      
      
      
      
    }
  }
