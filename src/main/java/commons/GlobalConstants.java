package commons;

public class GlobalConstants {
    // System Info - Lấy thông tin hệ thống
    public static final String PROJECT_PATH = System.getProperty("user.dir");
    public static final String OS_NAME = System.getProperty("os.name");
    public static final String SEPARATOR = System.getProperty("file.separator");

    // Admin Info - Thông tin đăng nhập admin
    public static final String USERNAME = "phat.truong@mercatus.com";
    public static final String PASSWORD = "Abcd1234";
    public static final String NAME = "phat";
    public static final String EMAIL = "phat.truong@mercatus.com";
    public static final String SUBJECT = "QA automation";
    public static final String YOUR_MESSAGE_HERE = "become QA automation as soon as possible";

    // Admin Info - Thông tin đăng ky admin
    public static final String SIGN_UP_BY_NAME = "phat@mercatus.com";
    public static final String SIGN_UP_BY_EMAIL = "phat@mercatus.com";
    public static final String SIGN_UP_BY_PASSWORD = "Abcd1234";
    public static final String SIGN_UP_BY_FIRST_NAME = "phat";
    public static final String SIGN_UP_BY_LAST_NAME = "truong";
    public static final String SIGN_UP_BY_COMPANY = "Mercatus";
    public static final String SIGN_UP_BY_ADRESSS = "90 nguyen trai";
    public static final String SIGN_UP_BY_ADRESSS_2 = "Thanh Secret Place";
    public static final String SIGN_UP_BY_STAGE = "NY";
    public static final String SIGN_UP_BY_CITY = "Ramat Gan";
    public static final String SIGN_UP_BY_ZIPCODE = "100000";
    public static final String SIGN_UP_BY_PHONE_NUMBER = "0943318878";


    // Wait Info - Thời gian chờ
    public static final long SHORT_TIMEOUT = 5;
    public static final long LONG_TIMEOUT = 30;
    public static final long POLLING_TIMEOUT = 500; // milliseconds

    // Download/Upload file - Đường dẫn file
    public static final String UPLOAD_PATH = PROJECT_PATH + SEPARATOR + "uploadFiles" + SEPARATOR;
    public static final String DOWNLOAD_PATH = PROJECT_PATH + SEPARATOR + "downloadFiles" + SEPARATOR;
    public static final String HINH1 = "hinh1.jpg";
    public static final String HINH1_PICTURE = UPLOAD_PATH + HINH1;

    // Retry Case Failed - Số lần thử lại khi test fail
    public static final int RETRY_NUMBER = 3;

    // Browser Logs/Extension - Đường dẫn logs và extension
    public static final String BROWSER_LOG_PATH = PROJECT_PATH + SEPARATOR + "browserLogs" + SEPARATOR;
    public static final String BROWSER_EXTENSION_PATH = PROJECT_PATH + SEPARATOR + "browserExtensions" + SEPARATOR;


    // HTML Report Folder - Đường dẫn các loại report
    public static final String REPORTNG_PATH = PROJECT_PATH + SEPARATOR + "htmlReportNG" + SEPARATOR;
    public static final String EXTENT_PATH = PROJECT_PATH + SEPARATOR + "htmlExtent" + SEPARATOR;
    public static final String ALLURE_PATH = PROJECT_PATH + SEPARATOR + "htmlAllure" + SEPARATOR;

    // Data Test/Environment - Đường dẫn data test và config
    public static final String DATA_TEST_PATH = PROJECT_PATH + SEPARATOR + "dataTest" + SEPARATOR;
    public static final String ENVIRONMENT_CONFIG_PATH = PROJECT_PATH + SEPARATOR + "environmentConfig" + SEPARATOR;

    // Browser Name - Tên các browser
    public static final String CHROME_BROWSER = "chrome";
    public static final String FIREFOX_BROWSER = "firefox";
    public static final String EDGE_BROWSER = "edge";
    public static final String SAFARI_BROWSER = "safari";

    // Environment - Các môi trường test
    public static final String DEV_ENVIRONMENT = "dev";
    public static final String STAGING_ENVIRONMENT = "staging";
    public static final String PRODUCTION_ENVIRONMENT = "production";

    //Information Payment Card
    public static final String NAME_ON_CARD = "Gilad Provide";
    public static final String CARD_NUMBER = "4444333322221111";
    public static final String CVC = "333";
    public static final String EXPIRATION_MONTH = "07";
    public static final String EXPIRATION_YEAR = "2028";


}