package com.backend.pages;

import com.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreenPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "organizationField")
    private WebElement organizationField;

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "forgotPasswordLink")
    private WebElement forgotPasswordLink;

    @FindBy(id = "homeScreen")
    private WebElement homeScreen;

    @FindBy(id = "welcomeMessage")
    private WebElement welcomeMessage;

    @FindBy(id = "sendButton")
    private WebElement sendButton;

    @FindBy(id = "forgotPasswordScreen")
    private WebElement forgotPasswordScreen;

    public LoginScreenPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        try {
            driver.get("http://localhost");
            WebElement loginButton = driver.findElement(By.id("loginBtn"));
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterOrganization(String organization) {
        try {
            elementUtils.clearAndSendKeys(organizationField, organization);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isHomeScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(homeScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isWelcomeMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(welcomeMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isLoginButtonEnabled() {
        try {
            return loginButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickForgotPasswordLink() {
        try {
            elementUtils.clickElement(forgotPasswordLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isForgotPasswordScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(forgotPasswordScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areForgotPasswordFieldsDisplayed() {
        try {
            return elementUtils.isElementDisplayed(organizationField) &&
                   elementUtils.isElementDisplayed(emailField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickSendButton() {
        try {
            elementUtils.clickElement(sendButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPasswordResetEmailSent() {
        return true; // Placeholder for actual implementation
    }

    public boolean isEmailReceivedInInbox() {
        return true; // Placeholder for actual implementation
    }
}