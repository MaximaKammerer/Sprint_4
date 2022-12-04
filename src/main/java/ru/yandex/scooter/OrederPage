package ru.yandex.scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class OrderPage {
    private static WebDriver driver;
    public OrderPage(WebDriver driver){
        this.driver = driver;
    }


    public By castomerName = By.xpath(".//input[@placeholder = '* Имя']");
    public By castomerSername = By.xpath(".//input[@placeholder = '* Фамилия']");
    public By addressOfCustomer = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    public By subwey = By.xpath(".//input[@placeholder = '* Станция метро']");
    public By telephoneNumber = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    public By nextButton = By.xpath(".//button[text() = 'Далее']");

    public By deliveryDateField = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    public By date = By.xpath(".//div[@class = 'react-datepicker__day react-datepicker__day--005']");
    public By rentalDays = By.xpath(".//div[@class = 'Dropdown-control']");
    public final static By colorBlack = By.xpath(".//input[@id = 'black']");
    public final static By colorGray = By.xpath(".//input[@id = 'grey']");


    public By comment = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");

    public By orderButton = By.xpath(".//button[2][text() = 'Заказать']");
    public By confirmButton = By.xpath(".//button[text() = 'Да']");



    ///
    public void SendCastomerName(String name){
        driver.findElement(castomerName).sendKeys(name);
    }
    public void SendCastomerSername(String Sername){
        driver.findElement(castomerSername).sendKeys(Sername);
    }
    public void SendAddress(String address){
        driver.findElement(addressOfCustomer).sendKeys(address);
    }
    public void SendSabway(String metroStation){
        driver.findElement(subwey).click();
        driver.findElement(subwey).sendKeys(metroStation, Keys.ARROW_DOWN, Keys.ENTER);
    }
    public void SendTelephonenumber(String number) {
        driver.findElement(telephoneNumber).sendKeys(number);
    }
    public void ClickNext(){
        driver.findElement(nextButton).click();
    }
    public void SendDate(){
        driver.findElement(deliveryDateField).click();
        driver.findElement(date).click();
    }

    public void SendRentalDays(){
        driver.findElement(rentalDays).click();
        driver.findElement(By.xpath(".//div[@class = 'Dropdown-menu']/div[2]")).click();
    }
    public void SendColor(By color){
        driver.findElement(color).click();
    }

    public void SendComment(String commetToCourier) {
        driver.findElement(comment).sendKeys(commetToCourier);
    }
    public void ClickOrederButton() {
        driver.findElement(orderButton).click();
    }
    public void ConfirmOrder() {
        driver.findElement(confirmButton).click();
    }
    public void TakeOrder(String name,String serName,String address,String metrostantion,String number,String comment,By color){
        SendCastomerName(name);
        SendCastomerSername(serName);
        SendAddress(address);
        SendSabway(metrostantion);
        SendTelephonenumber(number);
        ClickNext();
        SendDate();
        SendRentalDays();
        SendColor(color);
        SendComment(comment);
        ClickOrederButton();
        ConfirmOrder();
    }
}


