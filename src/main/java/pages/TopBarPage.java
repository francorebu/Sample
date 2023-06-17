package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopBarPage {

    private WebDriver driver;

    private By userDropdown = By.xpath("//li[contains(@class,'userdropdown')]");;

    public TopBarPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isUserDisplayed(){
        return driver.findElement(userDropdown).isDisplayed();
    }
}
