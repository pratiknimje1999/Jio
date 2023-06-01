package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PartialText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jio.com/help/home#/");
		driver.findElement(By.partialLinkText("Mobi")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("True")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("JioFi")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Busi")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sh")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Ap")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("supp")).click();
		
				
		
		

	}

}
