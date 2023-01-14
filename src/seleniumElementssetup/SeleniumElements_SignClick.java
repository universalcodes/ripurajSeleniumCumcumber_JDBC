package seleniumElementssetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ConfigSetup.BaseConfigSetupFile;

public class SeleniumElements_SignClick extends BaseConfigSetupFile{
	
	public static void signInClick()
	{
		WebElement signClick= BaseConfigSetupFile.browserdriver.findElement(By.xpath("//*[text()='Hello, sign in']"));
		signClick.click();
	}
	
	public static void enterUsername() throws IOException
	{
		WebElement clickusername= BaseConfigSetupFile.browserdriver.findElement(By.name("email"));
		clickusername.click();
		String username = fileloader.getProperty("username");
		System.out.println(username);
		WebElement enterusername= BaseConfigSetupFile.browserdriver.findElement(By.name("email"));
		enterusername.sendKeys(username);
	}
	
	public static void continueClick() throws IOException
	{
		WebElement continueclk= BaseConfigSetupFile.browserdriver.findElement(By.id("continue"));
		continueclk.click();
}
}