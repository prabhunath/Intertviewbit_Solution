import java.util.*;
public class Rotate2D {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++)
		{
			matrix.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix.get(i).add(sc.nextInt());
			}
		}
		//for(int i=0;i<n;i++)
		//{
		//	System.out.println(matrix.get(i));
		//}
		rotate(matrix);
	}
	public static void  rotate(ArrayList<ArrayList<Integer>> ar) {
		
		
		int size=ar.get(0).size();
		int arr[][]= new int[size][size];
		int arrc[][]= new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				arr[i][j]=ar.get(i).get(j);
				arrc[i][j]=0;
			}
		}
		int count=0,ii=0,jj=0,n=size,L=0;
		
		int limit=0;
		if(size%2==0)
		{
			limit=size*size;
		}else
		{
			limit=size*size-1;
		}
		while(count<limit)
		{
			int i=ii,j=jj;
			arrc[i][j]=arr[i+1][j];
			for(int x=i+1;x<n;x++)
			{
				arrc[i][x]=arr[i][x-1];count++;
			}
			j=n-1;
			arrc[i+1][j]=arr[i][j];
			for(int x=i+1;x<n;x++)
			{
				arrc[x][j]=arr[x-1][j];count++;
			}
			i=n-1;
			for(int x=j-1;x>=L;x--)
			{
				arrc[i][x]=arr[i][x+1];count++;
			}

			j=L;
			for(int x=i-1;x>=L;x--)
			{
				arrc[x][j]=arr[x+1][j];count++;
			}
			
			
			
			L++;ii++;jj++;n--;
		}
		
		if(size%2!=0)
		{
			arrc[size/2][size/2]=arr[size/2][size/2];
		}
		
		ArrayList<ArrayList<Integer>> rlist= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<size;i++)
		{
			rlist.add(new ArrayList<Integer>());
		}
		
		for(int x=0;x<size;x++)
		{
			for(int y=0;y<size;y++)
			{
				//System.out.print(arrc[x][y]+" ");
				rlist.get(x).add(arrc[x][y]);
			}
			//System.out.println();
		}
		ar=rlist;
		for(int i=0;i<size;i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		
	    
	}

}
