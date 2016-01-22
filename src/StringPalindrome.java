import java.util.*;
public class StringPalindrome {
	public static void main(String...ook)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(isPalindrome(str));
	}
	public static int isPalindrome(String a) {
	    a=a.toLowerCase();
	    a=a.replaceAll("[^a-z0-9]","");
	    int j=a.length()-1;
	    boolean flag=false;
	    for(int i=0;i<=j;i++)
	    {
	    	if(a.charAt(i)!=a.charAt(j))
	    	{
	    		return 0;
	    		
	    	}
	    	j--;
	    }
	    return 1;
	    
	}
}
