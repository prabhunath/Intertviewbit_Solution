import java.util.*;
public class PRETTYPRINT {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		list=prettyPrint(n);
		int Size=1+(n-1)*2;
		for(int i=0;i<Size;i++)
		{
			System.out.println(list.get(i));
		}
	}
	public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		int Size=1+(a-1)*2;
		
		int arr[][]= new int[Size+1][Size+1];
		int count=0;
		int L=0;
		int N=Size;
		int value=a;
		while(value!=0)
		{
			for(int x=L;x<N;x++)
			{
				arr[L][x]=value;
				arr[N-1][x]=value;
				arr[x][L]=value;
				arr[x][N-1]=value;
				count+=4;
			}
			N--;
			L++;
			value--;
		}
		ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<Size;i++)
		{
			list.add(new ArrayList<Integer>());
			for(int j=0;j<Size;j++)
			{
				list.get(i).add(arr[i][j]);
			}
		}
		
		return list;
		
	}
}
