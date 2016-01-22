import java.util.*;
public class RAIN {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
	}
	public class Solution {
		// DO NOT MODIFY THE LIST
		public int trap(final List<Integer> A) {
		    int n = A.size();
		    int rightMax[], leftMax[];
		    int left, right;
		    int res = 0;
		    
		    rightMax = new int[n];
		    leftMax = new int[n];
		    
		    left = 0;
		    right = 0;
		    
		    for (int i = 0; i < n; i++) {
		        leftMax[i] = left;
		        if (left < A.get(i))
		            left = A.get(i);
		    }
		    
		    for (int i = n - 1; i >= 0; i--) {
		        rightMax[i] = right;
		        if (right < A.get(i))
		            right = A.get(i);
		    }
		    
		    for (int i = 0; i < n; i++) {
		        
		        res += Math.max(0, Math.min(leftMax[i], rightMax[i]) - A.get(i));
		        
		    }
		    
		    
		    return res;
		}
	}

}
