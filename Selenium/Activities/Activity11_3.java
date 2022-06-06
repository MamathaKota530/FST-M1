package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title of the page is : " + driver.getTitle());

        driver.findElement(By.cssSelector("button#prompt")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);
        alert.sendKeys("Training!");
        alert.accept();


        driver.close();

    }
}
