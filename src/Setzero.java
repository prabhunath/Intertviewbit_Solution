import java.util.*;
public class Setzero {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<m;i++)
		{
			a.add(new ArrayList<Integer>());
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a.get(i).add(sc.nextInt());
			}
		}
		setZeroes(a);
		 
	}
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    ArrayList<ArrayList<Integer>> ac= new ArrayList<ArrayList<Integer>>();
	   
	   
	    
	    int m=a.size();
	    int n=a.get(0).size();
	    
	    for(int i=0;i<m;i++)
	    {
	        System.out.println(a.get(i)+" ");
	    }
	    
	    
	    boolean bb[][]= new boolean[m][n];
	    int aa[][]= new int[m][n];
	    
	    for(int i=0;i<m;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            aa[i][j]=a.get(i).get(j);
	           
	        }
	    }
	    for(int i=0;i<m;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(aa[i][j]==0)
	            {
	               for(int x=0;x<m;x++)
	               {
	                  // aa[x][j]=0;
	                   //bb[x][j]=true;
	                   a.get(x).set(j,0);
	               }
	               for(int x=0;x<n;x++)
	               {
	                  // aa[i][x]=0;
	                  // bb[i][x]=true;
	                   a.get(i).set(x,0);
	               }
	            }
	        }
	    }
	    
	    for(int i=0;i<m;i++)
	    {
	        System.out.println(a.get(i)+" ");
	    }
	    
	}

}




//
/*
public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> A) {
	    int m, n;
	    
	    if (A == null)
	        return;
	    
	    m = A.size();
	    n = A.get(0).size();
	    
	    if (n == 0)
	        return;
	    
	    for (int i = 0; i < m; i++) {
	        boolean zero = false;
	        for (int j = 0; j < n; j++) {
	            if (A.get(i).get(j) == 0)
	                zero = true;
	        }
	        
	        if (zero)
	            clearRow(A, i, m, n, 2);
	        
	    }
	    
	    for (int i = 0; i < n; i++) {
	        boolean zero = false;
	        for (int j = 0; j < m; j++) {
	            if (A.get(j).get(i) == 0)
	                zero = true;
	        }
	        
	        if (zero)
	            clearCol(A, i, m, n, 2);
	        
	    }
	    
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            if (A.get(i).get(j) == 2)
	                A.get(i).set(j, 0);
	        }
	    }
	    
	}
	
	
	public void clearRow(ArrayList<ArrayList<Integer>> A, int row, int m, int n, int value) {
	    
	    for (int i = 0; i < n; i++) {
	        if (A.get(row).get(i) == 1)
	            A.get(row).set(i, value);
	    }
	}
	
	public void clearCol(ArrayList<ArrayList<Integer>> A, int col, int m, int n, int value) {
	    for (int i = 0; i < m; i++) {
	        if (A.get(i).get(col) == 1)
	            A.get(i).set(col, value);
	    }
	}
	
}*/
