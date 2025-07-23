package PageObject;

import PageUI.PaymentPageUi;
import PageUI.ShoppingCartPageUi;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class PaymentPageObject extends BasePage {
    public PaymentPageObject(WebDriver driver) {
        super(driver);
    }


    public void inputNameOnCart(String cardName) {
        waitForElementVisible(PaymentPageUi.NAME_ON_CARD_TEXTBOX);
        sendkeyToElement(PaymentPageUi.NAME_ON_CARD_TEXTBOX, cardName);
    }

    public void inputCardNumber(String cardNumber) {
        waitForElementVisible(PaymentPageUi.CARD_NUMBER_TEXTBOX);
        sendkeyToElement(PaymentPageUi.CARD_NUMBER_TEXTBOX, cardNumber);
    }

    public void inputCVCNumber(String cvcNumber) {
        waitForElementVisible(PaymentPageUi.CVC_NUMBER_TEXTBOX);
        sendkeyToElement(PaymentPageUi.CVC_NUMBER_TEXTBOX, cvcNumber);
    }

    public void inputExpirationMonthNumber(String month) {
        waitForElementVisible(PaymentPageUi.EXPIRASTION_MONTH_TEXTBOX);
        sendkeyToElement(PaymentPageUi.EXPIRASTION_MONTH_TEXTBOX, month);
    }

    public void inputExpirationYearNumber(String year) {
        waitForElementVisible(PaymentPageUi.EXPIRASTION_YEAR_TEXTBOX);
        sendkeyToElement(PaymentPageUi.EXPIRASTION_YEAR_TEXTBOX, year);
    }

    public void clickToPayAndConfirmOrderButton() {
        waitForElementClickable(PaymentPageUi.CONFIRM_ORDER_BUTTON);
        clickToElement(PaymentPageUi.CONFIRM_ORDER_BUTTON);
    }
}
