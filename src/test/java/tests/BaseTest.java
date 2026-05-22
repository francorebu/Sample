package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.TopBarPage;
import pages.CandidatesPage;
import pages.MenuPage;

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
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
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
