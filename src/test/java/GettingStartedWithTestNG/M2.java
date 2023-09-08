package GettingStartedWithTestNG;

import org.testng.annotations.Test;

public class M2 {
	@Test(groups = {"sanity"})
	public static void t7() {
		System.out.println("t7");
	}

	@Test(enabled = false)
	public static void t8() {
		System.out.println("t8");
	}

	@Test(enabled = false)

	public static void t9() {
		System.out.println("t9");
	}

	@Test(enabled = false)

	public static void t10() {
		System.out.println("t10");
	}

	@Test(enabled = false)

	public static void t11() {
		System.out.println("t11");
	}

	@Test

	public static void t12() {
		System.out.println("t12");
	}
}
