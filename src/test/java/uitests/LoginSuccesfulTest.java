package uitests;

import org.testng.annotations.Test;

public class LoginSuccesfulTest extends BaseTest {

    @Test
    public void validLoginTest() {
        loginPage.login("Admin","admin123");
        assert(topBarPage.isUserDisplayed());
    }

}
