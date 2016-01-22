import java.util.*;
public class LCP {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> list= new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		System.out.println(longestCommonPrefix(list));
		
	}
	public static String longestCommonPrefix(ArrayList<String> a) {
		
		String result=a.get(0);
		int size=a.size();
		if(size==1)
		{
			return result;
		}
		for(int i=1;i<size;i++)
		{
			String temp="";
			String next=a.get(i);
			int min=(next.length()>result.length()?result.length():next.length());
			for(int j=0;j<min;j++)
			{
				if(result.charAt(j)==next.charAt(j))
				{
					temp+=result.charAt(j);
				}
				else
				{
					break;
				}
			}
			result=temp;
		}
		return result;
	}

}
