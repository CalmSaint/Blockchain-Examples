package src;

//this class is the main implementation of the chain
import java.util.*;
import com.google.gson.GsonBuilder;

@SuppressWarnings(value = { "unused" })
public class SampleChain {
	public static LinkedList<Block> blockchain=new LinkedList<>(); //static because all block instances will change this chain
	public static void main(String[] args) {
		//adding blocks to the chain
		blockchain.add(new Block("Hi this is the Genesis Block", "0"));
		blockchain.add(new Block("Hi, this is the Second block",blockchain.get(blockchain.size()-1).hash));
		blockchain.add(new Block("Hi, this is the third block",blockchain.get(blockchain.size()-1).hash));
		String chainInJson=new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
		System.out.println(chainInJson);
		
		System.out.println();
	}
	
	
}