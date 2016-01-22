import java.util.*;
 class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }

public class Solution {
	public ListNode detectCycle(ListNode a) {
	    ListNode temp=a;
	    if(a==null)
	    {
	        return a;
	    }
	    String identity="";
	   Set ls= new TreeSet();
	    while(temp!=null)
	    {
	        if(ls.contains(temp.hashCode()) )
	        {
	            return temp;
	        }
	        else
	        {
	            
	            ls.add(temp.hashCode());
	            temp=temp.next;
	        }
	        
	    }
	    return null;
	}
}
