import java.util.*;
public class REVWORD {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverseWords(str));
	}
	public static  String reverseWords(String a) {
		//StringBuffer sb= new StringBuffer(a);
		//a=sb.reverse().toString();
		String result="";
		String temp="";
		for(int i=a.length()-1;i>=0;i--)
		{
			if(a.charAt(i)!=' ')
			{
				temp=a.charAt(i)+temp;
			}
			else
			{
				result=result+temp+a.charAt(i);
				temp="";
			}
		}
		if(temp.length()!=0)
		{
			result=result+temp;
		}
		while(result.contains("  "))
		{
		result=result.replace("  ", " ");
		}
		result=result.trim();
		return result;
		
	}
		
}
