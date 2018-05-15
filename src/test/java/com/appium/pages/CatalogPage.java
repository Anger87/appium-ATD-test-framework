package com.appium.pages;

import com.appium.page.objects.CatalogPageObjects;
import com.appium.page.objects.ToolbarPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(CatalogPage.class);
    CatalogPageObjects catalogPageObjects = new CatalogPageObjects();

    public CatalogPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), catalogPageObjects);
        waitForElementToLoad(catalogPageObjects.Categories);
    }





}
