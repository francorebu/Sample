package uitests;

import org.testng.annotations.Test;

public class LoginInvalidTest extends BaseTest {

    @Test
    public void invalidLoginTest() {
        loginPage.login("Admin","InvalidPass");
        assert(loginPage.isErrorMsgDisplayed());
    }

}
