package bloom_filter;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BloomFilter {
	
	private boolean[] array;
	private int length;
	private MessageDigest md5;

	public BloomFilter(int length) throws NoSuchAlgorithmException {
		this.length = length;
		array = new boolean[length];
		reset();
		md5 = MessageDigest.getInstance("MD5");
	}
	
	public void insert(String input) {
		byte[] hash = md5.digest(input.getBytes(StandardCharsets.UTF_8));
		for(byte b: hash){
			array[Math.abs(b % length)] = true;
		}
	}
	
	public boolean contains(String input) {
		byte[] hash = md5.digest(input.getBytes(StandardCharsets.UTF_8));
		for(byte b: hash){
			if(!array[Math.abs(b % length)]){
				return false;
			}
		}
		return true;
	}
	
	public void reset() {
		for(int i=0;i<length;i++){
			array[i] = false;
		}
	}
	
	public boolean[] getArray() {
		return this.array;
	}
}
