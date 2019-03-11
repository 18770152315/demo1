package ÷‹≤‚0108;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class zclogin0108Test {
	
  WebDriver driver;
  @Before
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
	    String url="https://baidu.com";
		driver.get(url);	
	
  }

  @After
  public void afterClass() {
	  
  }

  @Test
  public void login() throws InterruptedException { 
	  
		driver.findElement(By.xpath("//*[@id='u1']/a[7]")).click();	
	 	Thread.sleep(600);	
	 	driver.findElement(By.id("TANGRAM__PSP_10__footerULoginBtn")).click();
	 	
	 	String []name=new String[2];
	 	name[0]="18770152315";
	 	name[1]="18770152315";
	 	
	 	String []pwd=new String[2];
	 	pwd[0]="123456789";
	 	pwd[1]="1234567890";
	 	for(int i=0;i<2;i++){
	     driver.findElement(By.id("TANGRAM__PSP_10__userName")).sendKeys(name[i]);
		 driver.findElement(By.id("TANGRAM__PSP_10__password")).sendKeys(pwd[i]);
		 driver.findElement(By.id("TANGRAM__PSP_10__submit")).click();
		 boolean bool;   
		 bool=driver.findElement(By.id("TANGRAM__PSP_10__error")).isDisplayed();
		 if(bool==true){
				File screenShotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    	try{
		    		FileUtils.copyFile(screenShotFile, new File("D:/test.png"));
		    	}catch(IOException e){
		    		e.printStackTrace();
		        }
		    	driver.findElement(By.name("userName")).clear();
				driver.findElement(By.name("password")).clear();
		 }
		 else{
			System.out.println("µ«¬Ω≥…π¶");
		 }
	 	}	    
  }
}
