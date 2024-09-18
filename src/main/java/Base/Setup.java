package Base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Setup {

    public static WebDriver driver;
    public static ExtentTest test;
    public static ExtentReports extent= new ExtentReports();
    public static FileInputStream fis;
    public static Properties prop= new Properties();
    ExtentSparkReporter spark= new ExtentSparkReporter("target/extentReport.html");

    @BeforeTest
//    public void BaseTest(){
//        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
//        driver.get("https://polarionqa.molex.com/polarion/#/project/1132023?shortcut=favorites%2FHome");
//        driver.manage().window().maximize();
//    }
    public static void initializeBrowser() throws IOException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe");
        if (driver == null) {
            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\resources.properties");
            prop.load(fis);
        }
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));
        }
        if (prop.getProperty("browser").equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
            driver.get(prop.getProperty("url"));
        }
    }
//        shivpratapsingh.chauha@BeforeSuite
//    public void beforeTest(){
//        spark.config().setDocumentTitle("AssignmentSelenium");
//        spark.config().setReportName("Report Shiv");
//        spark.config().setTheme(Theme.DARK);
//
//        extent.attachReporter(spark);
//        extent.setSystemInfo("OS", System.getProperty("os.name"));
//        extent.setSystemInfo("JAVA Version", System.getProperty("java.version"));
//    }
//
//    @AfterSuite
//    public void teardown(){
//        extent.flush();
//    }
//    @AfterTest
//    public  void tearDown(){
//        driver.close();
//    }
}
