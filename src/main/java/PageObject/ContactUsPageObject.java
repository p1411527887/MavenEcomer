package PageObject;

import PageUI.ContactUsPageUi;
import commons.BasePage;
import commons.PageGenerator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ContactUsPageObject extends BasePage {
    private String Name = "Phat";
    private String Email = "Phat.truong@mercatus.com";
    private String Subject = "QA automation";
    private String YourMassageHere = " become QA automation as soon as possible";
    private String upLoadFolderPath = System.getProperty("user.dir") + File.separator + "uploadFile" + File.separator;
    private String Hinh1 = "hinh1.jpg";
    private String Hinh1Path = upLoadFolderPath + Hinh1;

    public ContactUsPageObject(WebDriver driver) {
        super(driver);
    }

    @Step("Input Name textbox with value: {0}")
    public void inputNameTextBox() {
        waitForElementVisible(ContactUsPageUi.NAME_TEXTBOX);
        sendkeyToElement(ContactUsPageUi.NAME_TEXTBOX, Name);
    }


    @Step("Input Email textbox with value: {0}")
    public void inputEmailTextBox() {
        waitForElementVisible(ContactUsPageUi.EMAIL_TEXTBOX);
        sendkeyToElement(ContactUsPageUi.EMAIL_TEXTBOX, Email);
    }

    @Step("Input Subject textbox with value: {0}")
    public void inputSubjectTextBox() {
        waitForElementVisible(ContactUsPageUi.SUBJECT_TEXTBOX);
        sendkeyToElement(ContactUsPageUi.SUBJECT_TEXTBOX, Subject);
    }

    @Step("Upload file")
    public void uploadFile() {
        waitForElementVisible(ContactUsPageUi.UPLOAD_FILE_BUTTON);
        sendkeyToElement(ContactUsPageUi.UPLOAD_FILE_BUTTON, Hinh1Path);

    }

    @Step("Click To Submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(ContactUsPageUi.SUBMIT_BUTTON);
        waitForElementClickable(ContactUsPageUi.SUBMIT_BUTTON);
        clickToElement(ContactUsPageUi.SUBMIT_BUTTON);


    }

    @Step("click Ok to alert")
    public void clickOkToAlert() {
        waitAlertPresence();
        acceptToAlert();
    }

    @Step("verify submit successfully message")
    public String submitSuccessfullyMessage() {
        waitForElementVisible(ContactUsPageUi.SUBMIT_SUCCESSFULLY_MESSAGE);
        return getTextElement(ContactUsPageUi.SUBMIT_SUCCESSFULLY_MESSAGE);
    }

    @Step("Open HOme page")
    public HomePageObject clickToBackToHomeButton() {
        waitForElementClickable(ContactUsPageUi.BACK_TO_HOME_BUTTON);
        clickToElement(ContactUsPageUi.BACK_TO_HOME_BUTTON);
        return PageGenerator.getHomePage(driver);
    }

    @Step("Input Your Message Here textbox with value: {0}")
    public void inputYourMessageHereTextBox() {
        waitForElementVisible(ContactUsPageUi.YOUR_MESSAGE_HERE_TEXTBOX);
        sendkeyToElement(ContactUsPageUi.YOUR_MESSAGE_HERE_TEXTBOX, YourMassageHere);
    }
}
