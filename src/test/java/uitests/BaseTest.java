package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.TopBarPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected TopBarPage topBarPage;

    @BeforeClass
    public void setUp() {
        this.driverSetup();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        this.pagesInstantiation();
    }

    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver", "C:/Automation/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void pagesInstantiation(){
        loginPage = new LoginPage(driver);
        topBarPage= new TopBarPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
