package Listeneres;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import ru.yandex.qatools.ashot.AShot;

public class Listeners extends TestListenerAdapter {
	@Override
	public void onTestSkipped(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSkipped(tr);
		System.err.print("Test case is skipped");
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.print("Test started");
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		System.err.print("test case is failed");
	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		System.err.print("Yeh the test case is passed");
	}
}
