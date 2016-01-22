import java.util.*;
public class STRSTR {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String haystack=sc.nextLine();
		String needle=sc.nextLine();
		System.out.println(strStr(haystack,needle));
		
	}
	public static int strStr(final String haystack, final String needle) {
	    if(needle.length()==0 && haystack.length()==0)
	    {
	        return -1;
	    }
	    if(needle.length()==0)
	    {
	        return -1;
	    }
	    if(haystack.contains(needle))
	    {
	        return haystack.indexOf(needle);
	    }
	    else
	    {
	        return -1;
	    }
	}

}
