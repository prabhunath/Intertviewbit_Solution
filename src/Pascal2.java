import java.util.*;
public class Pascal2 {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> result= new ArrayList<Integer>();
		result=getRow(sc.nextInt());
		System.out.println(result);
	}
	public static ArrayList<Integer> getRow(int a) {
		ArrayList<Integer> result= new ArrayList<Integer>();
		
		
		
		int rows = a;
        for(int i =0;i<rows;i++) {
            int number = 1;
            for(int j=0;j<=i;j++) {
            	if(i==rows-1)
            	{
                 //System.out.format("%4d",number);
                 result.add(number);
                 }
                 number = number * (i - j) / (j + 1);
                
            }
           // System.out.println();
        }
		
		
		
		
		
		return result;
	    
	}
	
	

}
