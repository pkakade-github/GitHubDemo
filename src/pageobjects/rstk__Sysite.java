package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Sysite"                                
               , summary=""
               , page="Sysite"
               , namespacePrefix="rstk"
               , object="rstk__sysite__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Sysite {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Site Number']/parent::span/parent::th/following-sibling::td//input")
	public WebElement siteNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Description']/parent::span/parent::th/following-sibling::td//input")
	public WebElement description;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Location Number Required Ind']/parent::span/parent::th/following-sibling::td//input")
	public WebElement locationNumberRequiredInd;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='Related Site']/parent::span/parent::th/following-sibling::td//select")
	public WebElement Related_Site;
	@TextType()
	@FindBy(xpath = "//li[@id='li-0']")
	public WebElement Dim;
	@ButtonType()
	@FindBy(xpath = "//td[2]/span/input[1]")
	public WebElement save;
	@ButtonType()
	@FindBy(xpath = "//td[2]/span/input[1]")
	public WebElement Edit;
	@ButtonType()
	@FindBy(xpath = "//td/span/input[2]")
	public WebElement delete;
	@TextType()
	@FindBy(xpath = "//input[@id='sysite_dimval__c_autocomplete']")
	public WebElement Acc_Dim_Value;
	
}
