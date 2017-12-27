package bloom_filter;

import static org.junit.Assert.*;


import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;


import org.junit.Before;
import org.junit.Test;

public class BloomFilterTestCase {

	MessageDigest md5;
	BloomFilter bf;
	
	@Before
	public void setUp() throws Exception {
		 md5 = MessageDigest.getInstance("MD5");
		 bf = new BloomFilter(16);
	}

	@Test
	public void testMD5HashFunctionOfHelloWorldAreEquals() throws UnsupportedEncodingException {
		assertTrue(Arrays.equals(md5.digest("Hello World".getBytes(StandardCharsets.UTF_8)),
				md5.digest("Hello World".getBytes("UTF-8"))));
	}
	
	@Test
	public void testAnInsertPutsSomeBFElementsToTrue() {
		bf.insert("Hello World");
		boolean test = false;
		for(boolean b: bf.getArray()) {
			if(b) {
				test = b;
				}
			}
		assertTrue(test);
	}
	
	@Test
	public void testMatchAfterElementInsert() {
		bf.insert("Hello World");
		assertTrue(bf.contains("Hello World"));
	}
	
	@Test
	public void testShouldNoMatchWithNewElementEmptyBF() {
		assertFalse(bf.contains("Hello Mars"));
	}
	
	@Test
	public void testShouldNoMatchWithNewElementWithAnotherElementIn() {
		bf.insert("Hello World");
		assertFalse(bf.contains("Hello Mars"));
	}
	
	

}
