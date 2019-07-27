package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//also see the output to recognize the problem
public class WackyWorkouts {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			Integer testCase=Integer.valueOf(br.readLine());
			int mod=1000000007;
			//creating a matrix for storing the data
			long fib[][]=new long[2][2];
			
			while(testCase-->0) {
				fib[0][0]=1;fib[0][1]=1;fib[1][0]=1;fib[1][1]=0;
				Long input=Long.valueOf(br.readLine());
				if(input==0)
					System.out.println(0);
				power(fib,input+1);
				System.out.println(fib[0][0]%mod);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void multiply(long[][] fib,long[][] temp) {
		int mod=1000000007;
		long w=((fib[0][0]*temp[0][0]))+((fib[0][1]*temp[1][0]));
		long x=((fib[0][0]*temp[0][1]))+((fib[0][1]*temp[1][1]));
		long y=((fib[1][0]*temp[0][0]))+((fib[1][1]*temp[1][0]));
		long z=((fib[1][0]*temp[0][1]))+((fib[1][1]*temp[1][1]));
		fib[0][0]=w%mod;
		fib[0][1]=x%mod;
		fib[1][0]=y%mod;
		fib[1][1]=z%mod;
	}
	
	public static void power(long[][] matrix,long n) {
		if(n==0 || n==1)
			return;
		long temp[][] = new long[][]{{1,1},{1,0}};
		power(matrix,n/2);
		multiply(matrix,matrix);
		if (n%2 != 0) 
			multiply(matrix,temp); 
		} 
	}


