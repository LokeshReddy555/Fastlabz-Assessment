import java.util.*;

public class Assessment
{
	public static void main(String[] args) {
		int a[] = {2,2,3,4};
		System.out.println(solve(a));
		a = new int[]{1,2,2,3,3,3};
		System.out.println(solve(a));
		a = new int[]{2,2,2,3,3};
		System.out.println(solve(a));
	}
	public static int solve(int[] a){
	    HashMap<Integer,Integer> hm = new HashMap<>();
	    for(int i=0;i<a.length;i++){
	        if(hm.containsKey(a[i])){
	            hm.put(a[i],hm.get(a[i])+1);
	        }
	        else{
	            hm.put(a[i],1);
	        }
	    } int res = Integer.MIN_VALUE;
	    for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
	        if(entry.getKey() == entry.getValue()){
	            res = Math.max(res,entry.getKey());
	        }
	    } 
	    res = res == Integer.MIN_VALUE ? -1 : res;
	    return res;
	}
}
