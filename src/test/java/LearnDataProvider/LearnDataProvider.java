package LearnDataProvider;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utility.ExcelReader;

public class LearnDataProvider {
	public static WebDriver driver;

	@BeforeTest
	public static void OpenChrome() {
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public static void openChromeAndHitURL() {
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@AfterMethod
	public static void logOutUser() {
		driver.get("https://www.saucedemo.com/logout");
	}

	@Test(dataProvider = "getLoginData")
	public static void checkLoginScenario(String username, String password) {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open Menu')]")).click();
		boolean logoutOptionIsDisplayed = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).isDisplayed();
		Assert.assertTrue(logoutOptionIsDisplayed);
	}

	@DataProvider(name = "getLoginData")
	public static Object[][] getData() throws IOException {
		// user 1 user 2 user 3
		ExcelReader er = new ExcelReader("./src\\test\\resources\\ExcelFiles\\TestOnSauceDemoUpdated.xlsx", 0);
		return er.getDataFromExcelFile();
	}
}
