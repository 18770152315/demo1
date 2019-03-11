package seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j1225 {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void open(){
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8080/Exam_ssh/");
	}
	public void testlogin(){
		driver.findElement(By.linkText("开始在线考试")).click();
		//driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[1]")).click();
		driver.findElement(By.name("stuNumber")).sendKeys("123");
		driver.findElement(By.name("stuName")).sendKeys("123");
		driver.findElement(By.name("B1")).click();
		
	}

}
