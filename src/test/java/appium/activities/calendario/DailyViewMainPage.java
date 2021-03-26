package appium.activities.calendario;

import appium.control.Label;
import org.openqa.selenium.By;

public class DailyViewMainPage {
    public Label nameEvent;

    public DailyViewMainPage(String name){
        nameEvent = new Label(By.xpath("//android.widget.TextView[@text='" + name + "']"));
    }
}
