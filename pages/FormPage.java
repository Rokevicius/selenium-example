package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage
{
    public static void submitForm(WebDriver driver)
    {
        InputByID(driver, "first-name","Rokas");
        InputByID(driver, "last-name","Kazlauskas");
        InputByID(driver, "job-title","SDEiT");
        ClickByID(driver, "radio-button-2");
        ClickByID(driver, "checkbox-1");
        DropdownByValue(driver, "2");
        InputByID(driver, "datepicker", "10/25/2022");
        ClickByCSS(driver,".btn.btn-lg.btn-primary");
    }

    static void InputByID(WebDriver driver, String id, String input)
    {
        driver.findElement(By.id(id)).sendKeys(input);
    }

    static void ClickByID(WebDriver driver, String id)
    {
        driver.findElement(By.id(id)).click();
    }

    static void ClickByCSS(WebDriver driver, String cssSelector)
    {
        driver.findElement(By.cssSelector((cssSelector))).click();
    }

    static void DropdownByValue(WebDriver driver, String value)
    {
        driver.findElement(By.cssSelector("option[value=" + "'" + value + "'"));
    }
}
