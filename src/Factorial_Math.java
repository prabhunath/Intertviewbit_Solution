import java.util.*;
public class Factorial_Math {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(trailingZeroes(n));
		
	}
	
	public static int trailingZeroes(int a) {
	    int count=0;
	    while(a>0)
	    {
	        count=count+a/5;
	        a=a/5;
	    }
	    return count;
	}

}
