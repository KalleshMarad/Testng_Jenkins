package com.testng.java;

import java.io.IOException;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_annotations {

	@Test
	public void test() {
		System.out.println(" inside method 1");
	}

	@Parameters(value = "user1")
	@Test
	public void test2(@Optional("default") String user1) throws IOException {
		System.out.println(" inside method 2 " + user1);
	}

	@Test(timeOut = 5000)
	public void timeOut() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("inside timeout method");
	}

	@Test
	public void priority_method3() {
		System.out.println("priority_method 3");
	}

	@Test(priority = 2, enabled = true)
	public void priority_method2() {
		System.out.println("priority_method 2");
	}

	@Test(dependsOnMethods = "priority_method3")
	public void priority_methodD() {
		System.out.println(" depends on priority_method3 ");
	}

	@Test(expectedExceptions = Exception.class)
	public void priority_methodExpn()  {
		int i=5/0;
		System.out.println(" priority method exception ");
	}
	
	@Test(invocationCount=5)
	public void testInvocation()
	{
		System.out.println("printing invocation");
	}
	
	
	@Test(enabled = false)
	public void ignored()
	{
		System.out.println("ignored_method");
	}
	
	@Test(groups= {"bonding","strong_ties"})
	public void groups()
	{
		System.out.println("inside group");
	}
}
