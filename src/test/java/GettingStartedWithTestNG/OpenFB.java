package GettingStartedWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenFB {
	@Test
	public static void OpenFB() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
	}
}
