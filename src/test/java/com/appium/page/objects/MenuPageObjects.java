package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuPageObjects {

    @AndroidFindBy(id = "de.autodoc.gmbh:id/nav_view")
    public MobileElement NavView;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/btnLogin")
    public MobileElement BtnLogin;




}
