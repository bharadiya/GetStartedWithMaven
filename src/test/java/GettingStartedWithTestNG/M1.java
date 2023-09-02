package GettingStartedWithTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class M1 {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

	@Test(priority = 9, groups = { "regression" })
	public static void t2() {
		System.out.println("t2");
	}

	@Test(priority = 8, groups = { "regression" })
	public static void t1() {
		System.out.println("t1");
	}

	@Test(priority = 7, groups = { "regression" })
	public static void t3() {
		System.out.println("t3");
	}

	@Test(priority = 5, groups = { "regression", "sanity" })
	public static void t4() {
		System.out.println("t4");
	}

	@Test(priority = 2)
	public static void t5() {
		System.out.println("t5");
	}

	@Test(priority = -9)
	public static void t6() {
		System.out.println("t6");
	}
}
