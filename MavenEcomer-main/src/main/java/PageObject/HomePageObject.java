package PageObject;

import PageUI.HomePageUi;
import commons.BasePage;
import commons.PageGenerator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class HomePageObject extends BasePage {
    public HomePageObject(WebDriver driver) {
        super(driver);
    }

    @Step("Verify Success title")
    public String loginSuccessTitle() {
        waitForElementVisible(HomePageUi.LOGIN_SUCCESS_TITLE);
        return getTextElement(HomePageUi.LOGIN_SUCCESS_TITLE);
    }

    @Step("Click to ContactUs Link")
    public ContactUsPageObject clickToContactUsLink() {
        waitForElementClickable(HomePageUi.CONTACT_US_LINK);
        clickToElement(HomePageUi.CONTACT_US_LINK);
        return PageGenerator.contactUsPage(driver);
    }

    @Step("Click to Product Link")
    public ProductPageObject clickToProductLink() {
        waitForElementClickable(HomePageUi.PRODUCT_LINK);
        clickToElement(HomePageUi.PRODUCT_LINK);
        return PageGenerator.getProductPage(driver);
    }
}
