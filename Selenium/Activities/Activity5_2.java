package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("Title of the page is : " + driver.getTitle());

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("Is checkbox selected: " + checkbox.isSelected());
        checkbox.click();
        //Thread.sleep(5000);
        System.out.println("Is checkbox selected: " + checkbox.isSelected());
        driver.close();

    }
}
