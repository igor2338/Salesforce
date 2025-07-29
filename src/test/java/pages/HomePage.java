package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {
    String URL = BASE_URL + "/lighting/setup/SetupOneHome/home";
    public final By TITLE = By.cssSelector(".uiImage");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие страницы аккаунта")
    @Override
    public HomePage open() {
        driver.get(URL);
        return this;
    }

    @Step("Отображение элемента на странице")
    @Override
    public HomePage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }
}
