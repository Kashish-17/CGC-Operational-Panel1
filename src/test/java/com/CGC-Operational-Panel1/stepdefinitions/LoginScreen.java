package com.CGC-Operational-Panel1.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com..driverfactory.DriverFactory;
import com.CGC-Operational-Panel1.pages.LoginScreenPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreen extends DriverFactory {
LoginScreenPage loginScreenPage = new LoginScreenPage(driver);
@Given("the user is on the Login Page")
public void the_user_is_on_the_login_page() {
driver = DriverFactory.getDriver();
loginScreenPage.navigateToLoginPage();
}
@When("I enter {string} in the Organization field")
public void i_enter_organization_in_the_organization_field(String organization) {
loginScreenPage.enterOrganization(organization);
}
@When("I enter {string} in the Email field")
public void i_enter_email_in_the_email_field(String email) {
loginScreenPage.enterEmail(email);
}
@When("I enter {string} in the Password field")
public void i_enter_password_in_the_password_field(String password) {
loginScreenPage.enterPassword(password);
}
@When("the user clicks the Login button")
public void the_user_clicks_the_login_button() {
loginScreenPage.clickLoginButton();
}
@Then("the user should be redirected to the home screen")
public void the_user_should_be_redirected_to_the_home_screen() {
loginScreenPage.isHomeScreenDisplayed();
}
@Then("a welcome message should be displayed on the home screen")
public void a_welcome_message_should_be_displayed_on_the_home_screen() {
loginScreenPage.isWelcomeMessageDisplayed();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
loginScreenPage.isLoginButtonEnabled();
}
@Then("the Login button should be disabled")
public void the_login_button_should_be_disabled() {
loginScreenPage.isLoginButtonEnabled();
}
@When("the user locates and clicks the Forgot Password link")
public void the_user_locates_and_clicks_the_forgot_password_link() {
loginScreenPage.clickForgotPasswordLink();
}
@Then("the user is redirected to the Forgot Password screen")
public void the_user_is_redirected_to_the_forgot_password_screen() {
loginScreenPage.isForgotPasswordScreenDisplayed();
}
@Then("the Forgot Password screen displays Organization and Email fields")
public void the_forgot_password_screen_displays_organization_and_email_fields() {
loginScreenPage.areForgotPasswordFieldsDisplayed();
}
@Given("the user enters a valid Organization name in the Organization field")
public void the_user_enters_a_valid_organization_name_in_the_organization_field() {
loginScreenPage.enterOrganization("ValidOrganizationName");
}
@Given("the user enters a valid Email address in the Email field")
public void the_user_enters_a_valid_email_address_in_the_email_field() {
loginScreenPage.enterEmail("valid.email@example.com");
}
@When("the user clicks the Send button")
public void the_user_clicks_the_send_button() {
loginScreenPage.clickSendButton();
}
@Then("the system sends a password reset email")
public void the_system_sends_a_password_reset_email() {
loginScreenPage.isPasswordResetEmailSent();
}
@Then("the user receives the email in their inbox")
public void the_user_receives_the_email_in_their_inbox() {
loginScreenPage.isEmailReceivedInInbox();
}