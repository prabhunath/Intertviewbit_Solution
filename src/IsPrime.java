import java.util.*;
public class IsPrime {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println((isPrime(n)==1)?"True":"False");
	}
	public static  int isPrime(int a) {
	    if(a==1)
	    {
	        return 0;
	    }
	    for(int i=2;i<=Math.sqrt(a);i++)
	    {
	        if(a%i==0)
	        
	        {
	            return 0;
	        }
	    }
	    return 1;
	}

}
