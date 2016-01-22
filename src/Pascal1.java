import java.util.*;
public class Pascal1 {
	public static void main(String...olkk)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println(generate(sc.nextInt()));
		
	}
	public static ArrayList<ArrayList<Integer>> generate(int a) {
		ArrayList<ArrayList<Integer>> result= new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<a;i++)
		{
			result.add(new ArrayList<Integer>());
		}
		int rows = a;
        for(int i =0;i<rows;i++) {
            int number = 1;
            for(int j=0;j<=i;j++) {
            	
                // System.out.format("%4d",number);
                 result.get(i).add(number);
                 
                 number = number * (i - j) / (j + 1);
                
            }
           // System.out.println();
        }
		return result;
	}

}
