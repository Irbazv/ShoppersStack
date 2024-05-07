package Grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_7 {
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get(file:///F:/Sele%20q/sample2.html);
	WebElement ele= driver.findElement(By.tagName("a"));
	ele.click();
	}
}
