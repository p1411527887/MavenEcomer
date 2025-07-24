package commons;

import PageObject.*;
import PageObject.HeaderPageObject.*;
import PageObject.ProductDeitalPage.BlueTopDetailPO;
import PageObject.ProductDeitalPage.SleevelessDressDetailPO;
import PageObject.SideBarPageOject.*;
import org.openqa.selenium.WebDriver;

public class PageGenerator {
    public static HomePageObject openHomePage(WebDriver driver) {
        return new HomePageObject(driver);
    }

    public static ContactUsPageObject openContactUsPage(WebDriver driver) {
        return new ContactUsPageObject(driver);
    }

    public static LoginPageObject openLoginPage(WebDriver driver) {
        return new LoginPageObject(driver);
    }

    public static ProductPageObject openProductPage(WebDriver driver) {
        return new ProductPageObject(driver);
    }

    public static HAndMBrandPageObject openHAndMBrandPage(WebDriver driver) {
        return new HAndMBrandPageObject(driver);
    }

    public static MadameBrandPageObject openMadameBrandPage(WebDriver driver) {
        return new MadameBrandPageObject(driver);
    }

    public static MastAndHarbourBrandPageObject openMastAndHarbourBrandPage(WebDriver driver) {
        return new MastAndHarbourBrandPageObject(driver);
    }

    public static BabyHugBrandPageObject openBabyHugBrandPage(WebDriver driver) {
        return new BabyHugBrandPageObject(driver);
    }

    public static AllenSollyJuniorBrandPageObject getAllenSollyJuniorBrandPage(WebDriver driver) {
        return new AllenSollyJuniorBrandPageObject(driver);
    }

    public static KookieKidsBrandPageObject getKookieKidsBrandPage(WebDriver driver) {
        return new KookieKidsBrandPageObject(driver);
    }

    public static PoloBrandPageObject getPoloBrandPage(WebDriver driver) {
        return new PoloBrandPageObject(driver);
    }

    public static BibaBrandPageObject getBibaBrandPage(WebDriver driver) {
        return new BibaBrandPageObject(driver);
    }

    public static BrandOfProductPageObject getBrandOfProductPage(WebDriver driver) {
        return new BrandOfProductPageObject(driver);
    }

    public static ShoppingCartPageObject openShoppingCartPage(WebDriver driver) {
        return new ShoppingCartPageObject(driver);
    }

    public static CheckOutPageObject openCheckOutPage(WebDriver driver) {
        return new CheckOutPageObject(driver);
    }

    public static PaymentPageObject openPaymentPage(WebDriver driver) {
        return new PaymentPageObject(driver);
    }

    public static BlueTopDetailPO openBlueTopDetailPage(WebDriver driver) {
        return new BlueTopDetailPO(driver);
    }

    public static SleevelessDressDetailPO openSleevelessDressDetailPage(WebDriver driver) {
        return new SleevelessDressDetailPO(driver);
    }

    public static SignUpPageObject openSignUpPage(WebDriver driver) {
        return new SignUpPageObject(driver);
    }

}
