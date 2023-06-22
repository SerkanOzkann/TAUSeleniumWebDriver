package exercise;

import base.BaseTests1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExerciseChapter4 extends BaseTests1 {

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgotPassword();
        var emailSentPage = forgetPasswordPage.retrievePassword("tau@example.com");
        assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
