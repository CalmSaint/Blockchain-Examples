package julycircuits;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class SuperBalancedBracket {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			Integer testCase=Integer.valueOf(br.readLine().split("")[0]);
			for (int i = 0; i < testCase; i++) {
				String input=br.readLine();
				System.out.println(SuperBalancedBracket.countSuper(input));;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public static Integer countSuper(String input) {
		//get all subsequences
		int totalSeq=(int)Math.pow(2, input.length());
		HashMap<String,Integer> seqMap=new HashMap<String, Integer>();
		String s="";
		for(int i=1;i<totalSeq;i++) {
			for(int j=0;j<input.length();j++) {
				if(BigInteger.valueOf(i).testBit(j)) {
					s+=input.charAt(j);
					if(s.length()%2==0)
						seqMap.put(s,s.length());
				}
			}
		}
		System.out.println(seqMap);
		return 0;
	}

}
