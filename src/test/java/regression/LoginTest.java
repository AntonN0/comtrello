package regression;

import com.trello.ui.core.BrowserFactory;
import com.trello.ui.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BrowserFactory {
    LoginPage loginPage = new LoginPage();

    @Test
    public void login() throws InterruptedException {
        loginPage.open();
        loginPage.login("noga.anton+test@gmail.com", "qwer1234");

        Thread.sleep(10000);
    }
}
