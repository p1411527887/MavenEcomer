package PageObject;

import PageUI.LoginPageUi;
import commons.BasePage;
import commons.PageGenerator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class LoginPageObject extends BasePage {

    public LoginPageObject(WebDriver driver) {
        super(driver);
    }

    @Step("Input UserName textbox with value: {0}")
    public void inputUserNameTextBox(String UserName) {
        waitForElementVisible(LoginPageUi.USER_NAME_TEXTBOX);
        sendkeyToElement(LoginPageUi.USER_NAME_TEXTBOX, UserName);
    }

    @Step("Input Password textbox with value: {0}")
    public void inptuPassWordTextBox(String Password) {
        waitForElementVisible(LoginPageUi.PASSWORD_TEXTBOX);
        sendkeyToElement(LoginPageUi.PASSWORD_TEXTBOX, Password);
    }

    @Step("Open HomePage")
    public HomePageObject clickToLoginButton() {
        waitForElementClickable(LoginPageUi.LOGIN_BUTTON);
        clickToElement(LoginPageUi.LOGIN_BUTTON);
        return PageGenerator.openHomePage(driver);
    }
}
