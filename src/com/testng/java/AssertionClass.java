package com.testng.java;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class AssertionClass {

	@Test
	public void assertDemo() {
		
	      String str1 = new String ("abc");
	      String str2 = new String ("abc");
	      String str3 = null;
	      String str4 = "abc";
	      String str5 = "abc";			
	      int val1 = 5;
	      int val2 = 6;
		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };
		assertTrue(true);
		assertEquals(expectedArray, resultArray);
		assertFalse(val1 > val2);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4,str5);
		assertNotSame(str1,str3);
//		assertArrayEquals(expectedArray, resultArray);
		
	}
}
