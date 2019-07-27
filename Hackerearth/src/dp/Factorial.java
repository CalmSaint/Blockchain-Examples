package dp;
import java.io.*;

public class Factorial {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			Integer testCase=Integer.valueOf(br.readLine());
			long arr[]=new long[100002];
			arr[0]=arr[1]=1;
			long modulo=1000000007L;
			while(testCase-->0) {
				int n=Integer.valueOf(br.readLine());
				System.out.println(factorial(n,arr,modulo));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	static long factorial(int n,long[] arr,long modulo) {
		
		if(n<=1)
			return 1L;
		if(arr[n]==0) {
			return arr[n]=((n)*(factorial(n-1,arr,modulo)))%modulo;
		}
		else
			return arr[n];
	}

}
