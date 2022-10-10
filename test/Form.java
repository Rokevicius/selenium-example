import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import pages.ConfirmationPage;
import pages.FormPage;

public class Form
{
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/rokas/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPage.submitForm(driver);

        ConfirmationPage.waitForAlertBanner(driver);
        Assert.assertEquals("The form was successfully submitted!", ConfirmationPage.getAlertBannerText(driver));

        driver.quit();
    }


}
