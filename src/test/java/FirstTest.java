import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class FirstTest extends FrameWork {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumTests\\src\\main\\resources\\chromedriver.exe");
        driver.manage().deleteAllCookies();
        driver.get("https://en.wikipedia.org");
        driver.manage().window().maximize();

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//input[@id=\"searchInput\"]"))).sendKeys("Selenium");

        findAndClickElementByXpath("//input[@id=\"searchButton\"]");

        findAndClickElementByXpath("//a[text()=\"Contents\"]");

        findAndSendKeysByXpath("//input[@id=\"searchInput\"]", "Selenide");

        findAndClickElementByXpath("//span[@class=\"toctext\" and text()=\"Examples\"]");

        findAndClickElementByXpath("//a[@title=\"Niobium diselenide\"]");

        findAndClickElementByXpath("//a[@title=\"Niobium\" and text()=\"Niobium\"]");

        findAndClickElementByXpath("//span[text()=\"Palladium\"]");

        findAndClickElementByXpath("//button[@class=\"uls-settings-trigger\" and @title=\"Language settings\"]");

        findAndDoubleClick("//button[text()=\"Fonts\"]");

        findAndClickElementByXpath("//div[@class=\"mw-ui-checkbox\"]");

        findAndClickElementByXpath("//select[@id=\"content-font-selector\"]");

        findAndClickElementByXpath("//option[@value=\"ComicNeue\"]");

        findAndClickElementByXpath("//button[text()=\"Apply settings\"]");

        driver.quit();
    }
}
