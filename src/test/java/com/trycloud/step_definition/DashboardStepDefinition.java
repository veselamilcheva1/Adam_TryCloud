package com.trycloud.step_definition;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import com.trycloud.pages.DashboardPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.module.Configuration;
import java.util.List;

public class DashboardStepDefinition {

    DashboardPage dashboardPage=new DashboardPage();

    @When("user  log in with valid credentials")
    public void user_log_in_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        new LoginPage().login();
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModulesNames) {
        List<String> actualModuleNames = dashboardPage.getTextOfModules();

        Assert.assertEquals(expectedModulesNames, actualModuleNames);
    }
}
