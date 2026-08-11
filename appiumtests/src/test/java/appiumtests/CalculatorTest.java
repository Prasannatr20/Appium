package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CalculatorTest {

    public static void main(String[] args) throws MalformedURLException
    {
        URL url = new URL("http://127.0.0.1:4723/");

        UiAutomator2Options options = new UiAutomator2Options();

        options.setDeviceName("Prasanna");
        options.setPlatformName("Android");
        options.setPlatformVersion("13");
        options.setUdid("NFDATOWWVWAAYHJN");

        options.setAppPackage("com.coloros.calculator");
        options.setAppActivity("com.android.calculator2.Calculator");

        AndroidDriver driver = new AndroidDriver(url, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        System.out.println("Calculator launched successfully!");
        
        
        
        driver.findElement(By.id("com.coloros.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.coloros.calculator:id/digit_5")).click();
        driver.findElement(By.id("com.coloros.calculator:id/op_add")).click();
        driver.findElement(By.id("com.coloros.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.coloros.calculator:id/eq")).click();

        driver.quit();
    }
}