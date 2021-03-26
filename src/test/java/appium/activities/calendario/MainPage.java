package appium.activities.calendario;

import appium.control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button addNewEvent = new Button(By.id("com.simplemobiletools.calendar:id/calendar_fab"));

    public Button chageView = new Button(By.id("com.simplemobiletools.calendar:id/change_view"));
    public Button viewButton = new Button(By.xpath("//android.widget.RadioButton[@text='Daily view']"));
}
