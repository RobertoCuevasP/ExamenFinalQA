package appium.devices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Android implements IDevices {

    private AppiumDriver driver;

    @Override
    public AppiumDriver crear() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Mi A2 Lite");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.simplemobiletools.calendar");
        capabilities.setCapability("appActivity", ".activities.MainActivity");
        capabilities.setCapability("´platformName", "Android");

        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
        // implicit waits
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
