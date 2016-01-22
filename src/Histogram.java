import java.util.*;
public class Histogram {
	public int largestRectangleArea(ArrayList<Integer> A) {
	    Stack<Integer> stack = new Stack<>();
	    int n = A.size();
	    int res = 0;
	    int prevMin[], nextMin[];
	    int cur;
	    int idx;
	    int prev, next;
	    
	    prevMin = new int[n];
	    nextMin = new int[n];
	    
	    for (int i = 0; i < n; i++) {
	        
	        cur = A.get(i);
	        
	        while (!stack.isEmpty() && cur <= A.get(stack.peek())) {
	            stack.pop();
	        }
	        
	        if (stack.isEmpty()) {
	            prevMin[i] = -1;
	        } else {
	            prevMin[i] = stack.peek();
	        }
	        
            stack.push(i);
	        
	    }
	    
	    stack.clear();
	    
	    for (int i = n - 1; i >= 0; i--) {
	        cur = A.get(i);
	        
	        while (!stack.isEmpty() && cur <= A.get(stack.peek())) {
	            stack.pop();
	        }
	        
	        if (stack.isEmpty())
	            nextMin[i] = n;
	        else
	            nextMin[i] = stack.peek();
	            
	        stack.push(i);
	    }
	    
	    for (int i = 0; i < n; i++) {
	        prev = prevMin[i];
	        next = nextMin[i];
	        int area = (next - prev - 1) * A.get(i);
	        res = Math.max(res, area);
	    }
	    
	    
	    return res;
	}
}