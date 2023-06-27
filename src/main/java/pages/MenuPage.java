package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.GenericMethods;
import utils.GenericMethods.*;

public class MenuPage {
    private WebDriver driver;
    private GenericMethods gm;

    private By recruitmentItem = By.xpath("//*[contains(@href,'Recruitment')]");

    public MenuPage(WebDriver driver){
        this.driver = driver;
        this.gm = new GenericMethods(driver);
    }

    public void clickOnRecuitment(){
        gm.waitforElementVisible(driver,15,recruitmentItem);
        driver.findElement(recruitmentItem).click();
    }
}
