package com.baseclass;

import java.io.File;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void geturl(String name) {
		driver.get(name);
		driver.manage().window().maximize();

	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void navigateTo(String name) {
		driver.navigate().to(name);
	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void navigateforward() {
		driver.navigate().forward();
	}

	public static void Refresh() {
		driver.navigate().refresh();
	}

	public static void sleep(int l) throws InterruptedException {
		Thread.sleep(l);
	}

//	public static void ImplicitlyWait(int j) {
//		driver.manage().timeouts().implicitlyWait(j, TimeUnit.SECONDS);
//	}

	public static void sendkey(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void ScreenShot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sec = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DELL 6430\\Desktop\\screenshot" + name + ".png");
		FileUtils.copyFile(sec, des);
	}

	public static void selection(WebElement element, String name) {
		Select day = new Select(element);
		day.selectByVisibleText(name);
	}

	public static void alret(String alerttype) {
		Alert alert = driver.switchTo().alert();
		if (alerttype.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (alerttype.equalsIgnoreCase("dismis")) {
			alert.dismiss();
		} else if (alerttype.equalsIgnoreCase("gettext")) {
			String text = alert.getText();
			System.out.println(text);
		}
	}

	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}
	}

	public static void action(WebElement element, String type) {
		Actions a = new Actions(driver);
		if (type.equalsIgnoreCase("move")) {
			a.moveToElement(element).build().perform();
		} else if (type.equalsIgnoreCase("click")) {
			a.click().build().perform();

		} else if (type.equalsIgnoreCase("doubble")) {
			a.doubleClick().build().perform();
		}

	}

}
