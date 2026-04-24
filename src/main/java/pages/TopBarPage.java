package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.GenericMethods;

public class TopBarPage {

    private WebDriver driver;
    private GenericMethods gm;

    private By userDropdown = By.xpath("//li[contains(@class,'userdropdown')]");;

    public TopBarPage(WebDriver driver){
        this.driver = driver;
        this.gm = new GenericMethods(driver);
    }

    public boolean isUserDisplayed(){
        gm.waitForElementVisible(userDropdown);
        return driver.findElement(userDropdown).isDisplayed();
    }
}
