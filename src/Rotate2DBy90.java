import java.util.*;
public class Rotate2DBy90 {
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
	public static  void rotate(ArrayList<ArrayList<Integer>> A) {
	    int n;
	    
	    if (A == null)
	        return;
	    
	    n = A.size();
	    
	    if (n == 0)
	        return;
	    
	    int layers = n;
	    int row1, col1, row2, col2;
	    int num;
	    int temp;
	    int first, last;
	    
	    for (int layer = 0; layer < layers / 2; layer++) {
	        
	        first = layer;
	        last = n - layer - 1;
	        
	        for (int i = first; i < last; i++) {
	            
	            int offset = i - layer;
	            
	            int top = A.get(first).get(i);
	            
	            A.get(first).set(i, A.get(last - offset).get(first));
	            
	            A.get(last - offset).set(first, A.get(last).get(last - offset));
	            
	            A.get(last).set(last - offset, A.get(i).get(last));
	            
	            A.get(i).set(last, top);
	        }
	        
	    }
	    int size=A.get(0).size();
	    for(int i=0;i<size;i++)
	    {
	    	System.out.println(A.get(i));
	    }
	    
	}

}