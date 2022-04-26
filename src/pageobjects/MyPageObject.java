package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="qarsf_admin"
     )             
public class MyPageObject {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Rootstock Site Map']")
	public WebElement rootstockSiteMap;
	@ButtonType()
	@FindBy(xpath = "//input[@name='new']")
	public WebElement New;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='SYDEFAULT']")
	public WebElement Name;

			
}
