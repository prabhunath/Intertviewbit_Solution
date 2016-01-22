import java.util.*;
public class Insertpos {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a= new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		int b=sc.nextInt();
		System.out.println(searchInsert(a, b));
	}
	
public static  int searchInsert(ArrayList<Integer> a, int b) {
	int result=Arrays.binarySearch(a.toArray(), (Object)b);
	if(result<0)
	{
		
		if(a.get(0)>=b)
		{
			return 0;
		}
		if(a.get(a.size()-1)<=b)
		{
			return a.size();
		}
		for(int i=0;i<a.size();i++)
		{
			//System.out.println("jhgjhg");
			if(b<=a.get(i))
			{
				return i;
			}
		}
	}
	else
	{
		return result;
	}
	return result;
			
}
	
}
/*
 * 
public int searchInsert(ArrayList<Integer> A, int B) {
int size = A.size();
int index;

index = lowerBound(A, 0, size - 1, B);

if (index != -1)
    return index;
    
for (int i = 0; i < size; i++) {
    if (A.get(i) > B)
        break;
    index = i;
}

return index + 1;
}

public int lowerBound(final List<Integer> A, int start, int end, int num) {

int steps = end - start + 1;
int mid;
int low = -1;
int val;

while (steps > 0) {
    
    mid = (start + end) / 2;
    val = A.get(mid);
    
    if (num < val) {
        end = mid - 1;
    } else if (num > val) {
        start = mid + 1;
    } else {
        low = mid;
        end = mid - 1;
    }
    
    steps /= 2;
}

return low;

}
*/