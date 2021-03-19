package com.testng.java;

import org.testng.annotations.Test;

public class TestNG_groups {
	@Test(groups = { "bonding" })
	public void group_method() {
		System.out.println("inside group");
	}

	@Test(groups = { "bonding" })
	public void group_method1() {
		System.out.println("inside group-2");
	}
}
