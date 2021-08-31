package com.demo.ui.factory;

import com.demo.util.CommonUtilities;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import net.lightbody.bmp.BrowserMobProxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {
//    public static final String USER_DIR = "user.dir";
//    public static final String DOWNLOADED_FILES_FOLDER = System.getProperty("") + System.getProperty("") + "downloadfiles";
        static BrowserMobProxy proxy;
        public static BrowserMobProxy getProxy(){return proxy;}

    public static WebDriver getBrowser(String browserName) throws MalformedURLException {
//        WebDriver driver = null;
        IOSDriver driver = null;
        String rwdDevice = System.getProperty(CommonUtilities.RWDDEVICE);

        if(browserName.equalsIgnoreCase("safari")){
            if(driver == null){
//                driver = new SafariDriver();
                driver.manage().window().maximize();
            }
        }
        if(browserName.equalsIgnoreCase("ios-safari")){
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("platformName", "iOS");
            cap.setCapability("platformVersion", "14.5");
            cap.setCapability("deviceName", "iPhone 12 Pro");
            cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
//            cap.setCapability("app", “location of .app or .ipa file“);
//0F48FE29-5F3D-4F67-9E2F-FF4D8A51D7BF
            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new IOSDriver(url, cap);
        }
        if(browserName.equalsIgnoreCase("ios-app")){
            DesiredCapabilities cap = new DesiredCapabilities();

            cap.setCapability("platformName", "iOS");
            cap.setCapability("platformVersion", "14.5");
            cap.setCapability("deviceName", "iPhone 8");
//            cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
            cap.setCapability(MobileCapabilityType.UDID, "99142954-B467-4336-BB03-7DDB296EABA4");
            cap.setCapability(MobileCapabilityType.APP, "/Users/nareshkumaraadike/Library/Developer/Xcode/DerivedData/WebDriverAgent-ciegwgvxzxdrqthilmrmczmqvrgu/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
//0F48FE29-5F3D-4F67-9E2F-FF4D8A51D7BF
            cap.setCapability("bundleId","com.facebook.IntegrationApp");
            cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
            cap.setCapability("xfullReset", true);
            cap.setCapability("clearSystemFiles", true);
            URL url = new URL("http://127.0.0.1:4723/wd/hub");

            driver = new IOSDriver(url, cap);
            System.out.println("IOS-APP initiated: ");
        }
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            return driver;
    }

}

//com.facebook.IntegrationApp
