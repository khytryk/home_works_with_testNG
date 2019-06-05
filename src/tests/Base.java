package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
        WebDriver driver;
        @BeforeMethod
        public void StartApp() throws InterruptedException {System.out.println("Instalation verification");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");
            driver = new FirefoxDriver(capabilities);
            WebDriverWait wait = new WebDriverWait(driver, 15);
            driver.manage().window().maximize();
            driver.get("http://mishpahug.co.il/");
            driver.findElement(By.id("closedIntro")).click();

            Thread.sleep(2000);
        }
        @AfterMethod
        public void tearDown(){
            driver.quit();
        }

    }


