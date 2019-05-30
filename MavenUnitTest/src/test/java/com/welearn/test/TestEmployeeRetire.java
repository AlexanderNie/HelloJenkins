package com.welearn.test;

import org.junit.Assert;
import org.junit.Test;

import com.welearn.entities.Employee;

public class TestEmployeeRetire {

	@Test
	public void testEmpMoreThan65() {
		Assert.assertTrue(new Employee("Alex", 95).isRetried());
	}
	
	@Test
	public void testEmpLessThan65() {
		Assert.assertFalse(new Employee("Alex", 30).isRetried());
	}
	
	@Test
	public void testEmpEqu65() {
		Assert.assertTrue(new Employee("Alex", 65).isRetried());
	}

}
