package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CatalogPageObjects {

    @AndroidFindBy(id = "de.autodoc.gmbh:id/rvCategories")
    public MobileElement Categories;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/spinner_car_top")
    public MobileElement SpinnerCarTop;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/fabAddCar")
    public MobileElement AddCar;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/carTitleLineOne")
    public MobileElement CarTitle;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/carTitleLineTwo")
    public MobileElement CarSeries;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/ivBanner")
    public MobileElement Banner;
}
