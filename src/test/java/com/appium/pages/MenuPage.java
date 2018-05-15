package com.appium.pages;

import com.appium.page.objects.MenuPageObjects;
import com.appium.page.objects.ToolbarPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(MenuPage.class);
    MenuPageObjects menuPageObjects = new MenuPageObjects();

    public MenuPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), menuPageObjects);
        waitForElementToLoad(menuPageObjects.NavView);
    }

    public LoginPage clickloginButton(){
        logger.info("Menu click Login Button");
        menuPageObjects.BtnLogin.click();
        return new LoginPage(driver);
    }



}
