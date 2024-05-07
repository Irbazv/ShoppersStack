package Grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy 
{
	public static void main(String[]args) throws InterruptedException 
	 {
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		
		WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
		search.click();
		
		WebElement srhbar = driver.findElement(By.xpath("//input[@type='text']"));
		srhbar.click();
		Thread.sleep(3000);
		WebElement put = driver.findElement(By.xpath("//input[@classname='_2FkHZ']"));
		put.sendKeys("Biryani");
		//WebElement put1 = driver.findElement(By.className("_2FkHZ"));
		//put1.sendKeys("Biryani");
		
	 }	
	
}
