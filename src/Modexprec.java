import java.util.*;
public class Modexprec {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(Mod(a, b, c));
	}
public static int Mod(int a, int b, int c) {
	long sol=power(a,b);
	    if(sol<0)
	    {
	    	return (int)(c+sol);
	    }
	    return (int)sol%c;
	}
public static int power(int x,  int y)
{
    long res = 1;     // Initialize result
  
    while (y > 0)
    {
        // If y is odd, multiply x with result
        if (y%2!=0)
            res = res*x;
  
        // n must be even now
        y = y>>1; // y = y/2
        x = x*x;  // Change x to x^2
    }
    return (int)(res%1000000003);
}

}

/*
 * 
 * 
INPUT
A : 71045970
B : 41535484
C : 64735492
OUTPUT
20805472
*/
/*
public class Solution {
	public int Mod(int A, int B, int C) {
	    long res = 1;
	    long y = A;
	    
	    while (B > 0) {
	        
	        if (B % 2 == 1) {
	            res = res * y;
	            res %= C;
	        }
	        
	        y = y * y;
	        y %= C;
	        
	        B /= 2;
	        
	    }
	    
	    res %= C;
	    res = (res + C) % C;
	    
	    return (int) res;
	}*/