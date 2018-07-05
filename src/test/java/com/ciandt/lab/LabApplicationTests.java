package com.ciandt.lab;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LabApplicationTests {

	@Test
	public void contextLoads() {
		int soma = 2+2;
		Assert.assertTrue(5 > soma);
	}

}
