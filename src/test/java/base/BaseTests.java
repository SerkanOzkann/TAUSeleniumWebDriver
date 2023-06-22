package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe"); //setProperty özelliği ile  driver tanıtımı yapılır.

        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/"); // get komutu ile gidilmesi gereken url adresi tanıtılır.

        System.out.println(driver.getTitle());

        driver.manage().window().maximize(); // manage.window.maximize komutu ile  açılan ekran Full Size yapılır.

        List<WebElement> inputList = driver.findElements(By.tagName("a")); // tagname komutu ile  tagı a olanlar bir listeye atılır. ve size yani toplam adet alınarak yazdırılır.
        System.out.println(inputList.size());

      WebElement inputLink=  driver.findElement(By.linkText("Inputs")); // linktext özelliği ile ahref adı ınputs olan seçilir. ve click komutu ile tıklatılır.
      inputLink.click();


     //   driver.quit();  // quit veya close komutu ile  ekran kapatılır.
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS) 30 sanıye bekler wait
    }
    public static void main(String args[]){
        BaseTests test = new BaseTests();
        test.setUp();
    }


}
