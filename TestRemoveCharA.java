
package junitTask;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRemoveCharA {

/*	@Before
	public void setUp() throws Exception {
		RemoveCharA remove = new RemoveCharA();
	}*/
	
	@Test
	public void test1() {
		RemoveCharA remove = new RemoveCharA();
	String actual = remove.removecharA("ABCD");
	assertEquals("BCD",actual);
	
	}
	
	@Test
	public void test2() {
		RemoveCharA remove = new RemoveCharA();
	String actual = remove.removecharA("AACD");
	assertEquals("CD",actual);
	}
	
	@Test
	public void test3() {
		RemoveCharA remove = new RemoveCharA();
	String actual = remove.removecharA("BACD");
	assertEquals("BCD",actual);
	}
	
	@Test
	public void test4() {
		RemoveCharA remove = new RemoveCharA();
	String actual = remove.removecharA("BBAA");
	assertEquals("BBAA",actual);
	}
	
	@Test
	public void test5() {
		RemoveCharA remove = new RemoveCharA();
	String actual = remove.removecharA("AABAA");
	assertEquals("BAA",actual);
	}
	

}
