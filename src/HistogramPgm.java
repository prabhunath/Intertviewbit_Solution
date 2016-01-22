import java.util.*;
public class HistogramPgm {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println(largestRectangleArea(a));
	}
	public static int largestRectangleArea(ArrayList<Integer> a) {
		
		int result=0;
		ArrayList<Integer> num= new ArrayList<Integer>();
		for(int i=0;i<a.size();i++)
		{
			if(!num.contains(a.get(i)))
			{
				num.add(a.get(i));
			}
		}
		
		int index=num.size();
		int ct=0;
		while(index>0)
		{
			index--;
			 ct=0;
			for(int i=0;i<a.size();i++)
			{
				if(a.get(i)-num.get(index)>=0)
				{
					ct++;
				}
				else
				{
					if(ct*num.get(index)>result)
					{
						result=ct*num.get(index);
					}
					ct=0;
				}
			}			
		}
		if(ct*num.get(index)>result)
		{
			result=ct*num.get(index);
		}
		return result;
	}
}
