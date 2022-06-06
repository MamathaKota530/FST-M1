package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title of the page is : "+ driver.getTitle());
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("Mamatha");
        lastName.sendKeys("Kota");
        WebElement email = driver.findElement(By.id("email"));
        WebElement contact = driver.findElement(By.id("number"));
        email.sendKeys("abc@gmail.com");
        contact.sendKeys("1234567890");
        WebElement submitButton = driver.findElement(By.className("green"));
        submitButton.click();
        driver.close();

    }
}
