package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__sycurr"                                
               , summary=""
               , page="sycurr"
               , namespacePrefix="rstk"
               , object="rstk__sycurr__c"
               , connection="QARSF_Admin"
     )             
public class rstk__sycurr {

	@ChoiceListType()
	@FindBy(xpath = "//span//div/select")
	public WebElement Currency_Code;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td//input")
	public WebElement description;
	@TextType()
	@FindBy(xpath = "//span/div/div/input")
	public WebElement currentExchangeRate;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//div[1]/table//td[2]/span/input[2]")
	public WebElement delete;
	
}
