import java.util.*;
public class LengthLast {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(lengthOfLastWord(str));
	}
	public static  int lengthOfLastWord(final String a) {
		String b=a;
		int l=0;
		String str[]=b.split(" ");
		if(str.length==0)
		{
		    return 0;
		}
		l=str[str.length-1].length();
		return l;
		    
		}

}
