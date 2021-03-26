package appium.activities.calendario;

import appium.control.Button;
import appium.control.TextBox;
import org.openqa.selenium.By;

public class EventPage {

    public TextBox title = new TextBox(By.id("com.simplemobiletools.calendar:id/event_title"));
    public TextBox location = new TextBox(By.id("com.simplemobiletools.calendar:id/event_location"));
    public TextBox description = new TextBox(By.id("com.simplemobiletools.calendar:id/event_description"));
    public Button saveButton = new Button(By.id("com.simplemobiletools.calendar:id/save"));
}
