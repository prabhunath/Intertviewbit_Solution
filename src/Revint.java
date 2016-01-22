import java.util.*;
public class Revint {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(reverse(n));
	}
public static  int reverse(int a) {
	    
	    if(a<0)
	    {
	        String s=a+"";
	        s=s.substring(1);
	        StringBuffer sb= new StringBuffer(s);
	        long x=Long.parseLong( (sb.reverse().toString()));
	        if(-x<Integer.MIN_VALUE)
	        {
	        	return 0;
	        }
	        else
	        {
	        	return (int)(x*-1);
	        }
	    }
	    else
	    {
	        String s=a+"";
	        StringBuffer sb= new StringBuffer(s);
	        long x=Long.parseLong( (sb.reverse().toString()));
	        if(x>Integer.MAX_VALUE)
	        {
	        	return 0;
	        }
	        else
	        {
	        return (int)x;
	        }
	        //return Integer.parseInt(sb.reverse().toString());
	    }
	}
}
