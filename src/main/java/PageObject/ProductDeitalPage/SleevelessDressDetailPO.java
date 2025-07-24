package PageObject.ProductDeitalPage;
import PageObject.HeaderPageObject.ProductPageObject;
import PageObject.ShoppingCartPageObject;
import PageUI.BasePageUI;
import PageUI.HeaderPageUI.HomePageUi;
import PageUI.ProductDetailUI.SleevessDressDetailUI;
import commons.BasePage;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class SleevelessDressDetailPO extends BasePage {
    public SleevelessDressDetailPO(WebDriver driver) {
        super(driver);
    }

    public String getNameOfProduct() {
        waitForElementVisible(SleevessDressDetailUI.NAME_OF_PRODUCT);
        return getTextElement(SleevessDressDetailUI.NAME_OF_PRODUCT);

    }

    public String getCategoryOfProduct() {
        waitForElementVisible(SleevessDressDetailUI.CATEGORY_OF_PRODUCT);
        return getTextElement(SleevessDressDetailUI.CATEGORY_OF_PRODUCT);
    }

    public String getPriceOfProduct() {
        waitForElementVisible(SleevessDressDetailUI.PRICE_OF_PRODUCT);
        return getTextElement(SleevessDressDetailUI.PRICE_OF_PRODUCT);
    }

    public String getAvabilityOfProduct() {
        waitForElementVisible(SleevessDressDetailUI.AVALIABILITY_OF_PRODUCT);
        return getTextElement(SleevessDressDetailUI.AVALIABILITY_OF_PRODUCT);
    }

    public String getConditionOfProduct() {
        waitForElementVisible(SleevessDressDetailUI.CONDITION_OF_PRODUCT);
        return getTextElement(SleevessDressDetailUI.CONDITION_OF_PRODUCT);
    }

    public String getBrandOfProduct() {
        waitForElementVisible(SleevessDressDetailUI.BRAND_OF_PRODUCT);
        return getTextElement(SleevessDressDetailUI.BRAND_OF_PRODUCT);
    }

    public void increasedProduct(String numberQuantity) {
        waitForElementClickable(SleevessDressDetailUI.QUANTITY_TEXT_BOX);
        sendkeyToElement(SleevessDressDetailUI.QUANTITY_TEXT_BOX,numberQuantity);
    }

    public void clickToAddToCartButton() {
        waitForElementClickable(SleevessDressDetailUI.ADD_TO_CART_BUTTON);
        clickToElement(SleevessDressDetailUI.ADD_TO_CART_BUTTON);
    }

    public ShoppingCartPageObject clickToViewCartLink() {
        waitForElementClickable(BasePageUI.VIEW_CART_BUTTON);
        clickToElement(BasePageUI.VIEW_CART_BUTTON);
        return PageGenerator.openShoppingCartPage(driver);
    }

    public ProductPageObject clickToProductLink() {
        waitForElementClickable(HomePageUi.PRODUCT_LINK);
        clickToElement(HomePageUi.PRODUCT_LINK);
        return PageGenerator.openProductPage(driver);
    }
}

