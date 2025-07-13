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


public class Ecom_TC11_AddProductInCart extends BaseTest {

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
    public void TC_01_LoginToHomePage() {
        loginPage = PageGenerator.openLoginPage(driver);
        loginPage.inputUserNameTextBox(GlobalConstants.USERNAME);
        loginPage.inptuPassWordTextBox(GlobalConstants.PASSWORD);
        homePage = loginPage.clickToLoginButton();
        verifyEquals(homePage.loginSuccessTitle(), "Logged in as phat.truong@mercatus.com");

    }

    @Test
    public void TC_02_AddProductToCart() {
        productPage = homePage.clickToProductLink();
        productPage.hoverToBlueTopItem();
        productPage.clickOnBlueTopAddToCartButton();
        productPage.clickOnContinueShopingButton();
        productPage.hoverToSleevelessDressItem();
        productPage.clickOnSleevelessDressAddToCartButton();
        productPage.clickOnViewCartLink();
        sleepInSecond(3);



    }


    @AfterClass(alwaysRun = true)
    public void CloseWindow() {
        closeBrowserDriver();
    }
}