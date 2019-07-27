package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class WinTheGame {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			Integer testCase=Integer.valueOf(br.readLine());
			DecimalFormat nFormat=new DecimalFormat("#0.000000");
			while(testCase-->0) {
				String[] input=br.readLine().split("\\s+");
				double red=Double.valueOf(input[0]);
				double green=Double.valueOf(input[1]);
				if(green==0 && red==0) {
					System.out.println("1.000000");
					continue;
				}
				if(red==0) {
					System.out.println("1.000000");
					continue;
				}
				System.out.println(nFormat.format(winProb(red,green)));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static double winProb(double red,double green) {
		double win=red/(red+green);
		if(green>=2) {
			win+=(green/(red+green))*((green-1)/(red+green-1))*winProb(red,green-2);
		}
		return win;
	}
}
