package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCandidateTest extends BaseTest {

    @Test(enabled=false)
    public void addCandidate(){
        loginPage.login("Admin","admin123");
        menuPage.clickOnRecuitment();
        candidatesPage.enterCandidateDetails("John","Patrick","Doe","jPDoe@gmail.com");
        assert(candidatesPage.validateSuccesfulMsg());
    }


}
