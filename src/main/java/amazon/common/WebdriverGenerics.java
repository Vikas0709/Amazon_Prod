package amazon.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebdriverGenerics extends PropertyfileReader {
	public static WebDriver driver;
	PropertyfileReader prop;
	

	public void openbrowser(){
		
	prop=new PropertyfileReader();
	String browser= prop.getprop("Browser");
	if(browser.equalsIgnoreCase("chrome"));{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vikas Sreeram\\Desktop\\chromedriver1.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to(prop.getprop("URL"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	}

	public static void takesscreenshot(String methodname){
		File srcfile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("/Users/Vikas/Documents/workspace/VIKAS/Amazon_Prod/screenshots/"+methodname+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Oops Something went wrong while taking screenshot " +e);
		}
	}
	
}
