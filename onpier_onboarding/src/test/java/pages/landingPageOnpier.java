package pages;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class landingPageOnpier {

	WebDriver driver;

	public landingPageOnpier(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void sleep (long mili)
	{
		try {
			Thread.sleep(mili);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void selectPramieBeantragenButton () {

		WebElement  buttonFlex  = driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",buttonFlex);
		js.executeScript("arguments[0].click();",buttonFlex);

	}

	public void userUploadFiles () {
		
		
		By locator1 = By.xpath("//input[@name='file-upload'][@id='Fahrzeugschein Vorderseite']");
		WebElement  upload01 =new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(locator1));
		
		By locator2 = By.xpath("//input[@name='file-upload'][@id='Fahrzeugschein Rückseite']");
		WebElement  upload02 =new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(locator2));
		
		upload01.sendKeys("D:\\Test1.JPG");
		upload02.sendKeys("D:\\Test1.JPG");
		
		By nextButtonLocator = By.xpath("//button[.='Weiter ' and not(@disabled)]");
		WebElement  nextButton =new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(nextButtonLocator));
		nextButton.click();

		
	}
	
	public void userVerifyPersonalInfoPageLoad () {
		
		WebElement personalInfoPageHeading = driver.findElement(By.xpath("//h2[.='Persönliche Daten eingeben']"));
    	Assert.assertTrue("Personal Info page is Loaded Sucessfully ",personalInfoPageHeading.isDisplayed());

	}
	
public void selectPrivateRadioButton () {
		
		WebElement radioButtonPrivate = driver.findElement(By.xpath("//input[@type='radio'][@value='PrivatePerson']"));
		radioButtonPrivate.click();
	}

public void verifyCompanynameSalesTaxIdNotDisplayed () {
	List<WebElement> l1 = new ArrayList();
	l1 = driver.findElements(By.xpath("//label[.='Unternehmensname inkl. Unternehmensrechtsform']"));
	Assert.assertEquals("Company name field is not displayed ", 0, l1.size());
	
	List<WebElement> l2 = new ArrayList();
	l2 = driver.findElements(By.xpath("//label[.='Umsatzsteuer-ID (oder Steuernummer)']"));
	Assert.assertEquals("Company name field is not displayed ", 0, l2.size());
	
}

public void enterDataForPrivatePerson(String Anrede, String Vorname,String Nachname, String Email, String Kontoinhaber, String IBAN) {
	
	WebElement dropDownAnrede = driver.findElement(By.xpath("//onpier-input[@label='Anrede']"));
	dropDownAnrede.click();
	List<WebElement> dropDownList = new ArrayList();
	dropDownList = driver.findElements(By.xpath("//mat-option//span"));
	for(WebElement e : dropDownList){
		if (e.getText().equalsIgnoreCase(Anrede)) {
			e.click();
			break;
		}
	}
	
	WebElement vornameField = driver.findElement(By.xpath("//div[label='Vorname']//descendant::input"));
	vornameField.sendKeys(Vorname);
	
	WebElement nachnameField = driver.findElement(By.xpath("//div[label='Nachname']//descendant::input"));
	nachnameField.sendKeys(Nachname);
	
	WebElement emailAddressField = driver.findElement(By.xpath("//div[label='E-Mail-Adresse']//descendant::input"));
	emailAddressField.sendKeys(Email);
	
	WebElement kontoinhaberField = driver.findElement(By.xpath("//div[label='Kontoinhaber']//descendant::input"));
	kontoinhaberField.sendKeys(Kontoinhaber);
	
	WebElement ibanField = driver.findElement(By.xpath("//div[label='IBAN']//descendant::input"));
	ibanField.sendKeys(IBAN);
	
	
}

public void verifyDataCapturedInThirdPage(String Anrede, String Vorname,String Nachname, String Email, String Kontoinhaber, String IBAN){

	List<WebElement> nextButtonList = new ArrayList();
	nextButtonList = driver.findElements(By.xpath("//button[.='Weiter ' and not(@disabled)]"));
	for(WebElement e : nextButtonList){
		if (e.isDisplayed()) {
			e.click();
			break;
		}
	}
		
	By AderedeValueLocator = By.xpath("//table//tr[1]//td[.='Anrede:']/following-sibling::td");
	WebElement  AderedeValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(AderedeValueLocator));
	Assert.assertEquals(Anrede, AderedeValue.getText());
	
	By VornameLocator = By.xpath("//table//tr[2]//td[.='Vorname:']/following-sibling::td");
	WebElement  VornameValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(VornameLocator));
	Assert.assertEquals(Vorname, VornameValue.getText());
	
	By NachnameLocator = By.xpath("//table//tr[3]//td[.='Nachname:']/following-sibling::td");
	WebElement  NachnameValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(NachnameLocator));
	Assert.assertEquals(Nachname, NachnameValue.getText());
	
	By EmailLocator = By.xpath("//table//tr[4]//td[.='E-Mail-Adresse:']/following-sibling::td");
	WebElement  EmailValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(EmailLocator));
	Assert.assertEquals(Email, EmailValue.getText());
	
	By KontoinhaberLocator = By.xpath("//table//tr[5]//td[.='Kontoinhaber:']/following-sibling::td");
	WebElement  KontoinhaberValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(KontoinhaberLocator));
	Assert.assertEquals(Kontoinhaber, KontoinhaberValue.getText());
	
	By IbanLocator = By.xpath("//table//tr[6]//td[.='IBAN:']/following-sibling::td");
	WebElement  IbanValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(IbanLocator));
	Assert.assertEquals(IBAN, IbanValue.getText().replaceAll(" ", ""));

}

