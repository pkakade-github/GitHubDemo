package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Rstk__ Manufacturing"                                
               , page="Manufacturing"
               , namespacePrefix="rstk"
               , object="rstk__menu__c"
               , connection="QARSF_Admin"
     )             
public class rstk__Manufacturing {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Company Master']")
	public WebElement companyMaster;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Rootstock Site Map']")
	public WebElement rootstockSiteMap;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Division Master']")
	public WebElement divisionMaster;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Site Master']")
	public WebElement siteMaster;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Authorizers']")
	public WebElement authorizers;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Organizational Departments']")
	public WebElement organizationalDepartments;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='UOM Conversion Factors']")
	public WebElement UOMConversionFactors;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Unit of Measure Master']")
	public WebElement UnitOfMeasureMaster;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location Numbers']")
	public WebElement inventoryLocationNumbers;
	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[5]/div[1]/div/div[2]/div/li[19]//a[1]")
	public WebElement currencyMaster;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Order Number Assign']")
	public WebElement OrderNumberAssign;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Inventory Location IDs']")
	public WebElement InventoryLocationIDs;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Division Address']")
	public WebElement divisionAddress;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Scrap Reason Codes']")
	public WebElement scrapReasonCodes;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Terms Code']")
	public WebElement termsCode;
	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[5]/div[1]/div/div[2]/div/li[15]//a[1]")
	public WebElement inventoryCommodityCode;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='VAT Class']")
	public WebElement VATClass;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Feature Category']")
	public WebElement featureCategory;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='State/ Province Code']")
	public WebElement stateProvinceCode;
	@LinkType()
	@VisualforceBy(componentXPath = "apex:outputPanel[not(@id)][2]//tr/td[5]/div[1]/div/div[2]/div/li[24]//a[1]")
	public WebElement systemDefaults;
	
	
}
