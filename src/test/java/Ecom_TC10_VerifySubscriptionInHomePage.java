import PageObject.ContactUsPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import PageObject.ProductPageObject;
import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Ecom_TC10_VerifySubscriptionInHomePage extends BaseTest {

    private WebDriver driver;
    private LoginPageObject loginPage;
    private HomePageObject homePage;
    private ContactUsPageObject contactUsPage;
    private ProductPageObject productPage;


    @Parameters("Browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
    }

    @Test
    public void TC_01_VerifySeachProduct() {
        loginPage = PageGenerator.openLoginPage(driver);
        loginPage.inputUserNameTextBox(GlobalConstants.USERNAME);
        loginPage.inptuPassWordTextBox(GlobalConstants.PASSWORD);
        homePage = loginPage.clickToLoginButton();
        verifyEquals(homePage.loginSuccessTitle(), "Logged in as phat.truong@mercatus.com");

        homePage.scrollDownToFooter();
        verifyEquals(homePage.subscriptionText(),"SUBSCRIPTION"); // verrify text
        homePage.inputEmailToSubscriptionText(GlobalConstants.EMAIL);
        homePage.clickToArrowButton();
        verifyEquals(homePage.subscribedSuccessMessage(),"You have been successfully subscribed!");



    }


    @AfterClass(alwaysRun = true)
    public void CloseWindow() {
        closeBrowserDriver();
    }
}