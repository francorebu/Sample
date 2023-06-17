package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameField  = By.xpath("//*[@name='username']");
    private By passwordField  = By.xpath("//*[@name='password']");
    private By loginButton    = By.xpath("//button[@type='submit']");
    private By errorMessage   = By.xpath("//*[contains(@class,'content--error')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user,String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLoginButton();
    }

    public void enterUsername(String username) {
       driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMsgDisplayed(){
        return driver.findElement(errorMessage).isDisplayed();
    }
}
