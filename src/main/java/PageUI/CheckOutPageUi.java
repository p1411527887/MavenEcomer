package PageUI;

public class CheckOutPageUi {
    public static final String CUSTOMER_NAME = "//h3[text()='Your delivery address']/parent::li/following-sibling::li[contains(@class, 'address_lastname')]";
    public static final String COMPANY_NAME = "//h3[text()='Your delivery address']/parent::li/following-sibling::li[contains(@class, 'ddress_address2')][1]";
    public static final String ADRESS = "//h3[text()='Your delivery address']/parent::li/following-sibling::li[contains(@class, 'ddress_address2')][2]";
    public static final String ADRESS_2 = "//h3[text()='Your delivery address']/parent::li/following-sibling::li[contains(@class, 'ddress_address2')][3]";
    public static final String CITY = "//h3[text()='Your delivery address']/parent::li/following-sibling::li[contains(@class, 'address_state_name')]";
    public static final String COUNTRY = "//h3[text()='Your delivery address']/parent::li/following-sibling::li[contains(@class, 'address_country')]";
    public static final String PHONE_NUMBER = "//h3[text()='Your delivery address']/parent::li/following-sibling::li[contains(@class, 'address_phone')]";
    public static final String PLACE_ORDER_BUTTON = "//div/a[text()='Place Order']";

}
