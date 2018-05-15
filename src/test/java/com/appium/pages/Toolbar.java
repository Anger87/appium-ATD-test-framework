package com.appium.pages;

import com.appium.page.objects.ToolbarPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class Toolbar extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(Toolbar.class);
    ToolbarPageObjects toolbarPageObjects = new ToolbarPageObjects();

    public Toolbar(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), toolbarPageObjects);
        waitForElementToLoad(toolbarPageObjects.Menu);
    }

    public MenuPage clickMenu(){
        logger.info("Toolbar click Menu Button");
        toolbarPageObjects.Menu.click();
        return new MenuPage(driver);
    }



}
