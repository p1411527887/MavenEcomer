import PageObject.ContactUsPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Ecom_TC07_UploadFileByDynamiclocator extends BaseTest {

    private WebDriver driver;
    private LoginPageObject loginPage;
    private HomePageObject homePage;
    private ContactUsPageObject contactUsPage;


    @Parameters("Browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
    }

    @Test
    public void TC_02_VerifyContactUsPage() {

        loginPage = PageGenerator.openLoginPage(driver);

        loginPage.inputUserNameTextBox(GlobalConstants.USERNAME);

        loginPage.inptuPassWordTextBox(GlobalConstants.PASSWORD);

        homePage = loginPage.clickToLoginButton();

        verifyEquals(homePage.loginSuccessTitle(), "Logged in as phat.truong@mercatus.com");

        homePage.clickToContactUsLink();

        contactUsPage = homePage.clickToContactUsLink();

        contactUsPage.inputNameTextBox(GlobalConstants.NAME);

        contactUsPage.inputEmailTextBox(GlobalConstants.EMAIL);

        contactUsPage.inputSubjectTextBox(GlobalConstants.SUBJECT);

        contactUsPage.inputYourMessageHereTextBox(GlobalConstants.YOUR_MESSAGE_HERE);

        contactUsPage.uploadFile(GlobalConstants.HINH1_PICTURE);
        sleepInSecond(1);

        contactUsPage.clickToSubmitButton();

        contactUsPage.clickOkToAlert();

        verifyEquals(contactUsPage.submitSuccessfullyMessage(), "Success! Your details have been submitted successfully.");

        contactUsPage.clickToBackToHomeButton();



    }


    @AfterClass(alwaysRun = true)
    public void CloseWindow() {
        closeBrowserDriver();
    }
}
