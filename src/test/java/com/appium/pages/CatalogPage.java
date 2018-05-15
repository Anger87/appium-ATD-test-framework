package com.appium.pages;

import com.appium.page.objects.CatalogPageObjects;
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

    public MyVehiclesPage clickSpinnerCarTop() {
        catalogPageObjects.SpinnerCarTop.click();
        return new MyVehiclesPage(driver);
    }

    public VehiclesPage clickAddCarButton() {
        logger.info("CatalogPpage wait bunner to disapear");
        waitForElementToDisAppear("de.autodoc.gmbh:id/ivBanner");

        logger.info("CatalogPpage click AddCar button");
        catalogPageObjects.AddCar.click();
        return new VehiclesPage(driver);
    }

    public String getCarTitleText() {
        logger.info("CatalogPpage get Car Title text");
        return catalogPageObjects.CarTitle.getText();
    }

    public String getCarSerieasText() {
        logger.info("CatalogPpage get Car Series text");
        return catalogPageObjects.CarSeries.getText();
    }
}
