package TestCase;

import PageObject.CheckOutPageObject;
import PageObject.HeaderPageObject.*;
import PageObject.PaymentPageObject;
import PageObject.ProductDeitalPage.BlueTopDetailPO;
import PageObject.ProductDeitalPage.SleevelessDressDetailPO;
import PageObject.ShoppingCartPageObject;
import commons.BaseTest;
import commons.GlobalConstants;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Ecom_TC15_PlaceOrder_LoginBeforeCheckOut extends BaseTest {

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
    private SignUpPageObject signUpPage;



    @Parameters("Browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        driver = getBrowserDriver(browserName);
    }

    @Test
    public void Step_01_Login() {
        homePage = PageGenerator.openHomePage(driver);
        homePage = PageGenerator.openHomePage(driver);
        loginPage = homePage.clickToSignUpAndLoginLink();
        loginPage.inputUserNameTextBox(GlobalConstants.USERNAME);
        loginPage.inptuPassWordTextBox(GlobalConstants.PASSWORD);
        homePage = loginPage.clickToLoginButton();
        verifyEquals(homePage.loginSuccessTitle(), "Logged in as phat.truong@mercatus.com");
    }

    @Test
    public void Step_02_AddProductToCart() {
        productPage = homePage.clickToProductLink();
        productPage.hoverToBlueTopItem();
        productPage.clickOnBlueTopAddToCartButton();
        productPage.clickOnContinueShopingButton();
        productPage.hoverToSleevelessDressItem();
        productPage.clickOnSleevelessDressAddToCartButton();
        shoppingCartPage = productPage.clickOnViewCartLink();
    }

    @Test
    public void Step_03_VerifyProductAndPriceInShoppingCart() {
        verifyEquals(shoppingCartPage.bluetopItemName(),"Blue Top");
        verifyEquals(shoppingCartPage.sleevelessDressItemName(),"Sleeveless Dress");
        verifyEquals(shoppingCartPage.bluetopItemPrice(),"Rs. 500");
        verifyEquals(shoppingCartPage.sleevelessDressItemPrice(),"Rs. 1000");
        verifyEquals(shoppingCartPage.bluetopItemQuantity(),"1");
        verifyEquals(shoppingCartPage.sleevelessDressQuantity(),"1");
        checkOutPage = shoppingCartPage.clickToProceedToCheckOutButton();
    }

    @Test
    public void Step_04_VerifyProductAndPriceInCheckOutPage() {
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
    public void Step_05_InputInformationPayment() {
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