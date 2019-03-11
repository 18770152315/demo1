package seleniumday2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class js3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//网页截图
//    String name="https://mail.126.com/";
//    System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");//打开目标浏览器
//	WebDriver driver=new ChromeDriver();
//	driver.get(name);
//	File screenShotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	try{
//		FileUtils.copyFile(screenShotFile, new File("D:/test.png"));
//	}catch(IOException e){
//		e.printStackTrace();
//	}
	
		
		//网页弹窗操作
//		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");//打开目标浏览器
//     	WebDriver driver=new ChromeDriver();
//		driver.get("C:\\Users\\lalala\\Desktop\\dialogs.html");
//		
//		driver.findElement(By.id("alert")).click();
//		Alert alert=driver.switchTo().alert();
//        alert.accept();
//	 
//	    driver.findElement(By.id("confirm")).click();
//	    Alert alert2=driver.switchTo().alert();
//	    //Thread.sleep(200);
//	    alert2.dismiss();
//	    
//	    driver.findElement(By.id("prompt")).click();
//	    Alert alert3=driver.switchTo().alert();
//	    alert3.sendKeys("kaka");
//	    alert3.accept();
//	    WebElement s= driver.findElement(By.xpath("/html/body"));
//	    String name=s.getText();
//	    System.out.println(name);
	 
	    //进入框架
//		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");//打开目标浏览器
//      WebDriver driver=new ChromeDriver();
//		driver.get("C://Users//lalala//Desktop//frame.html");
//		driver.switchTo().frame("frame");
//		driver.findElement(By.id("input1")).sendKeys("kaka");
//		driver.switchTo().defaultContent();返回之前的框架
		
		//下拉框
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");//打开目标浏览器
        WebDriver driver=new ChromeDriver();
		driver.get("C://Users//lalala//Desktop//表单.html");
		WebElement d= driver.findElement(By.name("yue"));
		Select s=new Select(d);
		s.selectByIndex(3);
	  //s.selectByVisibleText("三月");
		
		
		
	}

}
