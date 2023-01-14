package seleniumElementssetup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ConfigSetup.BaseConfigSetupFile;

public class PasswordElements  extends BaseConfigSetupFile{

	public static void enterPassword() throws IOException, InterruptedException
	{
		WebElement clickusername= BaseConfigSetupFile.browserdriver.findElement(By.name("password"));
		clickusername.click();
		String password = fileloader.getProperty("password");
		System.out.println( password);
		clickusername.sendKeys( password);
		Thread.sleep(5000);
	}
	
	public static void signin_main_Click() throws IOException, InterruptedException
	{
		WebElement signclk= BaseConfigSetupFile.browserdriver.findElement(By.id("signInSubmit"));
		signclk.click();
		Thread.sleep(10000);

		
	}
	
}
