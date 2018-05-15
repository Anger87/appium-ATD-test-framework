package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.List;

public class LandingPageObjects {

    @AndroidFindBy(id = "de.autodoc.gmbh:id/rvCountriesList")
    public MobileElement CountriesList;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/textView1")
    public MobileElement CountryText;

}
