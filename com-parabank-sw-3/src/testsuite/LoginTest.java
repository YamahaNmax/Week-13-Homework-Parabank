package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        WebElement userName = driver.findElement(By.xpath("//div[@id='leftPanel']/div[1]/form[1]/div[1]/input[1]"));
        userName.sendKeys("m4mitzcodebuster100");

        WebElement password = driver.findElement(By.xpath("//div[@id='leftPanel']/div[1]/form[1]/div[2]/input[1]"));
        password.sendKeys("Codebuster@1234");

        WebElement loginButton = driver.findElement(By.xpath("//div[@id='leftPanel']/div[1]/form[1]/div[3]/input[1]"));
        loginButton.click();

//        String actualText = driver.findElement(By.xpath("")).getText();
//        String expectedText = "";
//        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyTheErrorMessage() {

        WebElement userName = driver.findElement(By.xpath("//div[@id='leftPanel']/div[1]/form[1]/div[1]/input[1]"));
        userName.sendKeys("qwerty");

        WebElement password = driver.findElement(By.xpath("//div[@id='leftPanel']/div[1]/form[1]/div[2]/input[1]"));
        password.sendKeys("Codebuster@1234");

        WebElement loginButton = driver.findElement(By.xpath("//div[@id='leftPanel']/div[1]/form[1]/div[3]/input[1]"));
        loginButton.click();

        String actualText = driver.findElement(By.xpath("//div[@id='rightPanel']/p[1]")).getText();
        String expectedText = "An internal error has occurred and has been logged.";
        Assert.assertEquals(actualText, expectedText);
    }

    @After
    public void endTest() {
        closeBrowser();
    }
}
