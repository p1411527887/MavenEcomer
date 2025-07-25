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


public class Ecom_TC14_PlaceOrder_RegisterWhileCheckOut extends BaseTest {

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
    public void Step_01_SignUp() {
        homePage = PageGenerator.openHomePage(driver);
        loginPage = homePage.clickToSignUpAndLoginLink();
        loginPage.inputSignUpName(GlobalConstants.SIGN_UP_BY_NAME);
        loginPage.inputSignUpMailAdress(GlobalConstants.SIGN_UP_BY_EMAIL);
        signUpPage = loginPage.clickToSignUpButton();
    }

    @Test
    public void Step_02_FillFullInformation() {
        signUpPage.clickToMrRadioCheckBox();
        verifyEquals(signUpPage.geSignUptName(),"phat@mercatus.com");
        verifyEquals(signUpPage.getSignUpEmail(),"phat@mercatus.com");
        signUpPage.itputToPassword(GlobalConstants.SIGN_UP_BY_PASSWORD);
        signUpPage.selectDay("30");
        signUpPage.selectMonth("July");
        signUpPage.selectYear("1995");
        signUpPage.clickToSignUpForOurNewsletterCheckBox();
        signUpPage.clickToRecevieSpecialOffersFromOurPartners();
        signUpPage.inputToFirstNameTextBox(GlobalConstants.SIGN_UP_BY_FIRST_NAME);
        signUpPage.inputToLastNameTextBox(GlobalConstants.SIGN_UP_BY_LAST_NAME);
        signUpPage.inputToCompanyTextBox(GlobalConstants.SIGN_UP_BY_COMPANY);
        sleepInSecond(1);
        signUpPage.inputToAddressTextBox(GlobalConstants.SIGN_UP_BY_ADRESSS);
        signUpPage.inputToAddress2TextBox(GlobalConstants.SIGN_UP_BY_ADRESSS_2);
        signUpPage.selectCountry("United States");
        signUpPage.inputToStateTextBox(GlobalConstants.SIGN_UP_BY_STAGE);
        signUpPage.inputToCityTextBox(GlobalConstants.SIGN_UP_BY_CITY);
        signUpPage.inputZipCodeTextBox(GlobalConstants.SIGN_UP_BY_ZIPCODE);
        signUpPage.inputPhoneNumberTextBox(GlobalConstants.SIGN_UP_BY_PHONE_NUMBER);
        signUpPage.clickToCreateAccountButton();
        homePage = signUpPage.clickToContinueButton();
        verifyEquals(homePage.loginSuccessTitle(), "Logged in as phat@mercatus.com");
    }

    @Test
    public void Step_03_AddProductToCart() {
        productPage = homePage.clickToProductLink();
        productPage.hoverToBlueTopItem();
        productPage.clickOnBlueTopAddToCartButton();
        productPage.clickOnContinueShopingButton();
        productPage.hoverToSleevelessDressItem();
        productPage.clickOnSleevelessDressAddToCartButton();
        shoppingCartPage = productPage.clickOnViewCartLink();
    }

    @Test
    public void Step_04_VerifyProductAndPriceInShoppingCart() {
        verifyEquals(shoppingCartPage.bluetopItemName(),"Blue Top");
        verifyEquals(shoppingCartPage.sleevelessDressItemName(),"Sleeveless Dress");
        verifyEquals(shoppingCartPage.bluetopItemPrice(),"Rs. 500");
        verifyEquals(shoppingCartPage.sleevelessDressItemPrice(),"Rs. 1000");
        verifyEquals(shoppingCartPage.bluetopItemQuantity(),"1");
        verifyEquals(shoppingCartPage.sleevelessDressQuantity(),"1");
        checkOutPage = shoppingCartPage.clickToProceedToCheckOutButton();

    }

    @Test
    public void Step_05_VerifyProductAndPriceInCheckOutPage() {
        verifyEquals(checkOutPage.deliveryCustomerName(),"Mr. phat truong");
        verifyEquals(checkOutPage.deliveryCompanyName(),"Mercatus");
        verifyEquals(checkOutPage.deliveryAdress(),"90 nguyen trai");
        verifyEquals(checkOutPage.deliveryAdress2(),"Thanh Secret Place");
        verifyEquals(checkOutPage.deliveryCity(),"Ramat Gan NY 100000");
        verifyEquals(checkOutPage.deliveryCountry(),"United States");
        verifyEquals(checkOutPage.deliveryPhoneNumber(),"0943318878");
        paymentPage = checkOutPage.clickToPlaceOrderButton();

    }

    @Test
    public void Step_06_InputInformationPayment() {
        paymentPage.inputNameOnCart(GlobalConstants.NAME_ON_CARD);
        paymentPage.inputCardNumber(GlobalConstants.CARD_NUMBER);
        paymentPage.inputCVCNumber(GlobalConstants.CVC);
        paymentPage.inputExpirationMonthNumber(GlobalConstants.EXPIRATION_MONTH);
        paymentPage.inputExpirationYearNumber(GlobalConstants.EXPIRATION_YEAR);
        paymentPage.clickToPayAndConfirmOrderButton();
        homePage = paymentPage.clickToContinueButton();
        homePage.clickToDeleteAccountLink();

    }



    @AfterClass(alwaysRun = true)
    public void CloseWindow() {
      closeBrowserDriver();
   }
}