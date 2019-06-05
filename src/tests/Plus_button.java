package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Plus_button extends login{
    String URLmishp = "http://mishpahug.co.il/";

    @Test
    public void plusButtonGuestAndFamily() throws InterruptedException {
        driver.findElement(By.id("profile")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"idbtneditprofile\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@id='typeuser3inprofile']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='idbtnsaveprofile']")).click();

        driver.navigate().to(URLmishp);

        Thread.sleep(5000);
        Boolean plusButton = driver.findElement(By.cssSelector("#idbtnaddevent")).isDisplayed();

        Assert.assertTrue(plusButton);

    }
    @Test
    public void plusButtonGuest() throws InterruptedException {
        driver.navigate().to(URLmishp);
        Thread.sleep(5000);
        driver.findElement(By.id("profile")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"idbtneditprofile\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//label[@id='typeuser1inprofile']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='idbtnsaveprofile']")).click();
        Thread.sleep(8000);
        driver.navigate().to(URLmishp);
        Thread.sleep(5000);
        Boolean plusButton = driver.findElement(By.cssSelector("#idbtnaddevent")).isDisplayed();

        Assert.assertFalse(plusButton);
    }
    @Test

    public void plusButtonFamily() throws InterruptedException {
        driver.navigate().to(URLmishp);
        Thread.sleep(5000);
        driver.findElement(By.id("profile")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"idbtneditprofile\"]")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//label[@id='typeuser2inprofile']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='idbtnsaveprofile']")).click();
        Thread.sleep(8000);
        driver.navigate().to(URLmishp);
        Thread.sleep(5000);

        Boolean plusButton = driver.findElement(By.cssSelector("#idbtnaddevent")).isDisplayed();
        Assert.assertTrue(plusButton);
    }



}
