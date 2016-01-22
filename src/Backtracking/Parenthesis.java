package Backtracking;
import java.util.*;
public class Parenthesis {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		 brackets("",0,0,n);
		
		
	}
	public static void brackets(String output, int open, int close, int pairs)
	{
	    if(open == pairs && close == pairs)
	            System.out.println(output);
	    else
	    {
	            if(open<pairs)
	                    brackets(output+"(",open+1,close,pairs);
	            if(close<open)
	                    brackets(output+")",open,close+1,pairs);
	    }
	}
}
/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses of length 2*n.

For example, given n = 3, a solution set is:

"((()))", "(()())", "(())()", "()(())", "()()()"
Make sure the returned list of strings are sorted.
*/