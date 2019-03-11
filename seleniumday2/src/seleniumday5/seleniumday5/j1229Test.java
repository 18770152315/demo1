package seleniumday5.seleniumday5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class j1229Test {

	  @DataProvider
	  public Object[][] user(){  
		  return new Object[][] {
			  {"zhangsan","12"},{"lisi","13"}
		  };
	  }
	  
	  @Test(dataProvider="user",timeOut=2000)
	  public void f(String name,String age){
		  System.out.println(name+age);
	  }
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");// 4
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");// 5
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");// 3
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");// 6
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");// 2
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");// 7
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");// 1只执行一次
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");// 8
  }

  @Test
  public void main() {
    throw new RuntimeException("Test not implemented");
  }
}
