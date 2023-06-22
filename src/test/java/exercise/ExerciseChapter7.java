package exercise;

import base.BaseTests1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExerciseChapter7 extends BaseTests1 {

    @Test
    public void testRightClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();
        String message = contextMenuPage.getPopUpText();
        contextMenuPage.acceptPopup();
        assertEquals(message, "You selected a context menu", "not selected menu");
    }
}
