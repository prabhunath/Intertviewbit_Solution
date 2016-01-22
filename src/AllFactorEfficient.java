import java.util.*;
public class AllFactorEfficient {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> allfactors= allFactor(n);
		System.out.println(allfactors);
	}
	public static ArrayList<Integer> allFactor(int n)
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				if(i==Math.sqrt(n))
				{
					list.add(i);
				}
				else
				{
					list.add(i);
					list.add(n/i);
				}
			}
		}
		list.sort(null);
		return list;
	}

}
