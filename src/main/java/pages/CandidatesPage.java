package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.GenericMethods;

public class CandidatesPage {

    private WebDriver driver;
    private GenericMethods gm;

    private By addCandidateButton = By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    private By firstName = By.xpath("//*[@name='firstName']");
    private By middleName = By.xpath("//*[@name='middleName']");
    private By lastName = By.xpath("//*[@name='lastName']");
    private By email = By.xpath("//*[text()='Email']/../following-sibling::div/input");
    private By save = By.xpath("//button[@type='submit']");
    private By succesfulMsg = By.xpath("//*[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']");

    public CandidatesPage(WebDriver driver){
        this.driver = driver;
        this.gm = new GenericMethods(driver);
    }

    public void clickOnAddCandidate(){
        gm.waitForElementVisible(driver,15,addCandidateButton);
        driver.findElement(addCandidateButton).click();
    }

    public void enterCandidateDetails(String fName,String mName,String lName,String email){
        this.clickOnAddCandidate();
        this.enterFirstName(fName);
        this.enterMiddleName(mName);
        this.enterLastName(lName);
        this.enterEmail(email);
        this.clickOnSave();
    }

    public void enterFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }

    public void enterMiddleName (String mName){
        driver.findElement(middleName).sendKeys(mName);
    }

    public void enterLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }

    public void enterEmail(String email){
        driver.findElement(this.email).sendKeys(email);
    }

    public void clickOnSave(){
        driver.findElement(save).click();
    }

    public boolean validateSuccesfulMsg(){
        try {
            gm.waitForElementVisible(driver,15,succesfulMsg);
            driver.findElement(succesfulMsg).isDisplayed();
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
