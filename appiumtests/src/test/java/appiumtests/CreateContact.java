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
		driver.findElement(By.xpath("com.google.android.dialer:id/tab_contacts")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/contact_name\" and @text=\"Create new contact\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"First name\"]")).sendKeys("Appium");
		driver.quit();
	}

}
