package tests;

import io.qameta.allure.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GeneralTest extends BaseTest {
    @DataProvider(name = "LoginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"tborodich@tms.sandbox", "Password003!", "test30"},
                //третье значение - название создаваемого аккаунта
        };
    }

    @Test(priority = 1, dataProvider = "LoginData",
            description = "Позитивный. Авторизация, создание аккаунта.",
            testName = "Позитивный. Авторизация, создание аккаунта",
            groups = {"Login"})
    @Severity(SeverityLevel.NORMAL)
    @Owner("Бессолицын Игорь Валерьевич")
    @Link("https://tms9-dev-ed.develop.lightning.force.com")
    @Epic("Login, Account")
    @Feature("Log In, Create Account")
    @Story("checkAuthentificationCreateAccount")
    @TmsLink("ITM-4")
    @Issue("ITM-4-Salesforce")
    @Description("Авторизация, создание аккаунта, проверка созданного аккаунта")
    public void checkAuthentification(String user, String password, String newAccountName) {
        loginPage.open();
        loginPage.login(user, password);
        mainPage.isPageOpened();
        mainPage.createNewAccount();
        newAccountModal.isPageOpened();
        newAccountModal.createAccount(newAccountName);
        accountPage.getPopupMessage(newAccountName);
    }
}
