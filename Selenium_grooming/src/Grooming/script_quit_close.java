package Grooming;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script_quit_close 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 String key = "webdriver.chrome.driver";
	 String value = "./Software/chromedriver.exe";
	 System.setProperty(key, value);
	 ChromeDriver driver= new ChromeDriver();
	 Thread.sleep(2000);
	 driver.quit();
	 driver.close();
	 
	 
	 String key1 = "webdriver.gecko.driver";
	 String value1 = "./Software/geckodriver.exe";
	 System.setProperty(key1, value1);
	 FirefoxDriver driver1= new FirefoxDriver();
	 Thread.sleep(2000);
	 driver1.quit();
	 driver1.close();
	}
	
}

