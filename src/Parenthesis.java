import java.util.*;
public class Parenthesis {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		System.out.println(isValid(str));
		
	}
	public static int isValid(String a) {
		if(a.length()%2!=0)
		{
			
			return 0;
		}
		else if(a.length()==0)
		{
			
			return 1;
		}
		else
		{
			//System.out.println("right here");
			char c[]=a.toCharArray();
			Stack<Character> stk =  new Stack<Character>();
			for(int i=0;i<c.length;i++)
			{
				if(c[i]=='(' || c[i]=='[' || c[i]=='{')
				{
					stk.push(c[i]);
				}
				else
				{
					if(stk.isEmpty())
					{
						return 0;
						//break;
					}
					else
					{
						//System.out.println("c[i] "+c[i]+"  stkpeek= "+stk.peek());
						char cc=c[i];
						if(cc==')' && stk.peek()=='(' )
						{
							stk.pop();
						}
						else if(cc==']' && stk.peek()=='[' )
						{
							//System.out.println("jashgdfjkasdghf");
							stk.pop();
						}
						else if(cc=='}' && stk.peek()=='{' )
						{
							//System.out.println("jashgdfjkasdghf");
							stk.pop();
						}
					}
				}
				//System.out.println(stk);
			}
			if(stk.isEmpty())
			{
				return 1;
			}else
			{
				return 0;
			}
		}
		
		
	
	}

}
