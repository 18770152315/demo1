package seleniumday4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import seleniumday4.j1225;

public class j1225Test {
	j1225 lo=new j1225();
	@Before
	public void setUp() throws Exception {
		lo.open();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTestlogin() {
		lo.testlogin();
		String ti=lo.driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]/div/span/font/strong")).getText();
		assertEquals("欢迎光临在线考试系统",ti);
		String name=lo.driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/p/span/font")).getText();
		assertEquals("123",name);

	}

}
