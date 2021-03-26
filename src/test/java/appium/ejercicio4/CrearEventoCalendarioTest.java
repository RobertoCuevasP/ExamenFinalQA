package appium.ejercicio4;

import appium.activities.calendario.DailyViewMainPage;
import appium.activities.calendario.EventPage;
import appium.activities.calendario.MainPage;
import appium.sesion.Session;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

public class CrearEventoCalendarioTest {
    MainPage mainPage = new MainPage();
    EventPage eventPage = new EventPage();
    DailyViewMainPage dailyViewMainPage;

    @Test
    public void createTaskTest() throws MalformedURLException {
        String title = "New Event";
        String location = "Universidad Privada Boliviana";
        String description = "This is a test";

        mainPage.addNewEvent.click();
        eventPage.title.set(title);
        eventPage.location.set(location);
        eventPage.description.set(description);
        eventPage.saveButton.click();

        mainPage.chageView.click();
        mainPage.viewButton.click();

        dailyViewMainPage = new DailyViewMainPage(title);

        Assert.assertTrue("ERROR !! El evento no fue creado", dailyViewMainPage.nameEvent.isControlDisplayed());
    }

    @After
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
