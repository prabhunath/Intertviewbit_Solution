import java.util.*;
public class Rank {
  public static void main(String args[]) {
	  String str="view";
			  
	  int n = str.length(); 
	  int rank = 0; 
	  for (int i = 0; i < n-1; i++) { 
	  int x=0; 
	  for (int j = i+1; j<n ; j++) { 
	  if (str.charAt(i) > str.charAt(j)) 
	  x++; 
	  } 
	  rank = rank+ x*((n-i-1)) ;
	  } 
	  System.out.println(rank+1);
  }
  public static ArrayList<String> list= new ArrayList<String>();
	public static  int findRank(String a) {
		a="abc";
		long result=0;
		 permuteString("", a);
		 list.sort(null);
		 long l=0;
			while(l<list.size())
			{
				
			}
		return (int)(result%1000003);
	}
	
  public static void permuteString(String beginningString, String endingString) {
    if (endingString.length() <= 1)
    {
      System.out.println(beginningString + endingString);
      list.add(beginningString + endingString);
    }
    else
      for (int i = 0; i < endingString.length(); i++) {
        try {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

          permuteString(beginningString + endingString.charAt(i), newString);
        } catch (StringIndexOutOfBoundsException exception) {
          exception.printStackTrace();
        }
      }
    
    
    
  }
}