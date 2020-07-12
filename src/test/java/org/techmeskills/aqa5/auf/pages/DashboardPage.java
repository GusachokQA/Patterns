package org.techmeskills.aqa5.auf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.techmeskills.aqa5.auf.baseEntity.BasePageFactory;
import org.techmeskills.aqa5.auf.core.BrowsersService;

public class DashboardPage extends BasePageFactory {

    @FindBy(id = "sidebar-projects-add")
    public WebElement addProjectButton;

    @FindBy(id = "sidebar-projects-add")
    public WebElement pageIdentifier;

    //protected By addProjectButtonSelector = By.id("sidebar-projects-add");

    public DashboardPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.isDisplayed();
    }
/*
    @Override
    protected void openPage() {

    }
/*
    public boolean isPageOpened() {
        return browsersService.getDriver().getTitle().equalsIgnoreCase("All Projects - TestRail");
    }
/*
    public UIElement getAddProjectButton() {
        return new UIElement(browsersService, addProjectButtonSelector);
    }

 */
}
