package dp;
import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class InteligentGirl {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			String input=br.readLine().trim();
			String[] arr=input.split("");
			int length=input.length();
			for(int i=0;i<length;i++) {
				Stream<String> in=Arrays.stream(Arrays.copyOfRange(arr,i,length));
				System.out.print(in.filter(a->Integer.valueOf(a)%2==0).count()+" ");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
