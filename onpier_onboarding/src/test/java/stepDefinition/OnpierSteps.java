package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.landingPageOnpier;

public class OnpierSteps {
	
	static WebDriver driver = null;
	 
	
	@Before
	public void openBrowser() {

		
		System.out.println("Inside init");
		if (driver == null){
			System.setProperty("webdriver.chrome.driver","C:\\test\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}	
	
	@After("@last")
	public void teardown() {
		System.out.println("exiting");
		driver.close();
		driver.quit();
    }
	
	
	@Given("User navigates to landing page")
	public void verifyLanding() {

		System.out.println("Inside Step - verifyLanding");
		driver.get("https://thg-greenair.dev.wgv.onpier.de/landing");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	  
	}
	
	@When("^User selects Pramie beantragen button")
	public void userSelectsPramieBeantragenButton() {
		landingPageOnpier page = new landingPageOnpier(driver);
		page.selectPramieBeantragenButton();
			
	}
	
	@When("^User Upload Files")
	public void userUploadFiles() {
		landingPageOnpier page = new landingPageOnpier(driver);
		page.userUploadFiles();
	}
	
	@Then("^User verifies that Enter Personal Information page is loaded")
	public void userVerfiesPersonalInformationLoadedSuccessfully() {
		landingPageOnpier page = new landingPageOnpier(driver);
		page.userVerifyPersonalInfoPageLoad();
	}
	
	@When("^User selects Private person radio button")
	public void userSelectPrivateRadioButton(){
		landingPageOnpier page = new landingPageOnpier(driver);
		page.selectPrivateRadioButton();
	}
	
	@When("^User verifies that Company name and Sales tax ID field should not be dispalyed")
	public void userVerifiesCompanynameSalesTaxIdNotDisplayed(){
		landingPageOnpier page = new landingPageOnpier(driver);
		page.verifyCompanynameSalesTaxIdNotDisplayed();
	}
	@When("^User selects Unternehmen radio button")
	public void userSelectUnternehmenRadioButton(){
		landingPageOnpier page = new landingPageOnpier(driver);
		page.selectUnternehmenRadioButton();
	}
	@Then("^User verifies that Company name and Sales tax ID field should be dispalyed")
	public void userVerifiesCompanynameSalesTaxIdDisplayed(){
		landingPageOnpier page = new landingPageOnpier(driver);
		page.verifyCompanynameSalesTaxIdDisplayed();
	}
	@When("^User enters data in fields for Private Person (.*) and (.*) and (.*) and (.*) and (.*) and (.*)")
	public void userEntersDataInFieldsForPivatePerson(String Anrede, String Vorname,String Nachname, String Email, String Kontoinhaber, String IBAN){
		landingPageOnpier page = new landingPageOnpier(driver);
		page.enterDataForPrivatePerson(Anrede,Vorname,Nachname,Email, Kontoinhaber, IBAN);
	}
	
	@Then("^User clicks Next button and verifies Personal details are correctly captured in Third page (.*) and (.*) and (.*) and (.*) and (.*) and (.*)")
	public void userVerifyDataCapturedInThirdPage(String Anrede, String Vorname,String Nachname, String Email, String Kontoinhaber, String IBAN){
		landingPageOnpier page = new landingPageOnpier(driver);
		page.verifyDataCapturedInThirdPage(Anrede,Vorname,Nachname,Email, Kontoinhaber, IBAN);
	}
	
	@And("^User enters data in fields Company name and Sales tax ID (.*) (.*)")
	public void userEntersDataInFieldsForCompany(String Company_Name, String Sales_Tax_Id){
		landingPageOnpier page = new landingPageOnpier(driver);
		page.entersDataInFieldsForCompany(Company_Name,Sales_Tax_Id);
	}
	
	@Then("^User clicks Next button and verifies Personal details of Company are correctly captured in Third page (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*) and (.*)")
	public void userVerifyCompanyDataCapturedInThirdPage(String Company_Name, String Sales_Tax_Id,String Anrede, String Vorname,String Nachname, String Email, String Kontoinhaber, String IBAN){
		landingPageOnpier page = new landingPageOnpier(driver);
		page.verifyCompanyDataCapturedInThirdPage(Company_Name,Sales_Tax_Id,Anrede,Vorname,Nachname,Email, Kontoinhaber, IBAN);
	}

}
