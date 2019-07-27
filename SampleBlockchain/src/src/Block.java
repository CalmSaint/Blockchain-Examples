//this is the implementation of a specific block

package src;
import java.util.*;

@SuppressWarnings(value={"unused"})
public class Block {
	public String hash;
	public String previousHash;
	private String data; //data will be a generic data type
	private Long timeStamp; //as number ogf milliseconds
	public Block(String data, String previousHash) {
		this.data=data;
		this.previousHash=previousHash;
		this.timeStamp=new Date().getTime();
		this.hash=this.calculateHash(); //calcu;ating the hash of the block
	}
	
	public String calculateHash() {
		return HashHelper.applySha256(previousHash+data+Long.toString(timeStamp));
	}
	
	

}
