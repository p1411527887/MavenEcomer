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


public class Ecom_TC09_VerifySeachProduct extends BaseTest {

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

        productPage = homePage.clickToProductLink();
        verifyTrue(productPage.allProductsTitleIsDisplayed());
        productPage.inputProductNameToSeachProductField("Men");
        verifyTrue(productPage.menTshirtItemIsDisplayed());
        verifyTrue(productPage.madameTopForWomenIsDisplayed());
        verifyTrue(productPage.laceTopForWomenIsDisPlayed());












    }


    @AfterClass
    public void CloseWindow() {
        driver.quit();

    }
}