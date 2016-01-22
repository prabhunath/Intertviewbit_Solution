import java.util.*;
public class Hotel {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> arrive= new ArrayList<Integer>();
		ArrayList<Integer> depart= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			arrive.add(sc.nextInt());
		}
		for(int i=0;i<n;i++)
		{
			depart.add(sc.nextInt());
		}
		int k=sc.nextInt();
		System.out.println(hotel(arrive, depart, k));
		
	}
	public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int ar=0, de=0, nos=0,satisfy=0 , roomoccupancy=0;
        while(ar<arrive.size() && de<depart.size()){
            if(arrive.get(ar)<depart.get(de)){
                ar++;
                nos++;
                roomoccupancy++;
                satisfy= Math.max(nos,satisfy);
            }else{
                de++;
                nos--;
            }
        }
        return (satisfy<=K)?true:false;
    }/*
	public static boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
		boolean result=true;
		arrive.sort(null);
		depart.sort(null);
		System.out.println(arrive+"\n"+depart);
		int count=0;
		for(int i=0;i<arrive.size()-1;i++)
		{
			int x=arrive.get(i);
			int y=depart.get(i);
			for(int j=i+1;j<arrive.size();j++)
			{
				System.out.print("## x= "+x+" "+arrive.get(j) +"   :::::  "+"y="+y);
				if(x<=arrive.get(j) && arrive.get(j)<=y && i!=j)
				{
					count++;
					System.out.print("  count="+count);
				}
				else
				{
					System.out.println("breaked");
					break;
				}
				
				System.out.println();
			}
			for(int j=0;j<depart.size();j++)
			{
				System.out.print("x= "+x+" :::::  "+"y="+y+" "+depart.get(j));
				
				if(y>depart.get(j) && i!=j)
				{
					count--;
					System.out.print("  count="+count);
				}
				else
				{
					System.out.println("break;;;");
					break;
				}
				
				System.out.println();
			}
			System.out.println(x+"  "+y+"  count= "+count);
			if(count>=K)
			{
				return false;
			}
			count=0;
		}
		
		return result;
    }*/

}
/*
26
A : [ 13 14 36 19 44 1 45 4 48 23 32 16 37 44 47 28 8 47 4 31 25 48 49 12 7 8 ]
B : [ 28 27 61 34 73 18 50 5 86 28 34 32 75 45 68 65 35 91 13 76 60 90 67 22 51 53 ]
C : 23


10
1 4 4 7 8 8 12 13 14 16
5 13 18 22 27 28 28 32 34 34
12
*/