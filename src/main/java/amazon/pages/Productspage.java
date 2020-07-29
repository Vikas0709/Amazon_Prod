package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import amazon.common.PrintUtils;
import amazon.common.WebdriverGenerics;

public class Productspage extends WebdriverGenerics {
  
		
		@FindBy(xpath="//div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[1]/div[1]/div[1]/span/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]")
	    WebElement frstitemoptns;
		@FindBy(xpath="//div[@class='sg-row']/div[2]/div/span[3]/div/div/div[1]/span/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/div/div/h2/a")
	    WebElement clckfirstoption;
		@FindBy(xpath="//td[@class='bucket']")
		WebElement prductdetails;
		
	public Productspage(){
		PageFactory.initElements(driver, this);
	}
	public ProductdetailPage productslistdisplay(){
		SoftAssert softassert= new SoftAssert();
		try{
		String options=frstitemoptns.getText();
		for(int i=0;i<=options.length();i++){
			System.out.println(options);
		}
			PrintUtils.logMessage("The Options available for the first item displayed are :: " +options);
			clckfirstoption.click();
			PrintUtils.logMessage("Element Clicked and first option selected");
		
		}
		catch(Exception e){
			PrintUtils.logError("Oops Something went wrong :: " +e);
			softassert.fail();
		}
		softassert.assertAll();
		return new ProductdetailPage();
	}
	}
