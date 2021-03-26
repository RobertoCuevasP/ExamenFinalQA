package selenium.extra;

import org.junit.Assert;
import org.junit.Test;
import selenium.pomPages.todoLy.*;
import selenium.singletonSession.Session;

public class Ejercicio2 extends BaseTodoly {
    MainPage mainPage = new MainPage();
    LoginModal loginModal = new LoginModal();
    LeftSection leftSection = new LeftSection();
    MenuSection menuSection = new MenuSection();
    CenterSection centerSection = new CenterSection();
    String user = "rcuevas17@ignis.com";

    String pwd = "1234567890";
    String newPwd= "12345";

    @Test
    public void verify_pass() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);

        centerSection.setting.click();

        centerSection.editOldPass.click();
        centerSection.editOldPass.set(pwd);
        centerSection.editNewPass.click();
        centerSection.editNewPass.set(newPwd);
        centerSection.ok.click();

        mainPage.logout.click();
        mainPage.loginImage.click();
        loginModal.loginAction(user, newPwd);
        Assert.assertTrue("ERROR",menuSection.logoutButton.controlIsDisplayed());





    }
}
