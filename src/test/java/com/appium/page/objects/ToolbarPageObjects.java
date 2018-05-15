package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ToolbarPageObjects {

    @AndroidFindBy(accessibility = "Open navigation drawer")
    public MobileElement Menu;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/action_search")
    public MobileElement Search;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/action_cart")
    public MobileElement Cart;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/action_edit")
    public MobileElement Edit;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/action_save")
    public MobileElement Save;

}
