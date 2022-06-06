package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class SeleniumSteps {

    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("^User is on LMS Home Page$")
    public void userIsOnGooglePage() throws Throwable {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        driver.get("https://alchemy.hguy.co/lms");
    }

    @And("^close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }

    @Then("^Verify the title of the LMS website$")
    public void verifyTitle() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("primary-menu")));

        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        Assert.assertEquals(pageTitle, "Alchemy LMS – An LMS Application");
    }

    @Then("^Verify the Heading of the LMS website$")
    public void verifyHeading() {
        WebElement heading = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(@class,'title')]"))));

        System.out.println("Page heading is: " + heading.getText());
        Assert.assertEquals(heading.getText(), "Learn from Industry Experts");
    }

    @Then("^Verify the title of the first info box in LMS website$")
    public void verifyfirstInfoBoxTitle() {
        WebElement title = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()=' Actionable Training ']"))));

        System.out.println("First infor box title is: " + title.getText());
        Assert.assertEquals(title.getText(), "Actionable Training");
    }

    @Then("^Verify the title of the second most popular course$")
    public void verifyTitleOfMostPopularCourse() {
        WebElement title = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()='Email Marketing Strategies']"))));

        System.out.println("First infor box title is: " + title.getText());
        Assert.assertEquals(title.getText(), "Email Marketing Strategies");
    }

    @And("^Click on My Account menu item$")
    public void clickMyAccountMenu() {
        WebElement MyAccountMenu = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='My Account']"))));
        MyAccountMenu.click();
    }

    @Then("^verify that user is on the “My Account” page on the site$")
    public void verifythatuserisontheMyAccountpage() {
        WebElement myAccountPage = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'My Account')]"))));
        String title = driver.getTitle();
        System.out.println("First infor box title is: " + title);
        Assert.assertEquals(title, "My Account – Alchemy LMS");
        Assert.assertTrue(myAccountPage.isDisplayed());
    }

    @When("^Enter the \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("user_login")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("user_pass")).sendKeys(password);
        //Click Login
        driver.findElement(By.id("wp-submit")).click();
    }

    @And("^Click on Login Button$")
    public void clickOnLoginButton() {
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Login']"))));
        loginButton.click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user_login"))));
    }

    @And("^Verify user is on login page$")
    public void clickOnSubmitButton() {
        WebElement logoutButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Logout']"))));
        Assert.assertTrue(logoutButton.isDisplayed());
    }

    @And("^Click on All courses menu item$")
    public void clickOnAllCourses() {
        WebElement allCoursesButton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='All Courses']"))));
        allCoursesButton.click();
        String title = driver.getTitle();
        System.out.println("All courses page title is: " + title);
        Assert.assertEquals(title, "All Courses – Alchemy LMS");
    }

    @And("^print the number of courses in the page$")
    public void printNoofOCourses() {
        List<WebElement> courses = driver.findElements(By.xpath("//h3[@class='entry-title']"));

        System.out.println("No.of courses in the page are : " + courses.size());
    }

    @And("^Click on Contact menu item$")
    public void clickOnContactMenu() {
        WebElement contactMenu = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Contact']"))));
        contactMenu.click();
        String title = driver.getTitle();
        System.out.println("Contact page title is: " + title);
        Assert.assertEquals(title, "Contact – Alchemy LMS");
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//label[contains(text(),'Full Name')]/following-sibling::input"))));
    }

    @And("^Fill the contact form fields \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
    public void fillContactFormFields(String fullName, String email, String subject, String message) {
        WebElement fullNameTextbox = driver.findElement(By.xpath("//label[contains(text(),'Full Name')]/following-sibling::input"));
        WebElement emailTextbox = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement subjectTextbox = driver.findElement(By.xpath("//label[contains(text(),'Subject')]/following-sibling::input"));
        WebElement messageTextbox = driver.findElement(By.xpath("//label[contains(text(),'Comment')]/following-sibling::textarea"));
        WebElement sendMessageButton = driver.findElement(By.xpath("//button[@type='submit']"));
        fullNameTextbox.sendKeys(fullName);
        emailTextbox.sendKeys(email);
        subjectTextbox.sendKeys(subject);
        messageTextbox.sendKeys(message);
        sendMessageButton.click();
    }

    @And("^print the message displayed after submission$")
    public void printMessage() {
        WebElement message = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(@id,'confirmation')]"))));

        System.out.println("Submission message is : " + message.getText());
    }

    @Then("^select any course and complete it$")
    public void completeAnyCourse() throws InterruptedException {
        WebElement seeMorebutton = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[text()='Social Media Marketing']//following-sibling::p[@class='ld_course_grid_button']/a"))));
        seeMorebutton.click();

        WebElement lesson = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(),'Developing Strategy')]"))));

        String title = driver.getTitle();
        System.out.println("Course title is: " + title);
        Assert.assertEquals(title, "Social Media Marketing – Alchemy LMS");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", lesson);
        executor.executeScript("arguments[0].click();", lesson);
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='ld-lesson-topic-list']"))));

        String title1 = driver.getTitle();
        System.out.println("lesson title is: " + title1);
        Assert.assertEquals(title1, "Developing Strategy – Alchemy LMS");

        //Mark complete button is not available

    }
}
