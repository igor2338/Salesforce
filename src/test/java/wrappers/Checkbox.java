package wrappers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {
    WebDriver driver;
    String lable;

    public Checkbox(WebDriver driver, String lable) {
        this.driver = driver;
        this.lable = lable;
    }

    public void clicking() {
        driver.findElement(By.xpath(String.format("//span[text()='%s']//ancestor::records-record-layout-row//input", lable))).click();
    }
}