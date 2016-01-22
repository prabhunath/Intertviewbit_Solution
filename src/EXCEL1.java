import java.util.*;
public class EXCEL1 {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		System.out.println(titleToNumber(str));
	}
	public static int titleToNumber(String a) {
		int result=0;
		for(int i=0;i<a.length();i++)
		{
			int xx=a.charAt(i)-'A'+1;
			result=result*26+xx;
		}
		return result;
	}
}
/*
  
A->1	64-'A'+1 =1
B->2	65-'A'+1 =2
C->3	66-'A'+1 =3
.
.
.
Z->26	80-'A'+1=26
AA->27  (1+0*26)+26=27
AB->28	(1+0*26)+27=28
.
.
AAA->703 ((1+0*26)+26)*26+1  := 703
AAB->704 ((1+0*26)+26)*26+2  := 704
.
.
AAAA   ((((1+0*26)*26+1)*26+1)*26+1) =18279
ABCD	((((1+0*26)*26+2)*26+3)*26+4)

*/