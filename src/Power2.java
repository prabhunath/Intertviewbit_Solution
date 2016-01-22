import java.util.*; 
public class Power2 {
	public static void main(String...oko)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPower(n));
	}
	public static boolean isPower(int x) {
	     
	    if (x <= 1) return true;
	     
	    for (int base = 2; base < x && base < Integer.MAX_VALUE / base; base++) {
	        int temp = base; 
	        while (temp <= x && temp <Integer.MAX_VALUE / base) {
	            temp *= base;
	            if (temp == x) return true;
	        }
	    }
	     
	    return false;
	}

}
