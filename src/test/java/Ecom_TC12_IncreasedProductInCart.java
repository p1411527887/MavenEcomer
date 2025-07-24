import PageObject.*;
import PageObject.HeaderPageObject.ContactUsPageObject;
import PageObject.HeaderPageObject.HomePageObject;
import PageObject.HeaderPageObject.LoginPageObject;
import PageObject.HeaderPageObject.ProductPageObject;
import PageObject.ProductDeitalPage.BlueTopDetailPO;
import PageObject.ProductDeitalPage.SleevelessDressDetailPO;
import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Ecom_TC12_IncreasedProductInCart extends BaseTest {

    private WebDriver driver;
    private LoginPageObject loginPage;
    private HomePageObject homePage;
    private ContactUsPageObject contactUsPage;
    private ProductPageObject productPage;
    private ShoppingCartPageObject shoppingCartPage;
    private CheckOutPageObject checkOutPage;
    private PaymentPageObject paymentPage;
    private BlueTopDetailPO blueTopDetailPage;
    private SleevelessDressDetailPO sleevelessDressDetailPage;



    @Parameters("Browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
    }

    @Test
    public void Step_01_LoginToHomePage() {
        homePage = PageGenerator.openHomePage(driver);
        loginPage = homePage.clickToSignUpAndLoginLink();
        loginPage.inputUserNameTextBox(GlobalConstants.USERNAME);
        loginPage.inptuPassWordTextBox(GlobalConstants.PASSWORD);
        homePage = loginPage.clickToLoginButton();
        verifyEquals(homePage.loginSuccessTitle(), "Logged in as phat.truong@mercatus.com");

    }

    @Test
    public void Step_02_ViewBlueTopProductDetailPage() {
        productPage = homePage.clickToProductLink();
        blueTopDetailPage =  productPage.clickToViewBlueTopProductLink();
        verifyEquals(blueTopDetailPage.getNameOfProduct(),"Blue Top");
        verifyEquals(blueTopDetailPage.getCategoryOfProduct(),"Category: Women > Tops");
        verifyEquals(blueTopDetailPage.getPriceOfProduct(),"Rs. 500");
        verifyEquals(blueTopDetailPage.getAvabilityOfProduct(),"Availability: In Stock");
        verifyEquals(blueTopDetailPage.getConditionOfProduct(),"Condition: New");
        verifyEquals(blueTopDetailPage.getBrandOfProduct(),"Brand: Polo");
    }

    @Test
    public void Step_03_AddAndIncreasedBlueTopProductToCart() {
        blueTopDetailPage.increasedProduct("4");
        blueTopDetailPage.clickToAddToCartButton();
        blueTopDetailPage.clickToContinueShoppingButton();
        productPage = blueTopDetailPage.clickToProductLink();
    }

    @Test
    public void Step_04_ViewSleevelessDressProductDetailPage() {
        sleevelessDressDetailPage = productPage.clickToViewSleevelessDressProductLink();
        verifyEquals(sleevelessDressDetailPage.getNameOfProduct(),"Sleeveless Dress");
        verifyEquals(sleevelessDressDetailPage.getCategoryOfProduct(),"Category: Women > Dress");
        verifyEquals(sleevelessDressDetailPage.getPriceOfProduct(),"Rs. 1000");
        verifyEquals(sleevelessDressDetailPage.getAvabilityOfProduct(),"Availability: In Stock");
        verifyEquals(sleevelessDressDetailPage.getConditionOfProduct(),"Condition: New");
        verifyEquals(sleevelessDressDetailPage.getBrandOfProduct(),"Brand: Madame");


    }

    @Test
    public void Step_05_AddAndIncreasedSleevelessDressProductToCart() {
        sleevelessDressDetailPage.increasedProduct("4");
        sleevelessDressDetailPage.clickToAddToCartButton();
        shoppingCartPage = sleevelessDressDetailPage.clickToViewCartLink();
    }

    @Test
    public void Step_06_VerifyProductAndPriceInShoppingCart() {
        verifyEquals(shoppingCartPage.bluetopItemName(),"Blue Top");
        verifyEquals(shoppingCartPage.sleevelessDressItemName(),"Sleeveless Dress");
        verifyEquals(shoppingCartPage.bluetopItemPrice(),"Rs. 500");
        verifyEquals(shoppingCartPage.sleevelessDressItemPrice(),"Rs. 1000");
        verifyEquals(shoppingCartPage.bluetopItemQuantity(),"4");
        verifyEquals(shoppingCartPage.sleevelessDressQuantity(),"4");
        checkOutPage = shoppingCartPage.clickToProceedToCheckOutButton();
    }
    @Test
    public void Step_07_VerifyProductAndPriceInCheckOutPage() {
        verifyEquals(checkOutPage.deliveryCustomerName(),"Mr. phat truong");
        verifyEquals(checkOutPage.deliveryCompanyName(),"Mercatus");
        verifyEquals(checkOutPage.deliveryAdress(),"a29/37h ấp 1");
        verifyEquals(checkOutPage.deliveryAdress2(),"Thanh Secret Place");
        verifyEquals(checkOutPage.deliveryCity(),"NY Ramat Gan 100000");
        verifyEquals(checkOutPage.deliveryCountry(),"United States");
        verifyEquals(checkOutPage.deliveryPhoneNumber(),"0915866160");
        paymentPage = checkOutPage.clickToPlaceOrderButton();
    }

    @Test
    public void Step_08_InputInformationPayment() {
        paymentPage.inputNameOnCart(GlobalConstants.NAME_ON_CARD);
        paymentPage.inputCardNumber(GlobalConstants.CARD_NUMBER);
        paymentPage.inputCVCNumber(GlobalConstants.CVC);
        paymentPage.inputExpirationMonthNumber(GlobalConstants.EXPIRATION_MONTH);
        paymentPage.inputExpirationYearNumber(GlobalConstants.EXPIRATION_YEAR);
        paymentPage.clickToPayAndConfirmOrderButton();
    }



    @AfterClass(alwaysRun = true)
    public void CloseWindow() {
        closeBrowserDriver();
    }
}