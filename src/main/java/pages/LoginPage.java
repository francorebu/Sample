package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By usernameField  = By.xpath("//*[@name='username']");
    private By passwordField  = By.xpath("//*[@name='password']");
    private By loginButton    = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user,String pass) throws InterruptedException {
        enterUsername(user);
        enterPassword(pass);
        Thread.sleep(2000);
        clickLoginButton();
    }

    public void enterUsername(String username) {
       System.out.println(".....It is entering username : ...... " + username ) ;
       driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        System.out.println(".....It is entering password : ...... " + password ) ;
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        System.out.println(".....It is clicking on Login button : ...... "  ) ;
        driver.findElement(loginButton).click();
    }
}
