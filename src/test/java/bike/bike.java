package bike;

import org.testng.Assert;
import org.testng.annotations.Test;

public class bike {

	@Test(priority = -1)
	public static void startBike() {
		System.out.println("startBike");
	}

	@Test(dependsOnMethods = { "startBike" },priority = 2)
	public static void driveBike() {
		System.out.println("driveBike");
		
	}

	@Test(dependsOnMethods = { "startBike", "driveBike" },priority = 3)
	public static void pressExcilator() {
		System.out.println("pressExcilator");
	}

	@Test(alwaysRun = true)
	public static void parkBike() {
		System.out.println("parkBike");
	}
}
