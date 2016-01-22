import java.util.*;
public class Nearest {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println(prevSmaller(list));
	}
	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		int ar[]= new int[arr.size()];
		for(int i=0;i<arr.size();i++)
		{
			ar[i]=arr.get(i);
		}
		SortedSet<Integer> set = new TreeSet<Integer>();
		
		
		for(int i=0;i<arr.size();i++)
		{
			
			boolean flag=false;
			int leastmaxnumber=0;
		      for(int x=i;x>=0;x--) {
		       int element=ar[x];
		         if(element<arr.get(i))
		         {
		        	 leastmaxnumber=element;
		        	flag=true;break;
		         }
		      }
		      if(flag)
		      {
		    	  result.add(leastmaxnumber);
		      }
		      else
		      {
		    	  result.add(-1);
		      }
		}
		return result;
    }
}
/*
34 35 27 42 5 28 39 20 28
*/
