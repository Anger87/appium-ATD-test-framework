package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPageObjects {

    @AndroidFindBy(id = "de.autodoc.gmbh:id/llContent")
    public MobileElement Content;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/etEmail")
    public MobileElement Email;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/btnNext")
    public MobileElement BtnNext;

    @AndroidFindBy(id = "de.autodoc.gmbh:id/tilPassword")
    public MobileElement Password;


    @AndroidFindBy(id = "de.autodoc.gmbh:id/btnLogin")
    public MobileElement Btnlogin;
}
