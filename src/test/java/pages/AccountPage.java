package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class AccountPage extends BasePage {
    String URL = BASE_URL + "/lighting/setup/SetupOneHome/home";
    private final By MESSAGE = By.xpath("//span[contains(@class, 'toastMessage')]");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы аккаунта")
    @Override
    public AccountPage open() {
        driver.get(URL);
        return this;
    }

    @Step("Отображение элемента на странице")
    @Override
    public AccountPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MESSAGE));
        return this;
    }

    public void getPopupMessage(String newAccountName) {
        driver.findElement(MESSAGE).getText();
        String message = "Account \"" + newAccountName + "\" was created.";
        assertEquals(driver.findElement(MESSAGE).getText(),
                message,
                "Сообщение не соответствует");
    }
}