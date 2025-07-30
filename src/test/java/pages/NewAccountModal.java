package pages;

import dto.Account;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import wrappers.Checkbox;
import wrappers.Input;
import wrappers.Picklist;
import wrappers.Textarea;

public class NewAccountModal extends BasePage {
    String URL = BASE_URL + "/lighting/o/Account/new";
    public final By TITLE = By.cssSelector(".uiImage");

    public NewAccountModal(WebDriver driver) {
        super(driver);
    }

    @Step("Открытие модального окна создания аккаунта")
    @Override
    public NewAccountModal open() {
        driver.get(URL);
        return this;
    }

    @Step("Отображение элемента на странице")
    @Override
    public NewAccountModal isPageOpened() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TITLE));
        return this;
    }

    @Step("Заполнение AccountModal")
    public void createAccount(Account account) {
        new Picklist(driver, "Rating").select(account.getRating());
        new Picklist(driver, "Type").select(account.getType());
        new Picklist(driver, "Industry").select(account.getIndustry());
        new Picklist(driver, "Ownership").select(account.getOwnership());
        new Input(driver, "Account Name").write(account.getName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Fax").write(account.getFax());
        new Input(driver, "Account Number").write(account.getAccountNumber());
        new Input(driver, "Website").write(account.getWebsite());
        new Input(driver, "Account Site").write(account.getAccountSite());
        new Input(driver, "Ticker Symbol").write(account.getTickerSymbol());
        new Input(driver, "Employees").write(account.getEmployees());
        new Input(driver, "Annual Revenue").write(account.getAnnualRevenue());
        new Input(driver, "SIC Code").write(account.getSicCode());
        new Textarea(driver, "Billing Street").write(account.getBillingStreet());
        new Textarea(driver, "Shipping Street").write(account.getShippingStreet());
        new Checkbox(driver, "VIP Client").clicking();
        new Checkbox(driver, "TeachMeSkills").clicking();
        driver.findElement(By.xpath("//button[text()='Save']")).click();
        new AccountPage(driver);
    }
}