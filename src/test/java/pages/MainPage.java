package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    String URL = BASE_URL + "/lightning/o/Account/list";
    public final By TITLE = By.xpath("//div[@title='New']");


    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы аккаунта")
    @Override
    public MainPage open() {
        driver.get(URL);
        return this;
    }

    @Step("Отображение элемента на странице")
    @Override
    public MainPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    @Step("Клик кнопки New")
    public NewAccountModal createNewAccount() {
        driver.findElement(TITLE).click();
        return new NewAccountModal(driver);
    }
}