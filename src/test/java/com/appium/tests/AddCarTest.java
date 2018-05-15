package com.appium.tests;

import com.appium.pages.CatalogPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddCarTest extends BaseTest {

    @Test
    public void LoginAddDeleteCar() {
        softAssert = new SoftAssert();
        toolbar = landingPage.clickAustria();
        menuPage = toolbar.clickMenu();
        loginPage = menuPage.clickloginButton();
        catalogPage = loginPage.logIn(userCredentials.getUserName(), userCredentials.getPassWord());

        vehiclesPage = catalogPage.clickAddCarButton();
        vehiclesPage.clickCarMaker();
        logger.info("Select Car mark");
        vehiclesPage.clickByText("BMW");
        logger.info("Select Car Series");
        vehiclesPage.clickByText("02 Convertible (E10) (12.1967 - 10.1975)");
        logger.info("Select Petrol");
        vehiclesPage.clickByText("2002 (74 KW / 100 PS) (05.1971 - 07.1975)");
        catalogPage = vehiclesPage.clickOnAddToMyVehiclesButton();

        logger.info("CatalogPage check car title and description");
        softAssert.assertEquals(catalogPage.getCarTitleText(), "BMW 02 Convertible (E10) (12.1967 - 10.1975)", "CatalogPage Check Car title");
        softAssert.assertEquals(catalogPage.getCarSerieasText(), "2002 (74 KW / 100 PS) (05.1971 - 07.1975)", "CatalogPage Check Car Series");
        myVehiclesPage = catalogPage.clickSpinnerCarTop();

        logger.info("MyVehiclePage check car title and description");
        softAssert.assertEquals(myVehiclesPage.getTitleText(), "BMW 02 Convertible (E10) (12.1967 - 10.1975)", "MyVehiclePage Check Car title");
        softAssert.assertEquals(myVehiclesPage.getDescriptionText(), "2002 (74 KW / 100 PS) (05.1971 - 07.1975)", "MyVehiclePage Check Car Series");
        toolbar.clickEditButton();
        myVehiclesPage.clickDeleteCarButton();

        logger.info("MyVehiclePage check car was deleted");
        softAssert.assertEquals(myVehiclesPage.getTextMessage(), "There is no vehicle in your garage", "MyVehiclePage check car was deleted test shown");

        softAssert.assertAll();
    }

    @Test
    public void AddEditDeleteCar() {
        softAssert = new SoftAssert();
        toolbar = landingPage.clickAustria();
        catalogPage = new CatalogPage(driver);
        vehiclesPage = catalogPage.clickAddCarButton();
        vehiclesPage.clickCarMaker();
        logger.info("Select Car mark");
        vehiclesPage.clickByText("BMW");
        logger.info("Select Car Series");
        vehiclesPage.clickByText("02 Convertible (E10) (12.1967 - 10.1975)");
        logger.info("Select Petrol");
        vehiclesPage.clickByText("2002 (74 KW / 100 PS) (05.1971 - 07.1975)");
        catalogPage = vehiclesPage.clickOnAddToMyVehiclesButton();
        myVehiclesPage = catalogPage.clickSpinnerCarTop();
        toolbar.clickEditButton();
        myVehiclesPage.clickEditCarButton();
        vehiclesPage.clickCarmodel();

        logger.info("VehiclesPage change car model");
        vehiclesPage.clickByText("1 Hatchback (E87) (02.2003 - 01.2013)");
        logger.info("VehiclesPage change car petrol");
        vehiclesPage.clickByText("116d 2.0 (85 KW / 116 PS) (12.2008 - 09.2012)");
        myVehiclesPage=vehiclesPage.clickSaveCarButton();

        logger.info("MyVehiclePage check that car title and description were changed");
        softAssert.assertEquals(myVehiclesPage.getTitleText(), "BMW 1 Hatchback (E87) (02.2003 - 01.2013)", "MyVehiclePage Check that Car title changed");
        softAssert.assertEquals(myVehiclesPage.getDescriptionText(), "116d 2.0 (85 KW / 116 PS) (12.2008 - 09.2012)", "MyVehiclePage Check that Car Series changed");
        toolbar.clickEditButton();
        myVehiclesPage.clickDeleteCarButton();

        softAssert.assertAll();

    }
}
