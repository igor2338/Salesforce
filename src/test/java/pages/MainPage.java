package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    public final By TITLE = By.xpath("//img[@alt='User']");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Отображение элемента на странице")
    public boolean isPageOpened() {
        return driver.findElement(TITLE).isDisplayed();
    }

    @Step("Открытие страницы создания нового аккаунта")
    public void createNewAccount() {
        driver.get("https://tms9-dev-ed.develop.lightning.force.com/lightning/o/Account/new");
    }
}