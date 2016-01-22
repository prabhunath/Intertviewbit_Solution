/*
 * fill matrix in spiral order.
 */
import java.util.*;
public class Spiral2 {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++)
		{
			result.add(new ArrayList<Integer>());
		}
		result=generateMatrix(n);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(result.get(i).get(j));
			}
			System.out.println();
		}
	}
	public static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a;i++)
		{
			result.add(new ArrayList<Integer>());
		}
		int arr[][]= new int[a][a];
		int count=0,dir=0,L=0,R=a-1,B=a-1,U=0;
		while(count<a*a)
		{
			if(dir==0)
				{
				dir++;
				for(int x=L;x<=R;x++)
				{
					
					arr[L][x]=++count;
				}
				U++;
				
			}
			else if(dir==1)
			{
				dir++;
				for(int x=U;x<=B;x++)
				{
					
					arr[x][R]=++count;
				}
				R--;
				
			}
			else if(dir==2)
			{
				dir++;
				for(int x=R;x>=L;x--)
				{
					
					arr[B][x]=++count;
				}
				B--;
				
			}
			else if(dir==3)
			{
				dir++;
				for(int x=B;x>=U;x--)
				{
					
					arr[x][L]=++count;
				}
				L++;
				
			}
			dir=dir%4;
			
		}
		
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				result.get(i).add(arr[i][j]);
			}
		}
		
		
		return result;
	}

}
