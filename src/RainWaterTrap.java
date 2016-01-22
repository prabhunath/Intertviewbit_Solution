import java.util.*;
public class RainWaterTrap {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println(trap(a));
	}
	public static  int trap(final List<Integer> A) {
		int result=0;
		
		int ii=0,jj=A.size()-1;
		int arr[]=new int[A.size()];
		for(int i=0;i<A.size();i++)
		{
			arr[i]=A.get(i);
		}
		//System.out.println(Arrays.toString(arr));
		while(ii<jj)
		{
			for(int i=ii;i<jj;i++)
			{
				if(arr[i]<=0)
				{
					ii++;
				}
				else
				{
					break;
				}
			}
			for(int j=jj;j>=ii;j--)
			{
				if(arr[j]<=0)
				{
					jj--;
				}
				else
				{
					break;
				}
			}
			for(int i=ii;i<=jj;i++)
			{
				if(arr[i]<=0)
				{
					result++;
				}
				arr[i]=arr[i]-1;
			}
			//System.out.println(Arrays.toString(arr)+"  ii="+ii+"  jj="+jj);
		}
		
		
		
		return result;
	}
	

}
