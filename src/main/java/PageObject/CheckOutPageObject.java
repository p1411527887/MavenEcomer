package PageObject;

import PageUI.CheckOutPageUi;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class CheckOutPageObject extends BasePage {
    public CheckOutPageObject(WebDriver driver) {
        super(driver);
    }

    public String deliveryCustomerName() {
        waitForElementVisible(CheckOutPageUi.CUSTOMER_NAME);
        return getTextElement(CheckOutPageUi.CUSTOMER_NAME);
    }

    public String deliveryCompanyName() {
        waitForElementVisible(CheckOutPageUi.COMPANY_NAME);
        return getTextElement(CheckOutPageUi.COMPANY_NAME);
    }

    public String deliveryAdress() {
        waitForElementVisible(CheckOutPageUi.ADRESS);
        return getTextElement(CheckOutPageUi.ADRESS);
    }

    public String deliveryAdress2() {
        waitForElementVisible(CheckOutPageUi.ADRESS_2);
        return getTextElement(CheckOutPageUi.ADRESS_2);
    }

    public String deliveryCity() {
        waitForElementVisible(CheckOutPageUi.CITY);
        return getTextElement(CheckOutPageUi.CITY);
    }

    public String deliveryCountry() {
        waitForElementVisible(CheckOutPageUi.COUNTRY);
        return getTextElement(CheckOutPageUi.COUNTRY);
    }

    public String deliveryPhoneNumber() {
        waitForElementVisible(CheckOutPageUi.PHONE_NUMBER);
        return getTextElement(CheckOutPageUi.PHONE_NUMBER);

    }

    public PaymentPageObject clickToPlaceOrderButton() {
        waitForElementClickable(CheckOutPageUi.PLACE_ORDER_BUTTON);
        clickToElement(CheckOutPageUi.PLACE_ORDER_BUTTON);
        return PageGenerator.openPaymentPage(driver);
    }
}
