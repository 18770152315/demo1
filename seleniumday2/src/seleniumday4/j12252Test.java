package seleniumday4;
import static org.junit.Assert.*;
//import org.junit.After;
import org.junit.AfterClass;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import seleniumday4.j12252;

public class j12252Test {
	static j12252 lz=new j12252();
	@BeforeClass
	public static void setUp() throws Exception {
		lz.stat();
		lz.login();
	}

	@AfterClass
	public static void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		lz.add();
       String idcard=lz.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[1]/div")).getText();
       assertEquals("153235165",idcard);
	}

	@Test
	public void testAdd1() {
       String name=lz.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/div")).getText();
       assertEquals("124",name);
	}
	
	@Test
	public void testAdd2() {
       String calss=lz.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[3]/div")).getText();
       assertEquals("153",calss);
	}
	
	@Test
	public void testAdd3() {
       String em=lz.driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[5]/div")).getText();
       assertEquals("12435265",em);
	}
	
}