public void selectUnternehmenRadioButton () {
	
	WebElement radioButtonUnternehmen = driver.findElement(By.xpath("//input[@type='radio'][@value='Company']"));
	radioButtonUnternehmen.click();
	
}
public void verifyCompanynameSalesTaxIdDisplayed () {
	WebElement companyNameField = driver.findElement(By.xpath("//label[.='Unternehmensname inkl. Unternehmensrechtsform']"));
	Assert.assertTrue("Compnay Name field is Displayed ",companyNameField.isDisplayed());
	
	WebElement salesTaxIdField = driver.findElement(By.xpath("//label[.='Umsatzsteuer-ID (oder Steuernummer)']"));
	Assert.assertTrue("Sales Tax Id field is Displayed ",salesTaxIdField.isDisplayed());	
	
}

public void entersDataInFieldsForCompany (String Company_Name, String Sales_Tax_Id) {
	WebElement companyNameInputField = driver.findElement(By.xpath("//div[label='Unternehmensname inkl. Unternehmensrechtsform']//descendant::input"));
	companyNameInputField.sendKeys(Company_Name);
	
	WebElement SalesTaxIdInputField = driver.findElement(By.xpath("//div[label='Umsatzsteuer-ID (oder Steuernummer)']//descendant::input"));
	SalesTaxIdInputField.sendKeys(Sales_Tax_Id);
	
}

public void verifyCompanyDataCapturedInThirdPage(String Company_Name,String Sales_Tax_Id,String Anrede, String Vorname,String Nachname, String Email, String Kontoinhaber, String IBAN){

	List<WebElement> nextButtonList = new ArrayList();
	nextButtonList = driver.findElements(By.xpath("//button[.='Weiter ' and not(@disabled)]"));
	for(WebElement e : nextButtonList){
		if (e.isDisplayed()) {
			e.click();
			break;
		}
	}
	
	By CompanyNameValueLocator = By.xpath("//table//tr[1]//td[.='Unternehmensname inkl. Unternehmensrechtsform:']/following-sibling::td");
	WebElement  CompanyNameValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(CompanyNameValueLocator));
	Assert.assertEquals(Company_Name, CompanyNameValue.getText());
	
	By SaleTaxIdValueLocator = By.xpath("//table//tr[2]//td[.='Umsatzsteuer-ID (oder Steuernummer): ']/following-sibling::td");
	WebElement  SaleTaxIdValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(SaleTaxIdValueLocator));
	Assert.assertEquals(Sales_Tax_Id, SaleTaxIdValue.getText());
		
	By AderedeValueLocator = By.xpath("//table//tr[3]//td[.='Anrede:']/following-sibling::td");
	WebElement  AderedeValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(AderedeValueLocator));
	Assert.assertEquals(Anrede, AderedeValue.getText());
	
	By VornameLocator = By.xpath("//table//tr[4]//td[.='Vorname:']/following-sibling::td");
	WebElement  VornameValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(VornameLocator));
	Assert.assertEquals(Vorname, VornameValue.getText());
	
	By NachnameLocator = By.xpath("//table//tr[5]//td[.='Nachname:']/following-sibling::td");
	WebElement  NachnameValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(NachnameLocator));
	Assert.assertEquals(Nachname, NachnameValue.getText());
	
	By EmailLocator = By.xpath("//table//tr[6]//td[.='E-Mail-Adresse:']/following-sibling::td");
	WebElement  EmailValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(EmailLocator));
	Assert.assertEquals(Email, EmailValue.getText());
	
	By KontoinhaberLocator = By.xpath("//table//tr[7]//td[.='Kontoinhaber:']/following-sibling::td");
	WebElement  KontoinhaberValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(KontoinhaberLocator));
	Assert.assertEquals(Kontoinhaber, KontoinhaberValue.getText());
	
	By IbanLocator = By.xpath("//table//tr[8]//td[.='IBAN:']/following-sibling::td");
	WebElement  IbanValue =new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(IbanLocator));
	Assert.assertEquals(IBAN, IbanValue.getText().replaceAll(" ", ""));
	
}

}
