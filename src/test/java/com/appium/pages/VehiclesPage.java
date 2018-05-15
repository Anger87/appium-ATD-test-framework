package com.appium.pages;

import com.appium.page.objects.VehiclesPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(VehiclesPage.class);
    VehiclesPageObjects vehiclesPageObjects = new VehiclesPageObjects();

    public VehiclesPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), vehiclesPageObjects);
        waitForElementToLoad(vehiclesPageObjects.CarMenu);
    }

    public void clickByText(String text) {
        logger.info("AddToMyViclesPage click on specific text: " + text);
        driver.findElementByXPath("//android.widget.TextView[@text='" + text + "']").click();
    }

    public void clickCarMaker() {
        logger.info("VehiclesPage click on Car maker row");
        vehiclesPageObjects.CarMaker.click();
    }

    public void clickCarmodel(){
        logger.info("VehiclesPage click on Car model row");
        vehiclesPageObjects.Model.click();
    }

    public CatalogPage clickOnAddToMyVehiclesButton() {
        logger.info("VehiclesPage click on AddToMyVehicles Button");
        vehiclesPageObjects.AddToMyVehicles.click();
        return new CatalogPage(driver);
    }

    public MyVehiclesPage clickSaveCarButton() {
        logger.info("VehiclesPage click on AddToMyVehicles Button");
        vehiclesPageObjects.SaveCar.click();
        return new MyVehiclesPage(driver);
    }
}
