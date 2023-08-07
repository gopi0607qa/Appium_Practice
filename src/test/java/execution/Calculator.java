package execution;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("platformVersion", "11.0");

		capabilities.setCapability("udid", "emulator-5554");

		capabilities.setCapability("deviceName", "Android SDK built for x86");

		capabilities.setCapability("appPackage", "com.google.android.calculator");

		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver(url, capabilities);

		System.out.println("Started");

		WebElement one_button = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));

		WebElement two_button = driver.findElement(By.id("com.google.android.calculator:id/digit_2"));

		WebElement three_button = driver.findElement(By.id("com.google.android.calculator:id/digit_3"));

		WebElement four_button = driver.findElement(By.id("com.google.android.calculator:id/digit_4"));

		WebElement five_button = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));

		WebElement six_button = driver.findElement(By.id("com.google.android.calculator:id/digit_6"));

		WebElement seven_button = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));

		WebElement eight_button = driver.findElement(By.id("com.google.android.calculator:id/digit_8"));

		WebElement nine_button = driver.findElement(By.id("com.google.android.calculator:id/digit_9"));

		WebElement zero_button = driver.findElement(By.id("com.google.android.calculator:id/digit_0"));

		WebElement multiply_button = driver.findElement(By.id("com.google.android.calculator:id/op_mul"));

		WebElement add_button = driver.findElement(By.id("com.google.android.calculator:id/op_add"));

		WebElement sub_button = driver.findElement(By.id("com.google.android.calculator:id/op_sub"));

		WebElement divide_button = driver.findElement(By.id("com.google.android.calculator:id/op_div"));

		WebElement equal_button = driver.findElement(By.id("com.google.android.calculator:id/eq"));

		WebElement clear = driver.findElement(By.id("com.google.android.calculator:id/clr"));

		// multiply
		two_button.click();
		four_button.click();
		multiply_button.click();
		two_button.click();
		four_button.click();
		equal_button.click();
		clear.click();

		// Addition
		one_button.click();
		three_button.click();
		add_button.click();
		five_button.click();
		six_button.click();
		equal_button.click();
		clear.click();

		// subtract
		two_button.click();
		four_button.click();
		sub_button.click();
		two_button.click();
		four_button.click();
		equal_button.click();
		clear.click();

		// divide
		nine_button.click();
		zero_button.click();
		divide_button.click();
		eight_button.click();
		seven_button.click();
		equal_button.click();
		clear.click();

		System.out.println("OPeration performed");
		driver.quit();

	}

}
