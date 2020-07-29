package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import amazon.common.WebdriverGenerics;

public class RetryAnalyzer extends WebdriverGenerics implements IRetryAnalyzer{
	int retrycount=3;
	int count=0;

	
	public boolean retry(ITestResult result) {
		
		
		if(count<retrycount){
			count++;
			return true;
		}
	
	
		return false;
	}
}