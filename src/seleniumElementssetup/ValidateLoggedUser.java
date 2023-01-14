package seleniumElementssetup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ConfigSetup.BaseConfigSetupFile;

public class ValidateLoggedUser {

	public static void validateloginuser() throws IOException
	{
		WebElement getuserdetails= BaseConfigSetupFile.browserdriver.findElement(By.xpath("(//span[@id='nav-link-accountList-nav-line-1'])[1]"));
		String printeduserdetails = getuserdetails.getText();
		System.out.println(printeduserdetails);
	}
}
