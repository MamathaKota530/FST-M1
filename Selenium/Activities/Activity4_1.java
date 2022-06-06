package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of the page is : "+ driver.getTitle());
        WebElement aboutUs = driver.findElement(By.xpath("//a[@id='about-link']"));
        aboutUs.click();
        Thread.sleep(5000);
        System.out.println("Title of the new page is : "+ driver.getTitle());
        driver.close();
    }
}
