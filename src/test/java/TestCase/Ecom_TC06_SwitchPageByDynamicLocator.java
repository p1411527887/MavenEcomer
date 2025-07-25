package TestCase;

import PageObject.HeaderPageObject.HomePageObject;
import PageObject.HeaderPageObject.LoginPageObject;
import PageObject.HeaderPageObject.ProductPageObject;
import PageObject.SideBarPageOject.*;
import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Ecom_TC06_SwitchPageByDynamicLocator extends BaseTest {

    private WebDriver driver;
    private LoginPageObject loginPage;
    private HomePageObject homePage;
    private ProductPageObject productPage;
    private PoloBrandPageObject poloBrandPage;
    private HAndMBrandPageObject hAndMBrandPage;
    private MastAndHarbourBrandPageObject mastAndHarbourBrandPage;
    private BabyHugBrandPageObject babyHugBrandPage;
    private AllenSollyJuniorBrandPageObject allenSollyJuniorBrandPage;
    private KookieKidsBrandPageObject kookieKidsBrandPage;
    private BibaBrandPageObject bibaBrandPage;
    private BrandOfProductPageObject brandOfProductPage;


    @Parameters("Browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
    }

    @Test
    public void TC_TC06_SwitchPageByDynamicLocator() {
        homePage = PageGenerator.openHomePage(driver);
        loginPage = homePage.clickToSignUpAndLoginLink();
        loginPage.inputUserNameTextBox(GlobalConstants.USERNAME);
        loginPage.inptuPassWordTextBox(GlobalConstants.PASSWORD);
        homePage = loginPage.clickToLoginButton();
        Assert.assertEquals(homePage.loginSuccessTitle(), "Logged in as phat.truong@mercatus.com");
        productPage = homePage.clickToProductLink();
        brandOfProductPage = PageGenerator.getBrandOfProductPage(driver);

        brandOfProductPage.openBrandPageByDynamicLocator("Polo");
        brandOfProductPage = PageGenerator.getPoloBrandPage(driver);

        brandOfProductPage.openBrandPageByDynamicLocator("H&M");
        brandOfProductPage = PageGenerator.openHAndMBrandPage(driver);

        brandOfProductPage.openBrandPageByDynamicLocator("Madame");
        brandOfProductPage = PageGenerator.openMadameBrandPage(driver);

        brandOfProductPage.openBrandPageByDynamicLocator("Mast & Harbour");
        brandOfProductPage = PageGenerator.openMastAndHarbourBrandPage(driver);

        brandOfProductPage.openBrandPageByDynamicLocator("Babyhug");
        brandOfProductPage = PageGenerator.openBabyHugBrandPage(driver);

        brandOfProductPage.openBrandPageByDynamicLocator("Allen Solly Junior");
        brandOfProductPage = PageGenerator.getAllenSollyJuniorBrandPage(driver);

        brandOfProductPage.openBrandPageByDynamicLocator("Kookie Kids");
        brandOfProductPage = PageGenerator.getKookieKidsBrandPage(driver);

    }


    @AfterClass(alwaysRun = true)
    public void CloseWindow() {
        closeBrowserDriver();
    }
}
