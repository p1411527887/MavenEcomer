import PageObject.*;
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
        loginPage = PageGenerator.openLoginPage(driver);
        loginPage.inputUserNameTextBox(GlobalConstants.USERNAME);
        loginPage.inptuPassWordTextBox(GlobalConstants.USERNAME);
        homePage = loginPage.clickToLoginButton();
        Assert.assertEquals(homePage.loginSuccessTitle(), "Logged in as phat.truong@mercatus.com");
        productPage = homePage.clickToProductLink();
        brandOfProductPage = PageGenerator.getBrandOfProductPage(driver);

        brandOfProductPage.getBrandPageByDynamicLocator("Polo");
        brandOfProductPage = PageGenerator.getPoloBrandPage(driver);

        brandOfProductPage.getBrandPageByDynamicLocator("H&M");
        brandOfProductPage = PageGenerator.openHAndMBrandPage(driver);

        brandOfProductPage.getBrandPageByDynamicLocator("Madame");
        brandOfProductPage = PageGenerator.openMadameBrandPage(driver);

        brandOfProductPage.getBrandPageByDynamicLocator("Mast & Harbour");
        brandOfProductPage = PageGenerator.openMastAndHarbourBrandPage(driver);

        brandOfProductPage.getBrandPageByDynamicLocator("Babyhug");
        brandOfProductPage = PageGenerator.openBabyHugBrandPage(driver);

        brandOfProductPage.getBrandPageByDynamicLocator("Allen Solly Junior");
        brandOfProductPage = PageGenerator.getAllenSollyJuniorBrandPage(driver);

        brandOfProductPage.getBrandPageByDynamicLocator("Kookie Kids");
        brandOfProductPage = PageGenerator.getKookieKidsBrandPage(driver);

    }


    @AfterClass
    public void CloseWindow() {
        closeWindow();

    }
}
