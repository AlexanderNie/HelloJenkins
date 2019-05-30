package com.welearn.test;

import org.junit.Assert;
import org.junit.Test;

import com.welearn.entities.Employee;

public class TestEmployee {

	@Test
	public void testIsRetried() {
		Assert.assertFalse(new Employee("Alex", 95).isRetried());
	}

}
