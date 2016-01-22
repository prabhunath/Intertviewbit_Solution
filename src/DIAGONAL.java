import java.util.*;
public class DIAGONAL {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++)
		{
			list.add(new ArrayList<Integer>());
		}
		int arr[][]= new int[n][n];
		int count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=count++;
				list.get(i).add(arr[i][j]);
			}
		}
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<(n+n-1);i++)
		{
			result.add(new ArrayList<Integer>());
		}
		result=diagonal(list);
		for(int i=0;i<(n+n-1);i++)
		{
			System.out.println(result.get(i));	
		}
	}
	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
		int n=a.get(0).size();
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<(n+n-1);i++)
		{
			result.add(new ArrayList<Integer>());
		}
		int index=0;
		int arr[][]= new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=a.get(i).get(j);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int ii=0;
		for(int jj=0;jj<n;jj++)
		{
			ArrayList<Integer>list= new ArrayList<Integer>();
			int i=ii;
			int j=jj;
			//System.out.println("i="+i+" j="+j+" ii= "+ii+" jj= "+jj);
			while(i<=jj && j>=ii)
			{
				//System.out.println("under while:  i="+i+" j="+j);
				list.add(arr[i][j]);
				i++;j--;
			}
			//System.out.println(list);
			for(int zz=0;zz<list.size();zz++)
			{
			result.get(index).add(list.get(zz));
			}
			index++;
		}
		int jj=n-1;
		for(ii=1;ii<n;ii++)
		{
			ArrayList<Integer>list= new ArrayList<Integer>();
			int i=ii;
			int j=jj;
			//System.out.println("i="+i+" j="+j+" ii= "+ii+" jj= "+jj);
			while(i<=jj && j>=ii)
			{
				//System.out.println("under while:  i="+i+" j="+j);
				list.add(arr[i][j]);
				i++;j--;
			}
			//System.out.println(list);
			for(int zz=0;zz<list.size();zz++)
			{
			result.get(index).add(list.get(zz));
			}
			index++;
		}
		
		
		
		return result;
	}

}
