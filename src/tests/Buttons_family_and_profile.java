package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Buttons_family_and_profile extends login{
    @Test
    public void buttons() throws InterruptedException {
        driver.findElement(By.id("profile")).click();
        Thread.sleep(5000);

        String familyProfile = driver.findElement(By.id("fieldobjfamilyName")).getText();
        String nameProfile = driver.findElement(By.xpath("//div[@id='nameuserinprofile']")).getText();
        String confessionProfile = driver.findElement(By.cssSelector("#fieldobjconfession")).getText();
        String languagesProfile = driver.findElement(By.xpath("//span[@id='fieldobjlanguages']")).getText();
        String foodPrefProfile = driver.findElement(By.xpath("//span[@id='fieldobjfoodPreferences']")).getText();
        String emailProfile = driver.findElement(By.cssSelector("#fieldobjelMail")).getText();
        String phoneNumProfile = driver.findElement(By.xpath("//*[@id=\"fieldobjphoneNumber\"]")).getText();


        driver.navigate().back();
        Thread.sleep(5000);
        driver.findElement(By.id("family")).click();
        Thread.sleep(10000);


        String familyFamily = driver.findElement(By.xpath("//*[@id=\"titleprofile\"]")).getText();
        String nameFamily = driver.findElement(By.cssSelector("#idnameuserinfamily")).getText();
        String confessionFamily = driver.findElement(By.xpath("//*[@id=\"fieldobjconfession\"]")).getText();
        String languagesFamily = driver.findElement(By.xpath("//*[@id=\"fieldobjlanguages\"]")).getText();
        String foodPrefFamily = driver.findElement(By.xpath("//*[@id=\"fieldobjfoodPreferences\"]")).getText();
        String emailFamily = driver.findElement(By.xpath("//*[@id=\"fieldobjelMail\"]")).getText();
        String phoneNumFamily= driver.findElement(By.xpath("//*[@id=\"fieldobjphoneNumber\"]")).getText();

        String familyFamilyStr = familyFamily.substring(11);


            Assert.assertEquals(familyFamilyStr,familyProfile);
            Assert.assertEquals(nameProfile,nameFamily);
            Assert.assertEquals(confessionProfile,confessionFamily);
            Assert.assertEquals(languagesProfile,languagesFamily);
            Assert.assertEquals(foodPrefProfile,foodPrefFamily);
            Assert.assertEquals(emailProfile,emailFamily);
            Assert.assertEquals(phoneNumProfile,phoneNumFamily);

    }
}
