package alerts;

import base.BaseTests1;
import org.testng.annotations.Test;

import java.security.PublicKey;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests1 {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJsAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        alertsPage.getResult();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Result incorrect");

    }
    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJsAlerts();
        alertsPage.triggerConfirm();
        String text= alertsPage.alert_getText();
        alertsPage.dismissAlert();
        assertEquals(text,"I am a JS Confirm", " not confirm");

    }
    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJsAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU rocks!";
        alertsPage.alert_setInput(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(),"You entered: "+  text, "Result not correct");
    }
}
