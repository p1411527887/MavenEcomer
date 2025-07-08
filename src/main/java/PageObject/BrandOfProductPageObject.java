package PageObject;

import PageUI.BrandOfProductPageUi;
import commons.PageGenerator;
import org.openqa.selenium.WebDriver;

public class BrandOfProductPageObject extends ProductPageObject {
    public BrandOfProductPageObject(WebDriver driver) {
        super(driver);
    }

    public PoloBrandPageObject getPoloBrandPage() {
        waitForElementClickable(BrandOfProductPageUi.BRANDS_POLO_LINK);
        clickToElementByJS(BrandOfProductPageUi.BRANDS_POLO_LINK);
        return PageGenerator.getPoloBrandPage(driver);

    }

    public HAndMBrandPageObject getHAndMBrandPage() {
        waitForElementClickable(BrandOfProductPageUi.BRANDS_H_AND_M_LINK);
        clickToElement(BrandOfProductPageUi.BRANDS_H_AND_M_LINK);
        return PageGenerator.openHAndMBrandPage(driver);

    }

    public MadameBrandPageObject getMadameBrandPage() {
        waitForElementClickable(BrandOfProductPageUi.BRANDS_MADAME_LINK);
        clickToElement(BrandOfProductPageUi.BRANDS_MADAME_LINK);
        return PageGenerator.openMadameBrandPage(driver);

    }

    public MastAndHarbourBrandPageObject getMastAndHarbourBrandPage() {
        waitForElementClickable(BrandOfProductPageUi.BRANDS_MAST_AND_HARBOUR_LINK);
        clickToElement(BrandOfProductPageUi.BRANDS_MAST_AND_HARBOUR_LINK);
        return PageGenerator.openMastAndHarbourBrandPage(driver);
    }

    public BabyHugBrandPageObject getBabyHugBrandPage() {
        waitForElementClickable(BrandOfProductPageUi.BRANDS_BABY_HUG_LINK);
        clickToElement(BrandOfProductPageUi.BRANDS_BABY_HUG_LINK);
        return PageGenerator.openBabyHugBrandPage(driver);
    }

    public AllenSollyJuniorBrandPageObject getAllenSollyJuniorBrandPage() {
        waitForElementClickable(BrandOfProductPageUi.BRANDS_ALLEN_SOLLY_JUNIOR_LINK);
        clickToElement(BrandOfProductPageUi.BRANDS_ALLEN_SOLLY_JUNIOR_LINK);
        return PageGenerator.getAllenSollyJuniorBrandPage(driver);
    }

    public KookieKidsBrandPageObject getKookieKidsBrandPage() {
        waitForElementClickable(BrandOfProductPageUi.BRANDS_KOOKIE_KID_LINK);
        clickToElement(BrandOfProductPageUi.BRANDS_KOOKIE_KID_LINK);
        return PageGenerator.getKookieKidsBrandPage(driver);
    }

    public BibaBrandPageObject getBibaBrandPage() {
        waitForElementClickable(BrandOfProductPageUi.BRANDS_BIBA_LINK);
        clickToElement(BrandOfProductPageUi.BRANDS_BIBA_LINK);
        return PageGenerator.getBibaBrandPage(driver);
    }

    public BrandOfProductPageObject getBrandPageByDynamicLocator(String pageName) {
        waitForElementClickable(BrandOfProductPageUi.DYNAMIC_BRANDS_LINK, pageName);
        clickToElement(BrandOfProductPageUi.DYNAMIC_BRANDS_LINK, pageName);
        switch (pageName) {
            case "Polo":
                return PageGenerator.getPoloBrandPage(driver);
            case "H&M":
                return PageGenerator.openHAndMBrandPage(driver);
            case "Madame":
                return PageGenerator.openMadameBrandPage(driver);
            case "Mast & Harbour":
                return PageGenerator.openMastAndHarbourBrandPage(driver);
            case "Babyhug":
                return PageGenerator.openBabyHugBrandPage(driver);
            case "Allen Solly Junior":
                return PageGenerator.getAllenSollyJuniorBrandPage(driver);
            case "Kookie Kids":
                return PageGenerator.getKookieKidsBrandPage(driver);
            case "Biba":
                return PageGenerator.getBibaBrandPage(driver);
            default:
                throw new RuntimeException("page name is not valid");
        }

    }


}
