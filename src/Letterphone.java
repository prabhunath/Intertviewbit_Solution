import java.util.*;
public class Letterphone {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
	}
	//public static ArrayList<String> letterCombinations(String a) {
	//	ArrayList<String> result= new ArrayList<String>();
	//	String temp="";
	//    ArrayList<String> container;
	//    ArrayList<String> ans;
	   // for(int i=0;i<a.length();i++)
	        //container.add(mapping(a.charAt(i)-'0'));
	    //combinations(ans,container,temp,0,0);
	    //return ans;
		//return result;
	//}
	public static String mapping(int d){
	    switch(d){
	        case 0:
	            return "0";
	        case 1:
	            return "1";
	        case 2:
	            return "abc";
	        case 3:
	            return "def";
	        case 4:
	            return "ghi";
	        case 5:
	            return "jkl";
	        case 6:
	            return "mno";
	        case 7:
	            return "pqrs";
	        case 8:
	            return "tuv";
	        case 9:
	            return "wxyz";
	        default:
	            return "";
	    }
	}
	void combinations(ArrayList<String> ans,ArrayList<ArrayList<String>> container,String s,int i,int j){
	    int n=container.size();
	    if(i==n){
	        ans.add(s);
	        return;
	    }
			s+="z";
	    for(;j<container.get(i).size();j++){
	       // s.charAt(s.length()-1)=container.get(i).get(j);
	       // combinations(ans,container,s,i+1,0);
	    }


	}
	
}

