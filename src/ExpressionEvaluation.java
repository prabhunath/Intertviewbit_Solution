import java.util.*;
public class ExpressionEvaluation {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String exp=sc.nextLine();
		String str[]= exp.split(" ");
		ArrayList<String> a= new ArrayList<String>();
		for(int i=0;i<str.length;i++)
		{
			a.add(str[i]);
		}
		System.out.println(evalRPN(a));
	}
	public static int evalRPN(ArrayList<String> a)
	{
		int result=0;
		Stack<Integer> stk= new Stack<Integer>();
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).equals("+"))
			{
				int x=stk.pop();
				int y=stk.pop();
				stk.add(x+y);
			}
			else if(a.get(i).equals("-"))
				{
					int x=stk.pop();
					int y=stk.pop();
					stk.add(y-x);
				}
			else if(a.get(i).equals("*"))
			{
				int x=stk.pop();
				int y=stk.pop();
				stk.add(x*y);
			}
			else if(a.get(i).equals("/"))
			{
				int x=stk.pop();
				int y=stk.pop();
				stk.add(y/x);
			}
			else
			{
				stk.add(Integer.parseInt(a.get(i)));
			}
			//System.out.println(stk+"   a[i]="+a.get(i));
		}
		result= stk.pop();
		return result;
	}

}
