
package amazon.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import amazon.Extentreports.ExtentreporterNG;
import amazon.common.WebdriverGenerics;
import amazon.pages.Homepage;
import amazon.pages.ProductdetailPage;
import amazon.pages.Productspage;

public class Amazonsearch_Test extends WebdriverGenerics {
	WebdriverGenerics tb;
	Homepage amzsrch;
	Productspage prdtspg;
	ProductdetailPage prdtlpg;
	
	public  Amazonsearch_Test(){
		super();
		
	}
	@BeforeSuite
	public void StartReport(){
		ExtentreporterNG.startReport();
	}
	
@BeforeMethod
public void intializebrowser(){
	tb= new WebdriverGenerics();
	tb.openbrowser();
	
}
@Test()
public void TC_AmazonSearchBox(){
	ExtentreporterNG.setTestName("TC_AmazonSearchBox", "To test the amazon search bar and get the details for the first option displayed");;
	try{
	amzsrch=new Homepage();
	amzsrch.Amazonsearchbar("science","Books");
	prdtspg= new Productspage();
	prdtspg.productslistdisplay();
	prdtlpg = new ProductdetailPage();
	prdtlpg.productdisplay();
	
	
	
	}catch(Exception e){
		System.out.println("Oops,Something Went wrong"  +e );
		}
	
}
@AfterMethod
public void closebrowser(){
	driver.quit();
}
@AfterSuite
public void endreport(){
	ExtentreporterNG.endReport();
}


}