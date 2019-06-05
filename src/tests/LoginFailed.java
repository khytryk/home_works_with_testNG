package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFailed extends Base{
    String login = "elbarto";
    String password = "sdfgxf3254634";
    @BeforeMethod
    public void login() throws InterruptedException {
        driver.findElement(By.id("idsignin")).click();
        WebElement loginField = driver.findElement(By.id("logininput"));
        loginField.click();

        loginField.sendKeys(login);
        WebElement passwordField = driver.findElement(By.id("passwordinput"));
        passwordField.click();
        passwordField.sendKeys(password);
        WebElement signInButton = driver.findElement(By.id("signinrequest"));
        signInButton.click();
        Thread.sleep(2000);
    }
@Test
    public void failedlogin() throws InterruptedException {

        if(driver.findElement(By.id("profile")).isDisplayed()) {
        System.out.println("You login in this site, something went wrong...");
        System.out.println("Step 1");

    }else{
        String logError = driver.findElement(By.id("wrongloginorpassword")).getText();
        System.out.println("Fail authorization , message error :\n " + logError);

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"closedsignin\"]")).click();

        Boolean profileButt  =
                driver.findElement(By.id("profile")).getAttribute("title").contains(login);
        System.out.println(driver.findElement(By.id("profile")).getText());

        Boolean familyButt = driver.findElement(By.id("family")).isDisplayed();


//        if(profileButt != true && familyButt != true){
//            System.out.println("Test is complete, you not login on this site");
//        }else{
//            System.out.println("You login in this site, something went wrong...");
//        }
            Assert.assertFalse(profileButt && familyButt);

    }

}

}
