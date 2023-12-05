package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {

        WebElement registerText = driver.findElement(By.xpath("//div[@id='loginPanel']/p[2]/a[1]"));
        registerText.click();

        String actualText = driver.findElement(By.xpath("//div[@id='rightPanel']/h1")).getText();
        String expectedText = "Signing up is easy!";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyUserShouldRegisterAccountSuccessfully() {

        WebElement registerText = driver.findElement(By.xpath("//div[@id='loginPanel']/p[2]/a[1]"));
        registerText.click();

        WebElement firstName = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input"));
        firstName.sendKeys("raj");

        WebElement lastName = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input"));
        lastName.sendKeys("Patdfhddfhel");

        WebElement address = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[3]/td[2]/input"));
        address.sendKeys("Stan Stat");

        WebElement city = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[4]/td[2]/input"));
        city.sendKeys("London");

        WebElement state = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[5]/td[2]/input"));
        state.sendKeys("Middlesex");

        WebElement zipCode = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[6]/td[2]/input"));
        zipCode.sendKeys("HA7 4PD");

        WebElement phone = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[7]/td[2]/input"));
        phone.sendKeys("0123456789");

        WebElement ssn = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[8]/td[2]/input"));
        ssn.sendKeys("223344");

        WebElement userName = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[10]/td[2]/input"));
        userName.sendKeys("sdgsgsditzcodebuster10000");

        WebElement password = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[11]/td[2]/input"));
        password.sendKeys("Codebuster@1234");

        WebElement confirmPassword = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[12]/td[2]/input"));
        confirmPassword.sendKeys("Codebuster@1234");

        WebElement registerButton = driver.findElement(By.xpath("//div[@id='rightPanel']/form[1]/table[1]/tbody[1]/tr[13]/td[2]/input"));
        registerButton.click();

        String actualText = driver.findElement(By.xpath("//div[@id='rightPanel']/p[1]")).getText();
        String expectedText = "If you have an account with us you can sign-up for free instant online access. You will have to provide some personal information.";
        Assert.assertEquals(actualText, expectedText);

    }

    @After
    public void endTest() {
         closeBrowser();
    }
}
