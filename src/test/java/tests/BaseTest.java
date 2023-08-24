package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.TopBarPage;
import pages.CandidatesPage;
import pages.MenuPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected TopBarPage topBarPage;
    protected CandidatesPage candidatesPage;
    protected MenuPage menuPage;

    @BeforeClass
    public void setUp() {
        this.driverSetup();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        this.pagesInstantiation();
    }

    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void pagesInstantiation(){
        loginPage = new LoginPage(driver);
        topBarPage= new TopBarPage(driver);
        menuPage = new MenuPage(driver);
        candidatesPage = new CandidatesPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
