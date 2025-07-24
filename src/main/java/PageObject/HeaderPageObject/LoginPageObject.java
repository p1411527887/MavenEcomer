package PageObject.HeaderPageObject;

import PageUI.HeaderPageUI.LoginPageUi;
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
        waitForElementVisible(LoginPageUi.LOGIN_BY_EMAIL_TEXTBOX);
        sendkeyToElement(LoginPageUi.LOGIN_BY_EMAIL_TEXTBOX, UserName);
    }

    @Step("Input Password textbox with value: {0}")
    public void inptuPassWordTextBox(String Password) {
        waitForElementVisible(LoginPageUi.LOGIN_BY_PASSWORD_TEXTBOX);
        sendkeyToElement(LoginPageUi.LOGIN_BY_PASSWORD_TEXTBOX, Password);
    }

    @Step("Open HomePage")
    public HomePageObject clickToLoginButton() {
        waitForElementClickable(LoginPageUi.LOGIN_BUTTON);
        clickToElement(LoginPageUi.LOGIN_BUTTON);
        return PageGenerator.openHomePage(driver);
    }

    public void inputSignUpName(String name) {
        waitForElementClickable(LoginPageUi.SIGN_UP_BY_NAME_TEXTBOX);
        sendkeyToElement(LoginPageUi.SIGN_UP_BY_NAME_TEXTBOX, name);

    }

    public void inputSignUpMailAdress(String email) {
        waitForElementClickable(LoginPageUi.SIGN_UP_BY_EMAIL_TEXTBOX);
        sendkeyToElement(LoginPageUi.SIGN_UP_BY_EMAIL_TEXTBOX, email);
    }

    public SignUpPageObject clickToSignUpButton() {
        waitForElementClickable(LoginPageUi.SIGN_UP_BUTTON);
        clickToElement(LoginPageUi.SIGN_UP_BUTTON);
        return PageGenerator.openSignUpPage(driver);
    }
}
