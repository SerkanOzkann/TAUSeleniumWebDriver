package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    private By decreaseIndentButton = By.cssSelector("div:nth-of-type(5) > button[title='Increase indent']");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToEditEditor() {
        driver.switchTo().frame(editorIframeId);

    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void cleanTextArea() {
        switchToEditEditor();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditEditor();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextFromEditor() {
        switchToEditEditor();
       String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }


    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }

}
