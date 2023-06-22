package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ExerciseChapter3 {
    private WebDriver driver;
    public void exercise(){

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

       WebElement linkTest = driver.findElement(By.linkText("Shifting Content"));
        linkTest.click();

        WebElement linkTest1 = driver.findElement(By.linkText("Example 1: Menu Element"));
        linkTest1.click();

       List<WebElement> tagList = driver.findElements(By.tagName("li"));
        System.out.println(tagList.size());

    }
    public  static void main(String args[]){

        ExerciseChapter3 test = new ExerciseChapter3();
        test.exercise();
    }
}
