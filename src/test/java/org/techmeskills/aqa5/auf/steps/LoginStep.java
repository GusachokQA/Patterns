package org.techmeskills.aqa5.auf.steps;

import io.qameta.allure.Step;
import org.techmeskills.aqa5.auf.baseEntity.BaseStep;
import org.techmeskills.aqa5.auf.core.BrowsersService;
import org.techmeskills.aqa5.auf.models.User;
import org.techmeskills.aqa5.auf.pages.DashboardPage;
import org.techmeskills.aqa5.auf.pages.LoginPage;

public class LoginStep extends BaseStep {

    public LoginStep(BrowsersService browsersService) {
        super(browsersService);
    }


    @Step
    public void login(User user) {
        LoginPage loginPage = new LoginPage(browsersService);
/*
        loginPage.getEmailField().sendKeys(username);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getLoginButton().click();
*/
        loginPage.emailField.sendKeys(user.getUsername());
        loginPage.passwordField.sendKeys(user.getPassword());
        DashboardPage dashboardPage = loginPage.clickLoginButton();

    }
}
