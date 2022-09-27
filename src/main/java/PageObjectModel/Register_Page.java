package PageObjectModel;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Register_Page extends abstractClass {
    private WebDriver driver;

    public Register_Page() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement username_TextBox;

    public void typeUserName(String username) {
        sendKeysFunction(username_TextBox, username);
    }

    @FindBy(id = "password")
    private WebElement password_TextBox;

    public void typePassword(String password) {
        sendKeysFunction(password_TextBox, password);
    }

    @FindBy(id = "Pharmacy")
    private WebElement pharmacyButton;

    public void clickPharmacyButton() {

        clickFunction(pharmacyButton);
    }

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    public void clickLoginButton() {

        clickFunction(loginButton);
    }

    @FindBy(xpath = "//body/div[@id='body-wrapper']/div[@id='content']/div[3]/div[1]/a[3]/i[1]")
    private WebElement registerAPatient;

    public void clickRegisterPatientButton() {

        clickFunction(registerAPatient);
    }

    @FindBy(xpath = "/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[1]/input")
    private WebElement given;

    public void typeGiven(String Given) {

        sendKeysFunction(given, Given);
    }

    @FindBy(xpath = "/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[3]/input")
    private WebElement family_TextBox;

    public void typeFamily(String family) {

        sendKeysFunction(family_TextBox, family);
    }

    @FindBy(id = "next-button")
    private WebElement nextButton;

    public void clickNextButton() {
        clickFunction(nextButton);
    }

    @FindBy(id = "gender-field")
    private WebElement gender;

    public void selectGender(String genderType) {
        selectElementFromDropdown(gender, genderType);
    }

    @FindBy(xpath = "/html/body/div/div[3]/form/section[1]/div/fieldset[3]/p[2]/input")
    private WebElement day_TextBox;

    public void typeDay(Integer day) {
        sendKeysFunction(day_TextBox, String.valueOf(day));
    }

    @FindBy(id = "birthdateMonth-field")
    private WebElement Month;

    public void selectMonth(String month) {
        selectElementFromDropdown(Month, month);
    }

    @FindBy(id = "birthdateYear-field")
    private WebElement Year_TextBox;

    public void typeYear(Integer year) {
        sendKeysFunction(Year_TextBox, String.valueOf(year));
    }

    @FindBy(xpath = "/html/body/div/div[3]/form/section[2]/div/fieldset[1]/p[2]/input")
    private WebElement address1_TextBox;

    public void typeAdress(String adress) {
        sendKeysFunction(address1_TextBox, adress);
    }

    @FindBy(xpath = "/html/body/div/div[3]/form/section[2]/div/fieldset[2]/p/input")
    private WebElement phoneNumber_TextBox;

    public void typePhoneNumber(int phoneNumber) {
        sendKeysFunction(phoneNumber_TextBox, String.valueOf(phoneNumber));
    }

    @FindBy(id = "relationship_type")
    private WebElement selectRelationship;

    public void selectRelationship(String relationship) {
        selectElementFromDropdown(selectRelationship, relationship);
    }

    @FindBy(xpath = "//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/section[@id='relationships-info']/div[1]/fieldset[1]/div[1]/div[1]/p[2]/input[1]")
    private WebElement personName_TextBox;

    public void typePerson(String PersonName) {
        sendKeysFunction(personName_TextBox, PersonName);
    }

    @FindBy(id = "submit")
    private WebElement submit;

    public void clickSubmitButton() {
        clickFunction(submit);
    }
    @FindBy(xpath = "/html/body/ul/li[2]/text()")
    private WebElement fullName;


    public void assertMyMessage() {

        Assertion(fullName, fullName.getText());
    }

}
