package package2;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class M3 {

	@Test
	public static void methodInPackage2() {
		System.out.println("method in package2");
	}

	@AfterMethod
	public static void afterMethod() {
		System.out.println("aftermethod");
	}

	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("beforeMethod");
	}
}
