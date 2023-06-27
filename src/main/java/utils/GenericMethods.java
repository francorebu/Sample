package utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import com.google.common.io.Files;

public class GenericMethods {

    WebDriver driver;

    JavascriptExecutor js= (JavascriptExecutor) driver;

    public GenericMethods(WebDriver driver ) {
        this.driver=driver;
    }

    public boolean waitforElementVisible (WebDriver driver, int timeout, By locator ) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }





}
