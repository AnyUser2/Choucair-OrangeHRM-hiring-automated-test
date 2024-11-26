package com.choucair.tests.orangehrm.stepdefinitions;

import com.choucair.tests.orangehrm.constants.TestData;
import com.choucair.tests.orangehrm.tasks.RegisterHiringOrangeHRM;
import com.choucair.tests.orangehrm.userinterfaces.RecruitmentPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Attribute;

import static net.serenitybdd.screenplay.questions.Text.of;

import net.serenitybdd.screenplay.questions.Text;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterHiringStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @Given("dashboard page")
    public void dashboardPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/"));
    }

    @When("the user registers a new hire on the platform by filling out all the fields")
    public void theUserRegistersANewHireOnThePlatformByFillingOutAllTheFields() {
        theActorInTheSpotlight().attemptsTo(RegisterHiringOrangeHRM.information());
    }

    @Then("the information in the new registration matches the information completed and the registration status is {string}")
    public void theInformationInTheNewRegistrationMatchesTheInformationCompletedAndTheRegistrationStatusIs(String string) {

        String expectedName = String.join(" ", TestData.FIRST_NAME, TestData.MIDDLE_NAME, TestData.LAST_NAME);

        String actualName = theActorInTheSpotlight().asksFor(Text.of(RecruitmentPage.NAME));
        String actualFileName = theActorInTheSpotlight().asksFor(of(RecruitmentPage.FILE_NAME));
        String actualStatus = theActorInTheSpotlight().asksFor(of(RecruitmentPage.STATUS));
        String actualJobVacancy = theActorInTheSpotlight().asksFor(of(RecruitmentPage.JOB_VACANCY));
        String actualVacancy = theActorInTheSpotlight().asksFor(of(RecruitmentPage.VACANCY));
        String actualFirstName = theActorInTheSpotlight().asksFor(
                Attribute.of(RecruitmentPage.FIRST_NAME).named("value"));
        String actualMiddleName = theActorInTheSpotlight().asksFor(
                Attribute.of(RecruitmentPage.MIDDLE_NAME).named("value"));
        String actualLastName = theActorInTheSpotlight().asksFor(
                Attribute.of(RecruitmentPage.LAST_NAME).named("value"));
        String actualEmail = theActorInTheSpotlight().asksFor(
                Attribute.of(RecruitmentPage.EMAIL).named("value"));
        String actualContactNumber = theActorInTheSpotlight().asksFor(
                Attribute.of(RecruitmentPage.CONTACT_NUMBER).named("value"));
        String actualKeywords = theActorInTheSpotlight().asksFor(
                Attribute.of(RecruitmentPage.KEYWORDS).named("value"));
        String actualDate = theActorInTheSpotlight().asksFor(
                Attribute.of(RecruitmentPage.DATE).named("value"));
        String actualNote = theActorInTheSpotlight().asksFor(
                Attribute.of(RecruitmentPage.NOTES).named("value"));

        Assert.assertEquals("The name does not match the expected value", expectedName, actualName);
        Assert.assertEquals("The first name does not match the expected value", TestData.FIRST_NAME, actualFirstName);
        Assert.assertEquals("The middle name does not match the expected value", TestData.MIDDLE_NAME, actualMiddleName);
        Assert.assertEquals("The last name does not match the expected value", TestData.LAST_NAME, actualLastName);
        Assert.assertEquals("The job vacancy does not match the expected value", actualJobVacancy, TestData.VACANCY);
        Assert.assertEquals("The vacancy does not match the expected value", actualVacancy, TestData.VACANCY);
        Assert.assertEquals("The status does not match the expected value", actualStatus, "Status: Hired");
        Assert.assertEquals("The file name does not match the expected value", actualFileName, "cv.txt");
        Assert.assertEquals("The email does not match the expected value", actualEmail, TestData.EMAIL);
        Assert.assertEquals("The contact number does not match the expected value", actualContactNumber, TestData.CONTACT_NUMBER);
        Assert.assertEquals("The keywords does not match the expected value", actualKeywords, TestData.KEYWORDS);
        Assert.assertEquals("The date does not match the expected value", actualDate, "2023-01-12");
        Assert.assertEquals("The note does not match the expected value", actualNote, TestData.NOTES);

    }

}
