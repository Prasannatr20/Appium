package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateContact {

	public static void main(String[] args) throws MalformedURLException
	{
		URL url= new URL("http://127.0.0.1:4723/");
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Prasanna");
		options.setPlatformName("Android");
		options.setPlatformVersion("13");
		options.setUdid("NFDATOWWVWAAYHJN");
		options.setAppPackage("com.google.android.dialer");
		options.setAppActivity("com.google.android.dialer.extensions.GoogleDialtactsActivity");
		
		AndroidDriver driver = new AndroidDriver(url, options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("Contact opened successfully");
		WebElement contact = driver.findElement(By.id("com.google.android.dialer:id/tab_contacts"));
		if(contact.isDisplayed())
		{
			contact.click();
			System.out.println("Contact is clicked");
		}
		else
			System.out.println("Unable to contact click");
		
		WebElement createNewContact= driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/contact_name\" and @text=\"Create new contact\"]"));
		if(createNewContact.isDisplayed())
		{
			createNewContact.click();
			System.out.println("New Contact clicked");
		}
		else
			System.out.println("Unable to click new contact");
		WebElement firstName = driver.findElement(By.xpath("//android.widget.EditText[@text=\"First name\"]"));
		if(firstName.isDisplayed())
		{
			firstName.sendKeys("Appium");
			System.out.println("Appium is the first name");
		}
		else
			System.out.println("Unable o enter first name");
		WebElement number =driver.findElement(By.xpath("//android.widget.EditText[@text=\"Phone\"]"));
		if(number.isDisplayed())
		{
			number.sendKeys("1234567890");
			System.out.println("Number entered");
		}
		else
			System.out.println("Unable to enter number");
		WebElement save = driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.google.android.contacts:id/toolbar_button\"]"));
		if(save.isDisplayed())
		{
			save.click();
			System.out.println("Saved");
		}
		else
			System.out.println("Unable to save");
		driver.quit();
	}

}
