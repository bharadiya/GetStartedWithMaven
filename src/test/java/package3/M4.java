package package3;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class M4 {

	@Test(groups = {"sanity"})
	public static void methodInPackage3() {
		System.out.println("methodInPackage3");
	}
}
