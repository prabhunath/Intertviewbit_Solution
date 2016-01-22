import java.util.*;
public class Combinations {
	public static void main(String...okko)
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		ArrayList<ArrayList<Integer>> result=combine(n,k);
		for(int i=0;i<result.size();i++)
		{
			System.out.println(result.get(i));
		}
	}
	public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		if (n <= 0 || n < k)
			return result;
	 
		ArrayList<Integer> item = new ArrayList<Integer>();
		dfs(n, k, 1, item, result); // because it need to begin from 1
	 
		return result;
	}
	 
	private static void dfs(int n, int k, int start, ArrayList<Integer> item, ArrayList<ArrayList<Integer>> res) {
		System.out.println("CALLED:" +n+" "+k+" "+start+" "+item+"  resultsize="+res.size());
		if (item.size() == k) {
			res.add(new ArrayList<Integer>(item));
			return;
		}
	 
		for (int i = start; i <= n; i++) {
			item.add(i);
			System.out.println("ITEM:"+item+"  itemsize="+item.size());
			dfs(n, k, i + 1, item, res);
			item.remove(item.size() - 1);
		}
	}

}
