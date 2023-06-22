package wait;

import base.BaseTests1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests1 {
@Test
    public void testWaitUntilHidden(){
    var loadingPage = homePage.clickDynamicLoading().clickExample1();
    loadingPage.clickStart();
    assertEquals(loadingPage.getLoadedText(), "Hello World!", "test not Correct");

}

@Test
    public void testWaitUntilHidden2(){
    var loadingPage2 = homePage.clickDynamicLoading().clickExample2();
    loadingPage2.clickStart();
    assertEquals(loadingPage2.getLoadedText(), "Hello World!", "test not Correct");
}

}
