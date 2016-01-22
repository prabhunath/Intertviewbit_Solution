import java.util.*;
public class Braces {
	public static void main(String...okoki)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		System.out.println(braces(str));
	}
	public static int braces(String str) {
		
		int N = str.length();
		Stack<Character> Stk= new Stack<Character>();
	    //stack<char> Stk;
	 
	    for(int i = 0; i < N; ++i) {
	         
	        if(str.charAt(i) == ')') {
	         
	            int cnt = 0;
	         
	            while(Stk.peek() != '(') {
	                    Stk.pop();
	                    cnt++;
	            }
	         
	            Stk.pop();
	            if(cnt < 2)
	                    return 1;
	        } 
	         
	        else {
	            Stk.push(str.charAt(i));
	        }
	        System.out.println(Stk);
	    }
	    System.out.println("stk: "+Stk);  
	    boolean is = true;
	     
	    while(Stk.size()>0) {
	         
	        if(Stk.peek() == '(' || Stk.peek() == ')') {
	                is = false;
	                break;
	        }
	        Stk.pop();
	    }
	 
	    if(!is)
	    {
	    		return 1;
	    }
	    return 0;
	}

}
