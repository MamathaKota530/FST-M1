package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        System.out.println("Title of the page is : "+ driver.getTitle());
        WebElement thirdHeader = driver.findElement(By.xpath("//h3[@id = 'third-header']"));
        WebElement fifthHeader = driver.findElement(By.xpath("//h5[contains(@class, 'green')]"));
        System.out.println("color of the fifth header " + fifthHeader.getCssValue("color"));
        System.out.println("Third header text is: " + thirdHeader.getText());

        WebElement violetButton = driver.findElement(By.xpath("//button[contains(@class, 'violet')]"));
        System.out.println("Violet button's classes are: " + violetButton.getAttribute("class"));

        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("The grey button's text is: " + greyButton);
        driver.close();
    }
}
