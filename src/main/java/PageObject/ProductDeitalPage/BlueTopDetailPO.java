package PageObject.ProductDeitalPage;
import PageObject.HeaderPageObject.ProductPageObject;
import PageObject.ShoppingCartPageObject;
import PageUI.BasePageUI;
import PageUI.HeaderPageUI.HomePageUi;
import PageUI.ProductDetailUI.BlueTopDetailUI;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class BlueTopDetailPO extends BasePage {
    public BlueTopDetailPO(WebDriver driver) {
        super(driver);
    }

    public String getNameOfProduct() {
        waitForElementVisible(BlueTopDetailUI.NAME_OF_PRODUCT);
        return getTextElement(BlueTopDetailUI.NAME_OF_PRODUCT);
    }

    public String getCategoryOfProduct() {
        waitForElementVisible(BlueTopDetailUI.CATEGORY_OF_PRODUCT);
        return getTextElement(BlueTopDetailUI.CATEGORY_OF_PRODUCT);
    }

    public String getPriceOfProduct() {
        waitForElementVisible(BlueTopDetailUI.PRICE_OF_PRODUCT);
        return getTextElement(BlueTopDetailUI.PRICE_OF_PRODUCT);
    }

    public String getAvabilityOfProduct() {
        waitForElementVisible(BlueTopDetailUI.AVALIABILITY_OF_PRODUCT);
        return getTextElement(BlueTopDetailUI.AVALIABILITY_OF_PRODUCT);
    }

    public String getConditionOfProduct() {
        waitForElementVisible(BlueTopDetailUI.CONDITION_OF_PRODUCT);
        return getTextElement(BlueTopDetailUI.CONDITION_OF_PRODUCT);

    }

    public String getBrandOfProduct() {
        waitForElementVisible(BlueTopDetailUI.BRAND_OF_PRODUCT);
        return getTextElement(BlueTopDetailUI.BRAND_OF_PRODUCT);
    }

    public void increasedProduct(String numberQuantity) {
        waitForElementClickable(BlueTopDetailUI.QUANTITY_TEXT_BOX);
        sendkeyToElement(BlueTopDetailUI.QUANTITY_TEXT_BOX,numberQuantity);
    }

    public void clickToAddToCartButton() {
        waitForElementClickable(BlueTopDetailUI.ADD_TO_CART_BUTTON);
        clickToElement(BlueTopDetailUI.ADD_TO_CART_BUTTON);
    }

    public ProductPageObject clickToProductLink() {
        waitForElementClickable(HomePageUi.PRODUCT_LINK);
        clickToElement(HomePageUi.PRODUCT_LINK);
        return PageGenerator.openProductPage(driver);
    }

    public void clickToContinueShoppingButton() {
        waitForElementClickable(BasePageUI.CONTINUE_SHOPPING_BUTTON);
        clickToElement(BasePageUI.CONTINUE_SHOPPING_BUTTON);
    }

    public ShoppingCartPageObject clickToViewCartLink() {
        waitForElementClickable(BasePageUI.VIEW_CART_BUTTON);
        clickToElement(BasePageUI.VIEW_CART_BUTTON);
        return PageGenerator.openShoppingCartPage(driver);
    }
}

