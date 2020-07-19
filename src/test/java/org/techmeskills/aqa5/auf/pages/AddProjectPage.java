package org.techmeskills.aqa5.auf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.techmeskills.aqa5.auf.baseEntity.BasePage;
import org.techmeskills.aqa5.auf.baseEntity.BasePageFactory;
import org.techmeskills.aqa5.auf.core.BrowsersService;
import org.techmeskills.aqa5.auf.elements.UIElement;
import org.techmeskills.aqa5.auf.pages.administration.AdministrationPage;
import org.techmeskills.aqa5.auf.pages.administration.ProjectsPage;

public class AddProjectPage extends BasePageFactory {

    @FindBy(id = "accept")
    public WebElement pageIdentifier;

    @FindBy(id = "accept")
    WebElement addProjectButton;

    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "suite_mode_single")
    public WebElement suiteModeSingle;

    @FindBy(id = "suite_mode_single_baseline")
    public WebElement suiteModeSingleBaseline;

    @FindBy(id = "suite_mode_multi")
    public WebElement suiteModeMulti;

    //protected By addProjectButtonSelector = By.id("accept");
    //protected By nameSelector = By.id("name");
    //protected By suiteModeSingleSelector = By.id("suite_mode_single");
    //protected By suiteModeSingleBaselineSelector = By.id("suite_mode_single_baseline");
    //protected By suiteModeMultiSelector = By.id("suite_mode_multi");

    public AddProjectPage(BrowsersService browsersService) {
        super(browsersService, false);
    }

    @Override
    protected void openPage() {

    }

    @Override
    public boolean isPageOpened() {
        return pageIdentifier.isDisplayed();
    }

    public ProjectsPage clickAddProjectButton(){
        addProjectButton.submit();
        return new ProjectsPage(browsersService, true);
    }

/*
    @Override
    protected void openPage() {

    }

    public boolean isPageOpened() {
        return new UIElement(browsersService, By.id("accept")).isDisplayed();
    }

    public UIElement getAddProjectButton() {
        return new UIElement(browsersService, addProjectButtonSelector);
    }

    public UIElement getNameField() {
        return new UIElement(browsersService, nameSelector);
    }

    public UIElement getSuiteModeSingleOption() {
        return new UIElement(browsersService, suiteModeSingleSelector);
    }

    public UIElement getSuiteModeSingleBaselineOption() {
        return new UIElement(browsersService, suiteModeSingleBaselineSelector);
    }

    public UIElement getSuiteModeMultiSelectorOption()  {
        return new UIElement(browsersService, suiteModeMultiSelector);
    }
*/

}
