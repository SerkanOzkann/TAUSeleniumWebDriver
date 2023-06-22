package exercise;

import base.BaseTests1;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExerciseChapter6 extends BaseTests1 {

    @Test
    public void testSliderToWholeNumber(){
        String value="4";
        var sliderPage = homePage.ClickHorizontalSlider();
        sliderPage.setSliderValue(value);
        //assertEquals(sliderPage.getSliderValue(), "Slider value is incorrect ");
    }
}
