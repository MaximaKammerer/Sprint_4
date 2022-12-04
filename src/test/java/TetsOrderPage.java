
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.scooter.MainPage;
import ru.yandex.scooter.OrderPage;
import static ru.yandex.scooter.OrderPage.*;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TetsOrderPage {

    private String name;
    private String serName;
    private String address;
    private String metrostantion;
    private String number;
    private String comment;
    private By color;

    public TetsOrderPage(String name, String serName, String address, String metrostantion, String number, String comment, By color) {
        this.name = name;
        this.serName = serName;
        this.address = address;
        this.metrostantion = metrostantion;
        this.number = number;
        this.comment = comment;
        this.color = color;
    }

    @Parameterized.Parameters
    public static Object[][] Object() {
        return new Object[][]{
                {"Рустам", "Курбанов", "Далеко 173", "Черкизовская", "+7961622111", "Ждем самокат", colorBlack},
                {"Рустам", "Курбанов", "Далеко 173", "Черкизовская", "+7961622111", "Ждем самокат", colorGray},

        };
    }

    @Test
    public void checkActivity() {
        //WebDriver driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        driver.get(MainPage.URL);
        objMainPage.CloseCookei();
        objMainPage.ClickOnOrder();
        objOrderPage.TakeOrder(name, serName, address, metrostantion, number, comment, color);

        driver.quit();
    }
}
