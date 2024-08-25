import java.util.*;

public class primeornot
{
  public static int prime(int n)
  {
     int flag = 0;
	if(n == 1 || n%2==0 && n!=2 || n%3==0 && n!=3)
	{
	    return 1;
	}
	else 
	{
	    for(int i = 5 ; i*i < n; i = i + 2)
    	{
    	    if(n%i == 0 )
    	    {
    	        return 1;
    	    }
    	}
	}
	return 0;
  }
  public static void main (String[]args)
  {
	int n = 5,rev = 0;
	int ans = prime(n);
	if(ans == 1 ||  n <10) // checking the number is not prime or single digit
	{
	    System.out.println((ans==0)?"Prime": "Not a prime");
	    return;
	}
    for( ;n >0; rev = (rev*10) + n % 10, n/=10);
    System.out.println(rev);
    ans = prime(rev);
    System.out.println((ans==0)?"Prime": "Not a prime");
  }
}