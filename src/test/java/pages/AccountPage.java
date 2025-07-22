package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class AccountPage extends BasePage {
    private final By MESSAGE = By.xpath("//span[contains(@class, 'toastMessage')]");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void getPopupMessage(String newAccountName) {
        driver.findElement(MESSAGE).getText();
        String message = "Account \"" + newAccountName + "\" was created.";
        assertEquals(driver.findElement(MESSAGE).getText(),
                message,
                "Сообщение не соответствует");
    }
}