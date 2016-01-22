import java.util.*;
public class EXCEL2 {
	public static void main(String...ook)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(numberToTitle(n));
	}
	public static String numberToTitle(int n)
	{
		char atoz[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String Title="";
		while(n!=0)
		{
			
			int remind=(n-1+26)%26;
			n=(n-1)/26;
			Title=atoz[remind]+Title;
		}
		return Title;
	}

}
/*
 * INTERVIEW BIT SOLUTION

 public String convertToTitle(int A) {
	    char [] array = new char[26];
	    
	    for (int i = 0; i < 26; i++)
	        array[i] = (char) ('A' + i);
	        
	   int num = 26;
	   int index;
	   String res = "";
	   
	   while (A > 0) {
	       index = (A - 1 + num) % num;
	   //    index = (index - 1 + num) % num;
	       A = (A - 1) / num;
	       res = array[index] + res;
	   }
	   
	   return res;
	    
	}
	*/
