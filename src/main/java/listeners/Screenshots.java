package listeners;

import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import amazon.common.WebdriverGenerics;

public class Screenshots extends WebdriverGenerics  implements ITestListener {

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		
		
		
		
	}

	public void onTestFailure(ITestResult result) {
		WebdriverGenerics.takesscreenshot(result.getMethod().getMethodName());
		
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

}
