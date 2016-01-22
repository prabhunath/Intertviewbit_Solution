import java.util.*;
public class AllPrimeFactorEfficient {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(primeFactors(n));
	}
	public static ArrayList<Integer> primeFactors(int n)
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
	    // Print the number of 2s that divide n
	    while (n%2 == 0)
	    {
	        //printf("%d ", 2);
	        list.add(2);
	        n = n/2;
	    }
	 
	    // n must be odd at this point.  So we can skip one element (Note i = i +2)
	    for (int i = 3; i <= Math.sqrt(n); i = i+2)
	    {
	        // While i divides n, print i and divide n
	        while (n%i == 0)
	        {
	            //printf("%d ", i);
	        	list.add(i);
	            n = n/i;
	        }
	    }
	 
	    // This condition is to handle the case whien n is a prime number
	    // greater than 2
	    if (n > 2)
	    {
	        //printf ("%d ", n);
	    	list.add(n);
	    }
	    return list;
	    	
	}

}
