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
import org.openqa.selenium.interactions.Actions;

public class day3 {

	private static File screenShotFile;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cnblogs.com/");//登录
        Thread.sleep(5000);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.id("cate_item_2"))).perform();//悬停鼠标在某处
        driver.findElement(By.xpath("//*[@id='cate_content_block_2']/div[2]/ul/li[1]/a")).click();//点击java
        WebElement e= driver.findElement(By.id("zzk_q"));
        e.click();//点击输入框
	    e.sendKeys("java");//在输入框中输入java
	    driver.findElement(By.className("search_btn")).click();//点击找找看  
	    Thread.sleep(8000);//缓存8秒，进行手动验证
	    WebElement a=driver.findElement(By.id("CountOfResults"));
	    String number=a.getText();//定义一个String类型的变量，用于保存获取的数值
	    int now = Integer.parseInt(number);//强转结果
	    if(now==0){
	    	File screenShotFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShotFile, new File("D:/test.png"));
			System.out.println("已截图");
	    }
	    else{
	    	System.out.println("结果条数为："+number); 
	    }
	    driver.navigate().back();//后退一步
	}
}
