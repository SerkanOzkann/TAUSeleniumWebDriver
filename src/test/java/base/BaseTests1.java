package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class BaseTests1 {

    private WebDriver driver;
    protected HomePage homePage;

@BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
       //  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);  30 sanıye bekler.
        homePage = new HomePage(driver);



    }
@AfterClass

public void tearDown(){
    driver.quit();
}
}
