package javascript;

import base.BaseTests1;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests1 {
    @Test
    public void testScroolToTable(){
     homePage.clickLargeDeepDom().scroolToTable();
    }
    @Test
    public void scrollToParagraph(){
        homePage.clickInfiniteScroll().scroolToParagraph(5);
    }

}
