package org.techmeskills.aqa5.auf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.techmeskills.aqa5.auf.baseEntity.BasePageFactory;
import org.techmeskills.aqa5.auf.core.BrowsersService;


public class LoginPage extends BasePageFactory {
    private String URL = "https://aqa5master.testrail.io/";

    @FindBy(id = "name")
    public WebElement pageIdentifier;

    @FindBy(id = "name")
    public WebElement emailField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "button_primary")
    WebElement loginButton;

    //private By emailSelector = By.id("name");
    //private By passwordSelector = By.id("password");
    //private By loginSelector = By.id("button_primary");

    //BrowsersService browsersService;

    public LoginPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.isDisplayed();
    }

    public DashboardPage clickLoginButton(){
        loginButton.click();
        return new DashboardPage(browsersService);
    }
/*
    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return new UIElement(browsersService, By.id("button_primary")).isDisplayed();
    }
/*
    public UIElement getEmailField() {
        return new UIElement(browsersService, emailSelector);
    }

    public UIElement getPasswordField() {
        return new UIElement(browsersService, passwordSelector);
    }

    public UIElement getLoginButton() {
        return new UIElement(browsersService, loginSelector);
    }

 */
}
