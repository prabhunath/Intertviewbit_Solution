import java.util.*;
public class Slidingmax {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		int w=sc.nextInt();
		ArrayList<Integer> result= slidingMaximum(list,w);
		System.out.println(result);
	}
	public static  ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
		int max=Integer.MIN_VALUE;
		int pos=0;
		ArrayList<Integer> result= new ArrayList<Integer>();
		for(int i=0;i<b;i++){
			if(max<a.get(i))
			{
				max=a.get(i);
				pos=i;
			}
			
		}
		result.add(max);
		
		for(int i=b;i<a.size();i++)
		{
			//System.out.println("Initial "+max+" between("+(i-b)+" , "+i+")"+" result= "+result+"  a.get(i)="+a.get(i)+" i-pos="+(i-pos)+"  i="+i+" pos="+pos);
			if(a.get(i)>=max && i-pos<b)
			{
				max=a.get(i);
				pos=i;
				result.add(max);
			}
			
			else if(i-pos>=b)
				{
					max=Integer.MIN_VALUE;
					for(int ii=i;ii>(i-b);ii--){
						if(max<a.get(ii))
						{
							max=a.get(ii);
							pos=ii;
						}
						
				}
					result.add(max);	
				}
				else if(a.get(i)<max)
				{
					result.add(max);
				}

			}
		return result;
	}

}
