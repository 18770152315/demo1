package seleniumday2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class jzy1218 {

	private static WebElement mySelectElm;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u="file:///C:/Users/lalala/Desktop/selenium_html/demo1.html";
		driver.get(u);
        WebElement element1=driver.findElement(By.id("user"));
        element1.sendKeys("微雨苍蓝");//Iframe:Input
         Thread.sleep(1000);
        driver.findElement(By.className("baidu")).click();//Iframe:Link
         Thread.sleep(1000);
		driver.navigate().back();
		 Thread.sleep(1000);	 
		 WebElement element7= driver.findElement(By.name("select"));
		 Select select = new Select(element7);
		 select.selectByIndex(1);//Iframe:select 
         Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='radio']/input[3]")).click();//Iframe:RadioBox
         Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='checkbox']/input[3]")).click();
		driver.findElement(By.xpath("//*[@id='checkbox']/input[4]")).click();//Iframe:CheakBox
	     Thread.sleep(5000);
	    
	     String k=driver.findElement(By.className("button")).getAttribute("disabled");  //Iframe:Button
	     if(k.equals(true)){
	    	 driver.findElement(By.className("button")).click();
	     }
	     else{
	    	 System.out.println("boutton按钮不可点击");
	     }
	     Thread.sleep(5000);
	    driver.findElement(By.className("alert")).click(); 
	     Thread.sleep(1000);
	    Alert alert=driver.switchTo().alert();
		alert.accept();
		 Thread.sleep(1000);//Iframe:Alert
	    driver.findElement(By.id("load")).sendKeys("C:\\Users\\lalala\\Desktop\\新建文本文档.txt");;
		 Thread.sleep(1000);
		String s=driver.getWindowHandle(); 
		driver.findElement(By.className("open")).click();
		driver.switchTo().window(s);//Iframe：Open new windows
		 Thread.sleep(1000);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.className("over"))).perform();//Iframe:Action
		 Thread.sleep(5000);
		driver.findElement(By.className("wait")).click();//Iframe:Wait
		Thread.sleep(10000);	
	}

}
