package exercise;

import base.BaseTests1;
import org.testng.annotations.Test;

import java.security.PublicKey;

import static org.testng.Assert.assertEquals;

public class ExerciseChapter8 extends BaseTests1 {

    @Test
    public void testFrameText(){
        var nestedFramesPage= homePage.clickFrames().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }
}
