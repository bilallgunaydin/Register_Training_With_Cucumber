package stepDefinition;

import PageObjectModel.Register_Page;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Register_Step {
    Register_Page register_page = new Register_Page();
    private WebDriver driver;

    @Given("Navigate to Website")
    public void navigateToWebsite() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("type username {string}")
    public void typeUsername(String username) {
        register_page.typeUserName(username);
    }

    @And("type password {string}")
    public void typePassword(String password) {
        register_page.typePassword(password);
    }

    @And("click on Pharmacy Button")
    public void clickOnPharmacyButton() {
        register_page.clickPharmacyButton();
    }

    @And("click on Log In Button")
    public void clickOnLogInButton() {
        register_page.clickLoginButton();
    }

    @And("click on Register a patient Button")
    public void clickOnRegisterAPatientButton() {
        register_page.clickRegisterPatientButton();
    }

    @And("type Given {string}")
    public void typeGiven(String Given) {
        register_page.typeGiven(Given);

    }

    @And("type Family Name {string}")
    public void typeFamilyName(String familyName) {
        register_page.typeFamily(familyName);
    }

    @And("click next button")
    public void clickNextButton() {
        register_page.clickNextButton();
    }

    @And("select gender {string}")
    public void selectGender(String gender) {
        register_page.selectGender(gender);
    }

    @And("type Day {int}")
    public void typeDay(int Day) {
        register_page.typeDay(Day);
    }

    @And("select Month {string}")
    public void selectMonth(String Month) {
        register_page.selectMonth(Month);
    }

    @And("type Year {int}")
    public void typeYearYear(int Year) {
        register_page.typeYear(Year);
    }

    @And("type address {string}")
    public void typeAddress(String address1) {
        register_page.typeAdress(address1);
    }

    @And("type phone number {int}")
    public void typePhoneNumberPhoneNumber(int phoneNumber) {
        register_page.typePhoneNumber(phoneNumber);
    }

    @And("selected relationship {string}")
    public void selectedRelationship(String relationship) {
        register_page.selectRelationship(relationship);
    }

    @And("type personName {string}")
    public void typePersonName(String personName) {
        register_page.typePerson(personName);
    }

    @When("click Confirm button")
    public void clickConfirmButton() {
        register_page.clickSubmitButton();
    }

    @Then("verify success name")
    public void verify_success_name() throws InterruptedException {
        Thread.sleep(3000);
        register_page.assertMyMessage();
    }

    @After
    public void Quit() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();
    }


}
