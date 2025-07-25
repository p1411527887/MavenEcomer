package PageObject.HeaderPageObject;

import PageUI.HeaderPageUI.SignUpPageUi;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;


public class SignUpPageObject extends BasePage {

    public SignUpPageObject(WebDriver driver) {
        super(driver);
    }


    public void clickToMrRadioCheckBox() {
        waitForElementClickable(SignUpPageUi.MR_RADIO_CHECK_BOX);
        clickToElement(SignUpPageUi.MR_RADIO_CHECK_BOX);

    }

    public String geSignUptName() {
        waitForElementVisible(SignUpPageUi.NAME_TEXT_BOX);
        return getAttributeValue(SignUpPageUi.NAME_TEXT_BOX,"defaultValue");
    }

    public String getSignUpEmail() {
        waitForElementVisible(SignUpPageUi.EMAIL_TEXT_BOX);
        return getAttributeValue(SignUpPageUi.EMAIL_TEXT_BOX,"defaultValue");
    }

    public void itputToPassword(String password) {
        waitForElementClickable(SignUpPageUi.PASS_WORD_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.PASS_WORD_TEXT_BOX,password);
    }

    public void selectDay(String day) {
        waitForElementClickable(SignUpPageUi.DAY_OF_BIRTH_DROPDOWN);
        selectItemInDefaultDropDown(SignUpPageUi.DAY_OF_BIRTH_DROPDOWN, day);
    }

    public void selectMonth(String month) {
        waitForElementClickable(SignUpPageUi.MONTH_OF_BIRTH_DROPDOWN);
        selectItemInDefaultDropDown(SignUpPageUi.MONTH_OF_BIRTH_DROPDOWN, month);
    }

    public void selectYear(String year) {
        waitForElementClickable(SignUpPageUi.YEAR_OF_BIRTH_DROPDOWN);
        selectItemInDefaultDropDown(SignUpPageUi.YEAR_OF_BIRTH_DROPDOWN, year);
    }

    public void clickToSignUpForOurNewsletterCheckBox() {
        waitForElementClickable(SignUpPageUi.NEWSLETTER_CHECKBOX);
        clickToElement(SignUpPageUi.NEWSLETTER_CHECKBOX);
    }

    public void clickToRecevieSpecialOffersFromOurPartners() {
        waitForElementClickable(SignUpPageUi.RECIVE_SPECIAL_CHECKBOX);
        clickToElement(SignUpPageUi.RECIVE_SPECIAL_CHECKBOX);
    }

    public void inputToFirstNameTextBox(String firstName) {
        waitForElementClickable(SignUpPageUi.FIRST_NAME_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.FIRST_NAME_TEXT_BOX,firstName);
    }

    public void inputToLastNameTextBox(String lastName) {
        waitForElementClickable(SignUpPageUi.LAST_NAME_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.LAST_NAME_TEXT_BOX,lastName);
    }

    public void inputToAddressTextBox(String address) {
        waitForElementClickable(SignUpPageUi.ADDRESS_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.ADDRESS_TEXT_BOX,address);
    }

    public void inputToAddress2TextBox(String address_2) {
        waitForElementClickable(SignUpPageUi.ADDRESS_TEXT_BOX_2);
        sendkeyToElement(SignUpPageUi.ADDRESS_TEXT_BOX_2,address_2);
    }

    public void selectCountry(String country) {
        waitForElementClickable(SignUpPageUi.COUNTRY_DROPDOWN);
        selectItemInDefaultDropDown(SignUpPageUi.COUNTRY_DROPDOWN,"United States");
    }

    public void inputToStateTextBox(String stage) {
        waitForElementClickable(SignUpPageUi.STAGE_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.STAGE_TEXT_BOX, stage);
    }

    public void inputZipCodeTextBox(String zipcode) {
        waitForElementClickable(SignUpPageUi.ZIPCODE_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.ZIPCODE_TEXT_BOX, zipcode);
    }

    public void inputPhoneNumberTextBox(String phoneNumber) {
        waitForElementClickable(SignUpPageUi.PHONE_NUMBER_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.PHONE_NUMBER_TEXT_BOX, phoneNumber);
    }

    public void clickToCreateAccountButton() {
        waitForElementClickable(SignUpPageUi.CREATE_ACCOUNT_BUTTON);
        clickToElement(SignUpPageUi.CREATE_ACCOUNT_BUTTON);

    }

    public void inputToCompanyTextBox(String companyName) {
        waitForElementClickable(SignUpPageUi.COMPANY_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.COMPANY_TEXT_BOX, companyName);
    }

    public void inputToCityTextBox(String city) {
        waitForElementClickable(SignUpPageUi.CITY_TEXT_BOX);
        sendkeyToElement(SignUpPageUi.CITY_TEXT_BOX, city);
    }

    public String createAccountSuccessfullyMessage() {
        waitForElementInvisible(SignUpPageUi.SUCCESSFULL_TEXT);
        return getTextElement(SignUpPageUi.SUCCESSFULL_TEXT);
    }

    public HomePageObject clickToContinueButton() {
        waitForElementClickable(SignUpPageUi.CONTINUE_BUTTON);
        clickToElement(SignUpPageUi.CONTINUE_BUTTON);
        return PageGenerator.openHomePage(driver);
    }
}
