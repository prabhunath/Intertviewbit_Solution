import java.util.*;
public class PrimeSum {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		 ArrayList<Integer> solution=new ArrayList<Integer>();
		 solution=primesum(n);
		 System.out.println(solution);
	}
	
	
    public static ArrayList<Integer> primesum(int a) {
        
        ArrayList<Integer> solution=new ArrayList<Integer>();
        ArrayList<Integer> prime=new ArrayList<Integer>();
        prime=Sieve(a);
        int size=prime.size();
       //System.out.println(prime);
        for(int i=0;i<size;i++)
        {
            for(int j=size-1;j>=i;j--)
            {
            	int sum=(prime.get(i)+prime.get(j));
            	//System.out.println(sum+"  "+prime.get(i)+"  "+prime.get(j)+"  "+a+"  "+((sum==a)));
                if(sum==a)
                {
                	if(solution.isEmpty())
                	{
	                    solution.add(prime.get(i));
	                    solution.add(prime.get(j));
                	}
                	else
                	{
                		int aa,b,c,d;
                		c=prime.get(i);
                		d=prime.get(j);
                		aa=solution.get(solution.size()-2);
                		b=solution.get(solution.size()-1);
                		if(aa<=c && b<d)
                		{
                			solution.add(c);
                			solution.add(d);
                		}
                	}
                }
            }
        }
        
        return solution;
        
    }
    public static ArrayList<Integer> Sieve(int n)
	{
		ArrayList<Integer> list= new ArrayList<Integer>();
		int primes[]= new int[n+1];
		for(int i=0;i<=n;i++)   // time taken is n times.
		{
			primes[i]=1;
		}
		primes[0]=0;
		primes[1]=0;
		for(int i=2;i<=n;i++)					// time taken is n times.
		{
				if(primes[i]==1)
				{
					for(int j=2;i*j<=n;j++)			// time taken is n/2+ n/3 + n/4 + n/5 ... n/n => log(n);
					{
						primes[i*j]=0;
					}
				}
		}
		for(int i=0;i<=n;i++)
		{
			if(primes[i]==1)
			{
				list.add(i);
			}
		}
		return list;
			
	}
}
/*

public class Solution {
public ArrayList<Integer> primesum(int A) {
   ArrayList<Integer> arr = new ArrayList<Integer>();
   for (int i = 2; i < A; i++) {
       if (isPrime(i) && isPrime(A - i)) {
           arr.add(i);
           arr.add(A - i);
           return arr;
       }
   }
   return arr;
}

public boolean isPrime(int number) {
   for (int i = 2; i <= Math.sqrt(number); i++) {
       if (number % i == 0) {
           return false;
       }
   }
   return true;
}
}
*/