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
    public void createAccount(String rating,
                              String type,
                              String industry,
                              String ownership,
                              String newAccountName,
                              String phone,
                              String fax,
                              String accountNumber,
                              String website,
                              String accountSite,
                              String tickerSymbol,
                              String employees,
                              String annualRevenue,
                              String sicCode,
                              String billingStreet,
                              String shippingStreet
    ) {
        new Picklist(driver, "Rating").select(rating);
        new Picklist(driver, "Type").select(type);
        new Picklist(driver, "Industry").select(industry);
        new Picklist(driver, "Ownership").select(ownership);
        new Input(driver, "Account Name").write(newAccountName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Fax").write(fax);
        new Input(driver, "Account Number").write(accountNumber);
        new Input(driver, "Website").write(website);
        new Input(driver, "Account Site").write(accountSite);
        new Input(driver, "Ticker Symbol").write(tickerSymbol);
        new Input(driver, "Employees").write(employees);
        new Input(driver, "Annual Revenue").write(annualRevenue);
        new Input(driver, "SIC Code").write(sicCode);
        new Textarea(driver, "Billing Street").write(billingStreet);
        new Textarea(driver, "Shipping Street").write(shippingStreet);
        new Checkbox(driver, "VIP Client").clicking();
        new Checkbox(driver, "TeachMeSkills").clicking();
        driver.findElement(By.xpath("//button[text()='Save']")).click();
    }
}