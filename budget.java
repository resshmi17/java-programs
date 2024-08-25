/*case 1
arr[1000,1500,500,800,1200]
budget=2000
op=accepted
add any two and get the bgdet exCTly
arr[1000,1500,700,800,1000] */

import java.util.*;
public class budget {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int budget=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==budget) {                                              
					
				
					System.out.println("accepted");
					flag=1;
					break;
				}
				if(flag==1)
					break;
					
				
			}
			if(flag==1)
				break;
				
		}
		if(flag==0)
			System.out.println("not accepted");
		
	}

}