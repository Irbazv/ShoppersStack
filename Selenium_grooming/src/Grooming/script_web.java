package Grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class script_web
{
public static void name(String[]args)
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///F:/Sele%20q/webpage.html");
	WebElement Text1 = driver.findElement(By.name("t1"));
	Text1.sendKeys("abc");
	WebElement text2 = driver.findElement(By.name("t2"));
	text2.sendKeys("xyz");
	WebElement Text3 = driver.findElement(By.id("i3"));
	Text3.clear();
	
	WebElement cb= driver.findElement(By.className("check"));
	cb.click();
	WebElement rb= driver.findElement(By.name("r"));
	rb.click();
	
}
}
