package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import amazon.common.PrintUtils;
import amazon.common.WebdriverGenerics;

public class ProductdetailPage extends WebdriverGenerics {
	@FindBy(xpath="//td[@class='bucket']")
	WebElement prductdetails;
public ProductdetailPage(){
	PageFactory.initElements(driver, this);
}
public void productdisplay(){
	SoftAssert softassert= new SoftAssert();
	try{
      String productdetails=prductdetails.getText();
	for(int j=0;j<=productdetails.length();j++){
			System.out.println(productdetails);
	}
	PrintUtils.logMessage("The details for the first selected option for the keyword are :: " +productdetails);
	
	
	
	}
	catch(Exception e){
		PrintUtils.logError("Oops Something went wrong :: " +e);
		softassert.fail();
	}
	softassert.assertAll();
}
}



