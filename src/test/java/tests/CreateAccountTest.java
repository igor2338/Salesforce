package tests;

import dto.Account;
import dto.AccountFactory;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static dto.AccountFactory.getAccount;

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
        Account account = getAccount("Hot",
                "Prospect",
                "Apparel",
                "Public",
                "312",
                "324",
                "11");
        loginPage.open()
                .isPageOpened()
                .login("tborodich@tms.sandbox", "Password003!");
        homePage.isPageOpened();
        mainPage.open()
                .isPageOpened()
                .createNewAccount();
        newAccountModal.isPageOpened()
                .createAccount(account);
        accountPage.isPageOpened()
                .getPopupMessage(account.getName());
    }
}
