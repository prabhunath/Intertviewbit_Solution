import java.util.*;
public class REVSTRING_STACK {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(reverseString(str));
	}
public static String reverseString(String a) {
	    
	    Stack<String> st= new Stack<String>();
	    for(int i=0;i<a.length();i++)
	    {
	        st.push(a.charAt(i)+"");
	    }
	    String result="";
	    for(int i=0;i<a.length();i++)
	    {
	        result+=st.pop();
	    }
	    
	   return result;
	}

}
