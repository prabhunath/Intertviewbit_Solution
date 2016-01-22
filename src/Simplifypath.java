import java.util.*;
public class Simplifypath {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(simplifyPath(sc.next()));
	}
	public static  String simplifyPath(String a) {
		String result="";
		String s[]=a.split("/");
		Stack<String> stk= new Stack<String>();
		for(int i=1;i<s.length;i++)
		{
			if(s[i].equals("..")){
				if(!stk.isEmpty()){
				stk.pop();
				}
			}
			else if(s[i].equals("."))
			{
				
			}
			else if(s[i].equals(""))
			{
				
			}
			else 
			{
				stk.push(s[i]);
			}
				
		}
		System.out.println(Arrays.toString(s));
		System.out.println(stk);
		result="";
		if(stk.isEmpty())
		{
			return "/";
		}
		while(stk.size()>0)
		{
			result="/"+stk.pop()+result;
		}
		
		return result;
	}
}
