package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String args[]){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        System.out.println("Title of Page is : " + driver.getTitle());
        WebElement AboutUsID = driver.findElement(By.id("about-link"));
        System.out.println("Element Text is : " + AboutUsID.getText());
        WebElement AboutUsClassName = driver.findElement(By.className("green"));
        System.out.println("Element Text is : " + AboutUsClassName.getText());
        WebElement AboutUsLinkText = driver.findElement(By.linkText("About Us"));
        System.out.println("Element Text is : " + AboutUsLinkText.getText());
        WebElement AboutUsCSSSelector = driver.findElement(By.cssSelector(".green"));
        System.out.println("Element Text is : " + AboutUsCSSSelector.getText());

        driver.close();

    }
}
