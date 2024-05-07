package Grooming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
 public static void main(String[]args) 
 {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("tshirt");
	
	WebElement search1 = driver.findElement(By.cssSelector("svg[fill='none']"));
	search1.click();
	
	WebElement shirt = driver.findElement(By.cssSelector("img[class='_2r_T1I']"));
	shirt.click();
	
	/*WebElement M = driver.findElement(By.xpath("//a[@class='_1fGeJ5 PP89tw _2UVyXR _31hAvz']"));
	//M.click();
	
	
	
	WebElement srhbar = driver.findElement(By.xpath("//input[@type='text']"));
	srhbar.click();
	
	
	WebElement put = driver.findElement(By.xpath("//input[@type='text']"));
	put.sendKeys("Biryani");
	
	WebElement put = driver.findElement(By.name("q"));
	put.sendKeys("Biryani");
*/
}
}
