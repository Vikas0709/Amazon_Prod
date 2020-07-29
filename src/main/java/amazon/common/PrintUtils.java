package amazon.common;

import org.testng.Reporter;

import amazon.Extentreports.ExtentreporterNG;

public class PrintUtils extends WebdriverGenerics {
	public static void logMessage(String logMsg) 
	{
		System.out.println(logMsg);
		Reporter.log(logMsg);
		ExtentreporterNG.testStep(logMsg, "Pass");
	}

	public static void logError(String logMsg) 
	{
		System.err.println(logMsg);
		Reporter.log(logMsg);
		ExtentreporterNG.testStep(logMsg, "Fail");
	}


}

