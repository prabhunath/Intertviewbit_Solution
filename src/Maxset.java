import java.util.*;
public class Maxset {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		list=maxset(list);
		System.out.println(list);
	}

	public static  ArrayList<Integer> maxset(ArrayList<Integer> a) {
		a.add(-100);
	    ArrayList<Integer> result= new ArrayList<Integer>();
	    ArrayList<Integer> temp= new ArrayList<Integer>();
	    long sum=0;
	    long prevsum=sum;
	    for(int i=0;i<a.size();i++)
	    {
	        if(a.get(i)>=0)
	        {
	            sum+=a.get(i);
	            temp.add(a.get(i));
	        }
	        else
	        {
	            if(sum>=prevsum)
	            {
	            	if(sum>prevsum)
	            	{
		                prevsum=sum;
		                result.clear();
		                result.addAll(temp);
	            	}
	            	else
	            	{
	            		if(sum==prevsum && temp.size()>result.size())
	            		{
	            			prevsum=sum;
			                result.clear();
			                result.addAll(temp);
	            		}
	            	}
	                
	            }
	              sum=0;
	              temp.clear();
	            
	        }
	        //System.out.println("SUM: "+sum+"  prevsum="+prevsum+"  temp="+temp+"  result="+result);
	       
	    }
	    return result;
	}
}
	   
	   


