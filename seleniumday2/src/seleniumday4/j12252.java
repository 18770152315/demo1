package seleniumday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class j12252 {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public void stat(){                  //�������߿���ϵͳ
		System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8080/Exam_ssh/");
	}
	
	public void login(){                  //��¼��̨
		driver.findElement(By.linkText("�����̨����")).click();
		driver.findElement(By.id("name")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("B1")).click();
	}

	public void add(){                    //���ѧ��           
		driver.findElement(By.id("id")).sendKeys("153231531");
		driver.findElement(By.id("realname")).sendKeys("124");
		driver.findElement(By.id("stuNumber")).sendKeys("124");
		driver.findElement(By.id("className")).sendKeys("153");
		driver.findElement(By.id("address")).sendKeys("1531");
		driver.findElement(By.id("phone")).sendKeys("12425335");
		driver.findElement(By.id("email")).sendKeys("12435265");
		driver.findElement(By.id("humanId")).sendKeys("153235165");
		driver.findElement(By.name("submit")).click();
	}
	
}
