import java.util.*;
public class BinarySearch {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++)
		{
			a.add(new ArrayList<Integer>());
		}
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a.get(i).add(sc.nextInt());
			}
		}
		int b=sc.nextInt();
		System.out.println(searchMatrix(a, b));
	}
	public static int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
	    for(int i=0;i<a.size();i++)
	    {
	        
	        if(	Arrays.binarySearch(a.get(i).toArray(), (Object)(b)) >=0)
	        {
	        	return 1;
	        }
	        
	    }
	    
	        return 0;
	    
	}

}/*
A : 
[
  [1 2 2 3 4 4 6 7 8]
  [10 18 19 22 22 24 27 27 27]
  [28 28 29 29 29 32 34 35 36]
  [37 37 40 40 43 46 46 47 48]
  [49 51 53 53 55 55 60 62 62]
  [64 68 70 70 73 77 81 82 82]
  [84 86 88 90 95 96 9 99 100]
]

7
9
1 2 2 3 4 4 6 7 8
10 18 19 22 22 24 27 27 27
28 28 29 29 29 32 34 35 36
37 37 40 40 43 46 46 47 48
49 51 53 53 55 55 60 62 62
64 68 70 70 73 77 81 82 82
84 86 88 90 95 96 9 99 100
1

*/
