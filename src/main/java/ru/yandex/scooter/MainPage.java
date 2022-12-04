package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private static WebDriver driver;
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";

    //Вопросы о важном

    public final static By howToPay = By.xpath(".//div[@id = 'accordion__heading-0']");
    public final static By TextHowToPay = By.xpath(".//div[@aria-labelledby = 'accordion__heading-0']/p");
    public final static By severalScooters  = By.xpath(".//div[@id = 'accordion__heading-1']");
    public final static By textSeveralScooters = By.xpath(".//div[@aria-labelledby = 'accordion__heading-1']/p");
    public final static By rentalTime  = By.xpath(".//div[@id = 'accordion__heading-2']");
    public final static By textRentalTime = By.xpath(".//div[@aria-labelledby = 'accordion__heading-2']/p");
    public final static By orderToday  = By.xpath(".//div[@id = 'accordion__heading-3']");
    public final static By textOrderToday = By.xpath(".//div[@aria-labelledby = 'accordion__heading-3']/p");
    public final static By scooterReturn  = By.xpath(".//div[@id = 'accordion__heading-4']");
    public final static By textScooterReturn = By.xpath(".//div[@aria-labelledby = 'accordion__heading-4']/p");
    public final static By chargingScooter  = By.xpath(".//div[@id = 'accordion__heading-5']");
    public final static By textChargingScooter = By.xpath(".//div[@aria-labelledby = 'accordion__heading-5']/p");
    public final static By cancellations  = By.xpath(".//div[@id = 'accordion__heading-6']");
    public final static By textCancellations = By.xpath(".//div[@aria-labelledby = 'accordion__heading-6']/p");
    public final static By deliveryArea  = By.xpath(".//div[@id = 'accordion__heading-7']");
    public final static By textDeliveryArea = By.xpath(".//div[@aria-labelledby = 'accordion__heading-7']/p");

    // Кнопка заказа
    public static By OrderButton = By.xpath(".//div[@class = 'Header_Nav__AGCXC']/button[@class = 'Button_Button__ra12g']");

    //Кнопка принять куки
    public static By cookieButton = By.xpath(".//button[@class = 'App_CookieButton__3cvqF']");
    //Принять куки
    public void CloseCookei(){
        driver.findElement(cookieButton).click();
    }



    // Клик по вопросу и получение строки ответа
    public String clickQuestion(By question,By answer) {
        driver.findElement(question).click();
        return driver.findElement(answer).getText();
    }
    //Клик по кнопке заказа
    public void ClickOnOrder(){
        driver.findElement(OrderButton).click();
    }
    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

}
