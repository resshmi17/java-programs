import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			int m=sc.nextInt();
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		int c[][]=new int[n][n];
				int t=sc.nextInt();
		for(int k=0;k<t;k++){
		for(int i=0;i<n;i++){
		 for(int j=0;j<m;j++){
		  a[i][j]=sc.nextInt();
		 }
		}
		for(int i=0;i<n;i++){
		 for(int j=0;j<m;j++){
		  b[i][j]=sc.nextInt();
		 }
		}
		}
for(int i=0;i<n;i++){    
for(int j=0;j<m;j++){    
c[i][j]=0;      
for(int k=0;k<n;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}
System.out.print(c[i][j]+" "); 
}
System.out.println(); 
}    
}}  