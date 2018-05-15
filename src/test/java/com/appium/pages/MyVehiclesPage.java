package com.appium.pages;

import com.appium.page.objects.MyVehiclesPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class MyVehiclesPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(MyVehiclesPage.class);
    MyVehiclesPageObjects myVehiclesPageObjects = new MyVehiclesPageObjects();

    public MyVehiclesPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), myVehiclesPageObjects);
        waitForElementToLoad(myVehiclesPageObjects.ListCar);
    }

    public String getTitleText(){
        logger.info("MyVehiclesPage get Title text");
        return myVehiclesPageObjects.Title.getText();
    }

    public String getDescriptionText(){
        logger.info("MyVehiclesPage get Description text");
        return myVehiclesPageObjects.Description.getText();
    }

    public void clickDeleteCarButton(){
        logger.info("MyVehiclesPage click Delete Button");
        myVehiclesPageObjects.Delete.click();
    }

    public void clickEditCarButton(){
        logger.info("MyVehiclesPage click Edit Button");
        myVehiclesPageObjects.Edit.click();
    }

    public String getTextMessage(){
        logger.info("MyVehiclesPage get message that car was deleted");
        return myVehiclesPageObjects.TextMessage.getText();
    }

}
