package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    private final By LOGIN_FILED = By.id("username");
    private final By PASSWORD_FILED = By.id("password");
    private final By LOGIN_BUTTON = By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы авторизации")
    @Override
    public LoginPage open() {
        driver.get(BASE_URL);
        return this;
    }

    @Step("Отображение элемента на странице")
    @Override
    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_FILED));
        return this;
    }

    @Step("Вход в систему с именем пользователя: {user} и паролем: {password}")
    public HomePage login(String user, String password) {
        driver.findElement(LOGIN_FILED).sendKeys(user);
        driver.findElement(PASSWORD_FILED).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }
}