package PageObject;

import PageObject.HeaderPageObject.LoginPageObject;
import PageUI.BasePageUI;
import PageUI.ShoppingCartPageUi;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPageObject extends BasePage {
    public ShoppingCartPageObject(WebDriver driver) {
        super(driver);
    }


    public String bluetopItemName() {
        waitForElementVisible(ShoppingCartPageUi.BLUETOP_ITEM);
        return getTextElement(ShoppingCartPageUi.BLUETOP_ITEM);
    }

    public String sleevelessDressItemName() {
        waitForElementVisible(ShoppingCartPageUi.SLEEVELESS_DRESS_ITEM);
        return getTextElement(ShoppingCartPageUi.SLEEVELESS_DRESS_ITEM);
    }

    public String bluetopItemPrice() {
        waitForElementVisible(ShoppingCartPageUi.BLUETOP_PRICE);
        return getTextElement(ShoppingCartPageUi.BLUETOP_PRICE);
    }

    public String sleevelessDressItemPrice() {
        waitForElementVisible(ShoppingCartPageUi.SLEEVELESS_DRESS_PRICE);
        return getTextElement(ShoppingCartPageUi.SLEEVELESS_DRESS_PRICE);

    }

    public String bluetopItemQuantity() {
        waitForElementVisible(ShoppingCartPageUi.BLUETOP_QUANTITY);
        return getTextElement(ShoppingCartPageUi.BLUETOP_QUANTITY);
    }

    public String sleevelessDressQuantity() {
        waitForElementVisible(ShoppingCartPageUi.SLEEVELESS_DRESS_QUANTITY);
        return getTextElement(ShoppingCartPageUi.SLEEVELESS_DRESS_QUANTITY);

    }

    public CheckOutPageObject clickToProceedToCheckOutButton() {
        waitForElementClickable(ShoppingCartPageUi.CHECK_OUT_LINK);
        clickToElement(ShoppingCartPageUi.CHECK_OUT_LINK);
        return PageGenerator.openCheckOutPage(driver);
    }

    public LoginPageObject clickToRegisterAndLoginLink() {
        waitForElementClickable(BasePageUI.REGISTER_AND_LOGIN_LINK);
        clickToElement(BasePageUI.REGISTER_AND_LOGIN_LINK);
        return PageGenerator.openLoginPage(driver);
    }
}
