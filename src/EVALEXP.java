import java.util.*;
public class EVALEXP {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String st[]=str.split(" ");
		ArrayList<String> list= new ArrayList<String>();
		for(int i=0;i<st.length;i++)
		{
			list.add(st[i]);
		}
		System.out.println(evalRPN(list));
	}
	public static int evalRPN(ArrayList<String> a)
	{
		int result=0;
		Queue<String> que= new LinkedList<String>();
		for(int i=0;i<a.size();i++)
		{
			que.add(a.get(i));
			
		}
		int x=Integer.parseInt(que.peek());
		que.remove();
		while(!que.isEmpty())
		{
			
			int y=Integer.parseInt(que.peek());
			que.remove();
			String opr=que.peek();
			que.remove();
			if(opr.equals("+"))
			{
				x=x+y;
			}
			else if(opr.equals("-"))
			{
				x=x-y;
			}
			else if(opr.equals("*"))
			{
				x=x*y;
			}
			else if(opr.equals("/"))
			{
				x=x/y;
			}
			
			
		}
		result=x;
		return result;
	}

}
