package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is : " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.className("willDisappear"));
        System.out.println("Is checkbox displayed: " + checkbox.isDisplayed());

        WebElement removeCheckbox = driver.findElement(By.id("toggleCheckbox"));
        removeCheckbox.click();
        System.out.println("Is checkbox displayed: " + checkbox.isDisplayed());
        driver.close();

    }
}
