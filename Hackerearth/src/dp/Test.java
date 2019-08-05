package dp;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;
class Test {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextLong();
        long out = solve(arr, N);
        System.out.println(out);
        sc.close();
    }
    public static long solve(long[] arr, long N){
        int arrLength=arr.length;
        
        HashSet<HashSet<Integer>> aa=new HashSet<>();  
        for(int i=0;i<arrLength;i++){
            for(int j=0;j<arrLength;j++){
                if(i!=j) {
                	HashSet<Integer> s=new HashSet<Integer>();
                    s.add(i);
                    s.add(j);
                	if(aa.contains(s))
                		continue;
                	else if(arr[j]==arr[i]*arr[i]) {
                		aa.add(s);
                	}
                }
                	
            }
        }
        return aa.size();
        
    }
    
}






