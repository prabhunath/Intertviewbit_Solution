import java.util.*;
public class KTHSMALLEST {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> a= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		int k=sc.nextInt();
		System.out.println(kthsmallest(a,k));
		
	}
	public static  int kthsmallest(final List<Integer> a, int k) {
		List<Integer>b= new ArrayList<Integer>();
		b=a;
		b.sort(null);
		return b.get(k-1);
	}

}
