package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class VehiclesPageObjects {

    @AndroidFindBy(id = "de.autodoc.gmbh:id/lvCarMenu")
    public MobileElement CarMenu;

    @AndroidFindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[1]")
    public MobileElement CarMaker;

    @AndroidFindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[2]")
    public MobileElement Model;

    @AndroidFindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[3]")
    public MobileElement Modification;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/tsbAddCarBySelector")
    public MobileElement AddToMyVehicles;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/tsbSaveCar")
    public MobileElement SaveCar;

}
