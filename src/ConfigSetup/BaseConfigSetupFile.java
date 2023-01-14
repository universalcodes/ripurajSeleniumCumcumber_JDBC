package ConfigSetup;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseConfigSetupFile
{
	
	public static WebDriver browserdriver;
	
	public static String propfilepath = "D:\\Testing Ducat\\Automation Projects\\RipurajMavenCucumber\\SeleniumAutomation\\src\\config\\EnvSetup.properties";
	
	public 	static Properties fileloader = new Properties();
	
	
	public static void browsetup() throws IOException {
	FileInputStream filepath = new FileInputStream(propfilepath);
	fileloader.load(filepath);	
	
	System.out.println(filepath.toString());
	
	String browsername = fileloader.getProperty("Browser");
	System.out.println(browsername);
	
	String url = fileloader.getProperty("Url");
	System.out.println(url);
			
	
	if(browsername.contains("Google Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		browserdriver = new ChromeDriver();
		if (url.contains("https://www.amazon.in/"))
		{
			browserdriver.get(url);
		}
		else {
			System.out.println("No Address Found");

			
		}
		
	}	
		
	else if (browsername.contains("Edge")) 
		{
		WebDriverManager.edgedriver().setup();
		browserdriver = new EdgeDriver();
		
		if (url.contains("https://www.amazon.in/"))
		{
			browserdriver.get(url);
		}
		else {
			System.out.println("No Address Found");

			
		}
		
		}
	
	else if (browsername.contains("Firefox Mozilla")) 
	{
	WebDriverManager.firefoxdriver().setup();
	browserdriver = new FirefoxDriver();
	if (url.contains("https://www.amazon.in/"))
	{
		browserdriver.get(url);
	}
	else {
		System.out.println("No Address Found");

		
	}
	
	}
	
	else {
		
		System.out.println("No Driver Found");
	}
	}
	
	
	public static void main(String[] args) throws IOException {
		browsetup();
	}
}
