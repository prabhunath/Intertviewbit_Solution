import java.util.*;
public class Roman2Int {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		System.out.println("ANS : "+romanToInt(str));
		
	}
	public static int romanToInt(String a) {
	    HashMap <Character,Integer>rom= new HashMap<Character,Integer>();
	    rom.put('I',1);
	    rom.put('V',5);
	    rom.put('X',10);
	    rom.put('L',50);
	    rom.put('C',100);
	    rom.put('D',500);
	    rom.put('M',1000);
	   
	    char roman[]=a.toCharArray();
	    int len=roman.length;
	     int num=(int)rom.get(roman[len-1]);
	    for(int i=len-2;i>=0;i--)
	    {
	       // System.out.println("num="+num+" "+(roman[i+1])+"  "+ roman[i]+" i= "+i+"  diff= "+(roman[i+1]-roman[i]));
	        if(rom.get(roman[i+1])-rom.get(roman[i])<=0)
	        {
	            num=(int)Math.abs((int)rom.get(roman[i])+num);
	        }
	        else
	        {
	             num=num-(int)rom.get(roman[i]);
	        }
	    }
	    return num;
	}

}
