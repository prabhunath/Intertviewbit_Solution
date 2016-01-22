import java.util.*;
public class Palindrome {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPalindrome(n));
	}
	public static boolean isPalindrome(int a) {
	    if(a<0)
	    {
	        return false;
	    }
	    String s=a+"";
	    StringBuffer sb= new StringBuffer(s);
	    return sb.reverse().toString().equals(s);
	}

}
