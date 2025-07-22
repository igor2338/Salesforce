package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import wrappers.Checkbox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

public class NewAccountModal extends BasePage {
    public final By TITLE = By.xpath("//img[@alt='User']");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Step("Отображение элемента на странице")
    public boolean isPageOpened() {
        return driver.findElement(TITLE).isDisplayed();
    }

    @Step("Заполнение AccountModal")
    public void createAccount(String newAccountName) {
        new Picklist(driver, "Rating").select("Hot");
        new Picklist(driver, "Type").select("Prospect");
        new Picklist(driver, "Industry").select("Apparel");
        new Picklist(driver, "Ownership").select("Public");
        new Input(driver, "Account Name").write(newAccountName);
        new Input(driver, "Phone").write("+79292491488");
        new Input(driver, "Fax").write("+792924914599");
        new Input(driver, "Account Number").write("123");
        new Input(driver, "Website").write("www.yahoo.com");
        new Input(driver, "Account Site").write("userTest");
        new Input(driver, "Ticker Symbol").write("312");
        new Input(driver, "Employees").write("324");
        new Input(driver, "Annual Revenue").write("11");
        new Input(driver, "SIC Code").write("11");
        new Textarea(driver, "Billing Street").write("Textarea 1");
        new Textarea(driver, "Shipping Street").write("Textarea 2");
        new Checkbox(driver, "VIP Client").clicking();
        new Checkbox(driver, "TeachMeSkills").clicking();
        driver.findElement(By.xpath("//button[text()='Save']")).click();
    }
}