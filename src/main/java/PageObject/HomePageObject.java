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

    @Step("Scroll down to footer")
    public void scrollDownToFooter() {
        scrollToBottomPageByJS();
    }

    @Step("verify subscription text in footer")
    public String subscriptionText() {
        waitForElementVisible(HomePageUi.SUBSCRIPTION_TEXT);
        return getTextElement(HomePageUi.SUBSCRIPTION_TEXT);
    }

    @Step("input email to subscription text box with value: {0}")
    public void inputEmailToSubscriptionText(String Email) {
        waitForElementVisible(HomePageUi.SUBSCRIPTION_TEXTBOX);
        sendkeyToElement(HomePageUi.SUBSCRIPTION_TEXTBOX, Email);
    }

    @Step("Click to arrow button")
    public void clickToArrowButton() {
        waitForElementClickable(HomePageUi.SUBSCRIPTION_ARROW_BUTTON);
        clickToElement(HomePageUi.SUBSCRIPTION_ARROW_BUTTON);
    }

    @Step("Scroll down to footer")
    public String subscribedSuccessMessage() {
        waitForElementVisible(HomePageUi.SUBSCRIBE_SUCCESSFULLY_MESSAGE);
        return getTextElement(HomePageUi.SUBSCRIBE_SUCCESSFULLY_MESSAGE);
    }
}
