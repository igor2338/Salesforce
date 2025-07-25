package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Picklist {
    String picklistPattern = "//label[text()='%s']//ancestor::lightning-picklist";

    WebDriver driver;
    String label;

    public Picklist(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void select(String option) {

        driver.findElement(By.xpath
                (String.format(picklistPattern + "//button", label))).click();
        driver.findElement(By.xpath
                (String.format(picklistPattern + "//lightning-base-combobox-item//span[text()='%s']", label, option))).click();

    }
}