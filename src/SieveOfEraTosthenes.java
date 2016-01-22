import java.util.*;
public class SieveOfEraTosthenes {
	public static void main(String...okok)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Sieve(n));
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
// total time complexity is O(nlog(n))