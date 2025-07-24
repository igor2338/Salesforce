package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class CreateAccountTest extends BaseTest {
    @Test(priority = 1,
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
    public void checkAuthentification() {
        loginPage.open();
        loginPage.login("tborodich@tms.sandbox", "Password003!");
        mainPage.isPageOpened();
        mainPage.createNewAccount();
        newAccountModal.isPageOpened();
        newAccountModal.createAccount(
                "Hot",
                "Prospect",
                "Apparel",
                "Public",
                "test11",
                "+79292491488",
                "+792924914599",
                "123",
                "www.yahoo.com",
                "userTest",
                "312",
                "324",
                "11",
                "11",
                "Textarea 1",
                "Textarea 2"
        );
        accountPage.getPopupMessage("test11");
    }
}
