package com.appium.pages;

import com.appium.page.objects.LoginPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAppiumMethods {
    public Logger logger = Logger.getLogger(LoginPage.class);
    LoginPageObjects loginPageObjects = new LoginPageObjects();

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
        waitForElementToLoad(loginPageObjects.Content);
    }

    public CatalogPage  logIn(String username, String password) {
        logger.info("LoginPage Entering Email: " + username);
        loginPageObjects.Email.setValue(username);

        logger.info("LoginPage click Next Button");
        loginPageObjects.BtnNext.click();
        logger.info("LoginPage Entering Password: " + password);
        loginPageObjects.Password.setValue(password);

        logger.info("LoginPage click Login Button");
        loginPageObjects.BtnNext.click();

        return new CatalogPage(driver);
    }


}
