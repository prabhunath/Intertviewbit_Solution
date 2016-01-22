import java.util.*;
public class CountSay {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(countAndSay(n));
	}
	public static  String countAndSay(int a) {
		if(a==1)
		{
			return "1";
		}
		String result="";
		String str[]= new String[a+1];
		str[1]="1";
		str[2]="11";
		for(int i=2;i<a;i++)
		{
			str[i+1]=returnNext(str[i]);
		}
		result=str[a];
		return result;
	}
	public static String returnNext(String str)
	{
		String next="";
		char c=str.charAt(0);
		char cc = c;
		int countt=0;
		while(str.length()!=0 )
		{
			countt++;
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==c)
				{
					count++;
				}
				else
				{
					cc=c;
					c=str.charAt(i);
					if(count==str.length())
					{
						str="";
					}
					else
					{
					str=str.substring(count);
					}
					
					break;
				}
				if(count==str.length())
				{
					cc=str.charAt(i);
					str="";
				}
			}
			next=next+count+cc;
		}
		
		return next;
		
	}

}
