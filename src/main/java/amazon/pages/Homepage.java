package amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import amazon.common.PrintUtils;
import amazon.common.WebdriverGenerics;


public class Homepage extends WebdriverGenerics {
	@FindBy(id="searchDropdownBox")
	WebElement name;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbar;
	@FindBy(xpath="//div[@id='nav-search']/form/div[2]/div[1]")
	WebElement searchbtn;
	@FindBy(xpath="//div[@class='a-section glow-toaster glow-toaster-theme-default glow-toaster-slot-default nav-coreFlyout nav-flyout']")
	WebElement cntrypopup;
	@FindBy(xpath="//div[@class='glow-toaster-content']/div[3]/span[1]")
	WebElement cntrypopupbtn;
	
public Homepage(){
	PageFactory.initElements(driver, this);
}
public Productspage Amazonsearchbar(String searchitem,String drpdownoptn){
	SoftAssert softassert= new SoftAssert();
	try{
	
	WebElement cntrypop=cntrypopup;
	if(cntrypop.isDisplayed()){
		cntrypopupbtn.click();
		PrintUtils.logMessage("Country selection Option popup clicked");
	}
	Select sel=new Select(name);
	sel.selectByVisibleText(drpdownoptn);
	PrintUtils.logMessage("Option selected is  :: " +drpdownoptn);
	searchbar.sendKeys(searchitem);
	PrintUtils.logMessage("The word printed in search bar is :: " +searchitem);
	searchbtn.click();
	PrintUtils.logMessage("Search button clicked");
	}
	catch(Exception e){
		PrintUtils.logError("Oops Something went wrong :: " +e);
		softassert.fail();
	}
	softassert.assertAll();
	return new Productspage();





}
}
