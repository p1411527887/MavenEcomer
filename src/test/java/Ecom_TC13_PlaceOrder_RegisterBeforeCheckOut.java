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


public class Ecom_TC13_PlaceOrder_RegisterBeforeCheckOut extends BaseTest {

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
    public void Step_01_ViewDetailProduct() {
        homePage = PageGenerator.openHomePage(driver);
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
    public void Step_02_AddproductToCart() {
        blueTopDetailPage.increasedProduct("4");
        blueTopDetailPage.clickToAddToCartButton();
        shoppingCartPage = blueTopDetailPage.clickToViewCartLink();
    }

    @Test
    public void Step_03_VerifyProductAndPriceInShoppingCart() {
        verifyEquals(shoppingCartPage.bluetopItemName(),"Blue Top");
        verifyEquals(shoppingCartPage.bluetopItemPrice(),"Rs. 500");
        verifyEquals(shoppingCartPage.bluetopItemQuantity(),"4");
        shoppingCartPage.clickToProceedToCheckOutButton();
        loginPage = shoppingCartPage.clickToRegisterAndLoginLink();
        loginPage.inputSignUpName(GlobalConstants.SIGN_UP_BY_NAME);
        loginPage.inputSignUpMailAdress(GlobalConstants.SIGN_UP_BY_EMAIL);
        signUpPage = loginPage.clickToSignUpButton();
    }

    @Test
    public void Step_04_SignUp() {
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
        sleepInSecond(5);







    }

    @Test
    public void Step_05_AddAndIncreasedSleevelessDressProductToCart() {

    }

    @Test
    public void Step_06_VerifyProductAndPriceInShoppingCart() {

    }
    @Test
    public void Step_07_VerifyProductAndPriceInCheckOutPage() {

    }

//    @Test
//    public void Step_08_InputInformationPayment() {
//        loginPage.itputNameToSignUpByNameTextBox();
//        loginPage.inputEmailToSignUpByEmailTextBox();
//        signUpPage = loginPage.clickToSignUpButton();
//
//    }



//    @AfterClass(alwaysRun = true)
//    public void CloseWindow() {
//        closeBrowserDriver();
//    }
}