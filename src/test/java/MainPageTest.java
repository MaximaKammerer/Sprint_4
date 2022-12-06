
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  ru.yandex.scooter.MainPage;
import org.openqa.selenium.JavascriptExecutor;



import static org.junit.Assert.assertEquals;
import static ru.yandex.scooter.MainPage.*;


import java.time.Duration;

@RunWith(Parameterized.class)
public class MainPageTest {
    private By question;
    private By answer;
    private String correctAnswer;
    public WebDriver driver = MainPage.getDriver();

    public MainPageTest(By question, By answer, String correctAnswer) {
        this.question = question;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
    }

    @Parameterized.Parameters()
    public static Object[][] Object() {
        return new Object[][]{
                {howToPay, TextHowToPay, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                {severalScooters, textSeveralScooters, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                {rentalTime, textRentalTime, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                {orderToday, textOrderToday, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                {scooterReturn, textScooterReturn, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                {chargingScooter, textChargingScooter, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                {cancellations, textCancellations, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                {deliveryArea, textDeliveryArea, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},

        };
    }


    @Test
    public void checkActivity() {

        MainPage objMainPage = new MainPage(driver);
        driver.get(URL);
      new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.elementToBeClickable(question));
        WebElement element = driver.findElement(question);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);


        assertEquals(objMainPage.clickQuestion(question, answer), correctAnswer);

    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}


