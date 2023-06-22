package keys;

import base.BaseTests1;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests1 {

    @Test
    public void testBackspace(){
        var keyPage = homePage.ClickKeyPresses();
        keyPage.enterText("A"+ Keys.BACK_SPACE );
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");
    }
}
