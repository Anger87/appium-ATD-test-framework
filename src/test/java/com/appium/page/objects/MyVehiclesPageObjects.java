package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyVehiclesPageObjects {

    @AndroidFindBy(id = "de.autodoc.gmbh:id/fab")
    public MobileElement Add;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/listCar")
    public MobileElement ListCar;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/btnEdit")
    public MobileElement Edit;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/btnDelete")
    public MobileElement Delete;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/tvTitle")
    public MobileElement Title;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/tvDesc")
    public MobileElement Description;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/TextView01")
    public MobileElement TextMessage;


}
