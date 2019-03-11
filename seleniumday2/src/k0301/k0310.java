package k0301;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class k0310 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/examsys/login.thtml");
		driver.findElement(By.name("username")).sendKeys("hujianmin");
		driver.findElement(By.name("userpass")).sendKeys("hujianming123");
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select/option[3]")).click();;
		 Thread.sleep(10000);
		driver.findElement(By.className("tm_btn")).click();
		   Alert alert =driver.switchTo().alert();
		   if(null==alert){
			   System.out.println("µÇÂ¼³É¹¦");
		   }
		   else{
			   System.out.println("µÇÂ¼Ê§°Ü");
			   alert.accept();
		   }
	}

}
