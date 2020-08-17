package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ConfigReader;

public class Login {

    @FindBy(how = How.NAME, using = "txtUserId")
    private static WebElement txtUserName;

    @FindBy(how = How.NAME, using = "txtPassword")
    private WebElement txtPassword;

    @FindBy(how = How.NAME, using = "txtOrganization")
    private WebElement txtOrganization;

    @FindBy(how = How.NAME, using = "btnLogin")
    private WebElement btnLogin;

    public static void Loginpage(WebDriver driver) {
        driver.get(ConfigReader.getProperty("url"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.name("txtUserId"),0));
    }
    public static void LaunchApplication(WebDriver driver){
        driver.get(ConfigReader.getProperty("url"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@id='selDetails']/option"),0));

    }
}