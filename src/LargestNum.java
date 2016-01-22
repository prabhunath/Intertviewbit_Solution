import java.util.*;
public class LargestNum {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str[]={"3", "30", "34", "5", "9"};
		Arrays.sort(str);
		//System.out.println(Arrays.toString(str));
		int n=sc.nextInt();
		
		List<Integer>a= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		String s=largestNumber(a);
		System.out.println("Sol:"+s);
	}
	public static String largestNumber(final List<Integer> a) {
		String result="";
	    int size=a.size();
	    ArrayList<String> list= new ArrayList<String>();
	    String temp="";
	    for(int i=0;i<size;i++)
	    {
	    	list.add(a.get(i)+"");
	    	temp+=a.get(i);
	    }
	    temp=temp.replaceAll("0", "");
	    if(temp.length()==0)
	    {
	    	return "0";
	    }
	    else
	    {
	    list.sort(new MySort());
	    for(int i=0;i<list.size();i++)
	    {
	    	result=list.get(i)+result;
	    }
	    return result;
	    }

	    
	}

}
class MySort implements Comparator
{
	public int compare(Object o1 ,Object o2)
	{
		// first append Y at the end of X
		String X=o1.toString();
		String Y=o2.toString();
	    String XY = X+Y;
	 
	    // then append X at the end of Y
	    String YX = Y+X;
	 
	    // Now see which of the two formed numbers is greater
	    return XY.compareTo(YX) ;
	}
	
}

/*
5
3 30 34 5 9
*/

//INTERVIEW BIT SOLUTION
/*

public class Solution {
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> A) {
	    StringBuffer strBuf = new StringBuffer();
	    Node num[];
	    int i = 0;
	    
	    num = new Node[A.size()];
	    
	    for (int n : A) {
	        num[i] = new Node(n);
	        i++;
	    }
	    
	    Arrays.sort(num);
	    
	    for (Node n : num) {
	        if (n.number == 0 && strBuf.length() != 0)
	            continue;
	        strBuf.append(n.number);
	    }

	    
	    return strBuf.toString();
	}
	
	class Node implements Comparable<Node> {
	    
	    int number;
	    
	    public Node(int number) {
	        this.number = number;
	    }
	    
	    @Override
	    public int compareTo(Node o) {
	        String first = String.valueOf(this.number) + String.valueOf(o.number);
	        String second = String.valueOf(o.number) + String.valueOf(this.number);
	        
	        return second.compareTo(first);
	    }
	    
	}
}
*/