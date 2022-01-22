import org.testng.Assert;
import org.testng.annotations.Test;

public class tests extends BaseTest{
    @Test
    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.sleep(2000);
        loginPage.clickLogin();
        Assert.assertEquals(loginPage.getError(),"Epic sadface: Username is required");
        loginPage.fillUserName("standard");
        loginPage.fillPassword("secret_sauce");
        loginPage.clickLogin();
        Assert.assertEquals(loginPage.getError(),"Epic sadface: Username and password do not match any user in this service");
        loginPage.sleep(2000);
        loginPage.fillUserName("standard_user");
        loginPage.fillPassword("secret_sauce");
        loginPage.clickLogin();
        loginPage.sleep(2000);

        loginPage.tearDown();


    }

}
