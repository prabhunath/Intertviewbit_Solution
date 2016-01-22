import java.util.*;

public  class nextperm {
	public static void main(String[] args) {
	    int[] data = { 20,50,113 };
	    do {
	        System.out.println(Arrays.toString(data));
	    } while(permuteLexically(data));
	}
	
	public static boolean permuteLexically(int[] data) {
	    int k = data.length - 2;
	    while (data[k] >= data[k + 1]) {
	        k--;
	        if (k < 0) {
	            return false;
	        }
	    }
	    int l = data.length - 1;
	    while (data[k] >= data[l]) {
	        l--;
	    }
	    //swap(data, k, l);
	    
	    int temp=data[k];
	    data[k]=data[l];
	    data[l]=temp;
	    
	    int length = data.length - (k + 1);
	    for (int i = 0; i < length / 2; i++) {
	        //swap(data, k + 1 + i, data.length - i - 1);
	        
	        int tempp=data[k + 1 + i];
		    data[k + 1 + i]=data[data.length - i - 1];
		    data[data.length - i - 1]=tempp;
	        
	    }
	    return true;
	}
	
}