package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class login extends Base{
    @BeforeMethod
    public void logIn() throws InterruptedException {
        String login = "elbarto";
        String password = "1234567890qwerty";
        Thread.sleep(5000);
        driver.findElement(By.id("idsignin")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("logininput")).sendKeys(login);
        driver.findElement(By.id("passwordinput")).sendKeys(password);
        driver.findElement(By.id("signinrequest")).click();
        Thread.sleep(5000);
    }

}
