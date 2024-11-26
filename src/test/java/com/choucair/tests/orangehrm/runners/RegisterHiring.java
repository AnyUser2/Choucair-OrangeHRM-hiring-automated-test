package com.choucair.tests.orangehrm.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registerHiring.feature",
glue = "com.choucair.tests.orangehrm.stepdefinitions",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class RegisterHiring {
}
