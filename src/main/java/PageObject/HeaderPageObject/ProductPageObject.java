package PageObject.HeaderPageObject;

import PageObject.ProductDeitalPage.BlueTopDetailPO;
import PageObject.ProductDeitalPage.SleevelessDressDetailPO;
import PageObject.ShoppingCartPageObject;
import PageUI.BasePageUI;
import PageUI.HeaderPageUI.ProductPageUi;
import commons.BasePage;
import commons.PageGenerator;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ProductPageObject extends BasePage {

    public ProductPageObject(WebDriver driver) {
        super(driver);
    }

    @Step("Verify Polo brand page title ")
    public String getTextPoloBrands() {
        waitForElementVisible(ProductPageUi.BRANDS_POLO_LINK);
        return getTextElement(ProductPageUi.BRANDS_POLO_LINK).replaceAll("\\(\\d+\\)\\s*", "").trim();
    }

    @Step("Verify H and M brand page title ")
    public String getTextHAndMBrands() {
        waitForElementVisible(ProductPageUi.BRANDS_H_AND_M_LINK);
        return getTextElement(ProductPageUi.BRANDS_H_AND_M_LINK).replaceAll("\\(\\d+\\)\\s*", "").trim();
    }

    @Step("Verify Madame brand page title ")
    public String getTextMadameBrands() {
        waitForElementVisible(ProductPageUi.BRANDS_MADAME_LINK);
        return getTextElement(ProductPageUi.BRANDS_MADAME_LINK).replaceAll("\\(\\d+\\)\\s*", "").trim();
    }

    @Step("Verify Mast and Habour brand page title ")
    public String getTextMastAndHabourBrands() {
        waitForElementVisible(ProductPageUi.BRANDS_MAST_AND_HARBOUR_LINK);
        return getTextElement(ProductPageUi.BRANDS_MAST_AND_HARBOUR_LINK).replaceAll("\\(\\d+\\)\\s*", "").trim();
    }

    @Step("Verify BabyHub brand page title ")
    public String getTextBabyHubBrands() {
        waitForElementVisible(ProductPageUi.BRANDS_BABY_HUG_LINK);
        return getTextElement(ProductPageUi.BRANDS_BABY_HUG_LINK).replaceAll("\\(\\d+\\)\\s*", "").trim();
    }

    @Step("Verify Allen Solly Junior brand page title ")
    public String getTextAllenSollyJuniorBrands() {
        waitForElementVisible(ProductPageUi.BRANDS_ALLEN_SOLLY_JUNIOR_LINK);
        return getTextElement(ProductPageUi.BRANDS_ALLEN_SOLLY_JUNIOR_LINK).replaceAll("\\(\\d+\\)\\s*", "").trim();
    }

    @Step("Verify KooKie brand page title ")
    public String getTextKooKieBrands() {
        waitForElementVisible(ProductPageUi.BRANDS_KOOKIE_KID_LINK);
        return getTextElement(ProductPageUi.BRANDS_KOOKIE_KID_LINK).replaceAll("\\(\\d+\\)\\s*", "").trim();
    }

    @Step("Verify Biba brand page title ")
    public String getTextBiBaBrands() {
        waitForElementVisible(ProductPageUi.BRANDS_BIBA_LINK);
        return getTextElement(ProductPageUi.BRANDS_BIBA_LINK).replaceAll("\\(\\d+\\)\\s*", "").trim();
    }
    @Step("Scroll down to Mast and Harbour brand")
    public void scrollDownToBrand() {
        waitForElementVisible(ProductPageUi.BRANDS_MAST_AND_HARBOUR_LINK);
        scrollToElementOnDownByJS(ProductPageUi.BRANDS_MAST_AND_HARBOUR_LINK);
    }

    @Step("view product of blue top item")
    public void clickOnViewProductOfBlueTopItem() {
        waitForElementClickable(ProductPageUi.VIEW_PRODUCT_BLUE_TOP_LINK);
        clickToElementByJS(ProductPageUi.VIEW_PRODUCT_BLUE_TOP_LINK);
    }

    @Step("input product name to seach product field with value: {0}")
    public void inputProductNameToSeachProductField(String producName) {
        waitForElementVisible(ProductPageUi.SEACH_PRODUCT_TEXTBOX);
        sendkeyToElement(ProductPageUi.SEACH_PRODUCT_TEXTBOX,producName);
    }

    @Step("Verify all product title")
    public boolean allProductsTitleIsDisplayed() {
        waitForElementVisible(ProductPageUi.ALL_PRODUCT_TITLE);
        return isElementDisplayed(ProductPageUi.ALL_PRODUCT_TITLE);
    }

    @Step("Verify Men T Shirt Item title")
    public boolean menTshirtItemIsDisplayed() {
        waitForElementVisible(ProductPageUi.MEN_TSHIRT_ITEM);
        return isElementDisplayed(ProductPageUi.MEN_TSHIRT_ITEM);
    }

    @Step("Verify Medame top for women Item title")
    public boolean madameTopForWomenIsDisplayed() {
        waitForElementVisible(ProductPageUi.MADAME_TOP_FOR_WOMEN_ITEM);
        return  isElementDisplayed(ProductPageUi.MADAME_TOP_FOR_WOMEN_ITEM);
    }

    @Step("Verify Lace top for women Item title")
    public boolean laceTopForWomenIsDisPlayed() {
        waitForElementVisible(ProductPageUi.LACE_TOP_FOR_WOMEN_ITEM);
        return isElementDisplayed(ProductPageUi.LACE_TOP_FOR_WOMEN_ITEM);
    }

    @Step("hover to blue top Item title")
    public void hoverToBlueTopItem() {
        waitForElementVisible(ProductPageUi.BLUE_TOP_ITEM);
        hoverToElement(ProductPageUi.BLUE_TOP_ITEM);
    }

    @Step("Click on Blue top Item title")
    public void clickOnBlueTopAddToCartButton() {
        waitForElementClickable(ProductPageUi.BLUE_TOP_ADD_TO_CART_BUTTON);
        clickToElementByJS(ProductPageUi.BLUE_TOP_ADD_TO_CART_BUTTON);
    }

    @Step("click on continue shopping button")
    public void clickOnContinueShopingButton() {
        waitForElementClickable(ProductPageUi.CONTINUE_SHOPING_BUTTON);
        clickToElementByJS(ProductPageUi.CONTINUE_SHOPING_BUTTON);
    }

    @Step("hover to sleeveless dress for women Item title")
    public void hoverToSleevelessDressItem() {
        waitForElementVisible(ProductPageUi.SLEEVELESS_DRESS_ITEM);
        hoverToElement(ProductPageUi.SLEEVELESS_DRESS_ITEM);
    }

    @Step("click on sleeveless dress add to cart button")
    public void clickOnSleevelessDressAddToCartButton() {
        waitForElementClickable(ProductPageUi.SLEEVELESS_DRESS_ADD_TO_CART_BUTTON);
        clickToElementByJS(ProductPageUi.SLEEVELESS_DRESS_ADD_TO_CART_BUTTON);
    }

    @Step("click on view cart link")
    public ShoppingCartPageObject clickOnViewCartLink() {
        waitForElementClickable(BasePageUI.VIEW_CART_BUTTON);
        clickToElement(BasePageUI.VIEW_CART_BUTTON);
        return  PageGenerator.openShoppingCartPage(driver);
    }

    public BlueTopDetailPO clickToViewBlueTopProductLink() {
        waitForElementClickable(ProductPageUi.VIEW_PRODUCT_BLUE_TOP_LINK);
        clickToElement(ProductPageUi.VIEW_PRODUCT_BLUE_TOP_LINK);
        return PageGenerator.openBlueTopDetailPage(driver);
    }

    public SleevelessDressDetailPO clickToViewSleevelessDressProductLink() {
        waitForElementClickable(ProductPageUi.VIEW_PRODUCT_SLEEVELESS_DRESS_LINK);
        clickToElement(ProductPageUi.VIEW_PRODUCT_SLEEVELESS_DRESS_LINK);
        return PageGenerator.openSleevelessDressDetailPage(driver);
    }
}
