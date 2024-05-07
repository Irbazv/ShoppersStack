package Grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext 
{
public static void main(String[]args)
{
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///F:/Sele%20q/selenium1.html");
	
	
	WebElement text =driver.findElement(By.partialLinkText("facebook"));
	text.click();
	
}
}
