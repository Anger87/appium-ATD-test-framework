package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.page.objects.CommentPageObjects;
import com.appium.page.objects.LandingPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends CommonAppiumTest {

    LandingPageObjects landingPageObjects = new LandingPageObjects();

    public LandingPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), landingPageObjects);
        waitForPageToLoad(landingPageObjects.Indicator);
    }

//    TODO - add logging
    public void clickIndicator() {
        int X = landingPageObjects.Indicator.getLocation().getX() + landingPageObjects.Indicator.getSize().getWidth()*3/4;
        int Y = landingPageObjects.Indicator.getLocation().getY();
        TouchAction t1 = new TouchAction(driver);
        t1.tap(X,Y);
        driver.performTouchAction(t1);
    }



}
