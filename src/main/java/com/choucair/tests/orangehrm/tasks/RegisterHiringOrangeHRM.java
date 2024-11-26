package com.choucair.tests.orangehrm.tasks;

import com.choucair.tests.orangehrm.constants.TestData;
import com.choucair.tests.orangehrm.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import com.choucair.tests.orangehrm.userinterfaces.*;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterHiringOrangeHRM implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String filePath = Paths.get("src/test/resources/files/cv.txt").toAbsolutePath().toString();

        actor.attemptsTo(
                SendKeys.of(TestData.USERNAME).into(LoginPage.USERNAME),
                SendKeys.of(TestData.PASSWORD).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN),
                Click.on(DashboardPage.RECRUITMENT),
                Click.on(RecruitmentPage.ADD),
                SendKeys.of(TestData.FIRST_NAME).into(AddCandidateForm.FIRST_NAME),
                SendKeys.of(TestData.MIDDLE_NAME).into(AddCandidateForm.MIDDLE_NAME),
                SendKeys.of(TestData.LAST_NAME).into(AddCandidateForm.LAST_NAME),
                Click.on(AddCandidateForm.VACANCY_LIST),
                Click.on(AddCandidateForm.VACANCY),
                SendKeys.of(TestData.EMAIL).into(AddCandidateForm.EMAIL),
                SendKeys.of(TestData.CONTACT_NUMBER).into(AddCandidateForm.CONTACT_NUMBER),
                SendKeys.of(filePath).into(AddCandidateForm.CV_INPUT),
                SendKeys.of(TestData.KEYWORDS).into(AddCandidateForm.KEYWORDS),
                Click.on(AddCandidateForm.CALENDAR),
                Click.on(AddCandidateForm.MONTHS),
                Click.on(AddCandidateForm.MONTH_DECEMBER),
                Click.on(AddCandidateForm.YEARS),
                Click.on(AddCandidateForm.YEAR_2023),
                Click.on(AddCandidateForm.DAY_1),
                SendKeys.of(TestData.NOTES).into(AddCandidateForm.NOTES),
                Click.on(AddCandidateForm.KEEP_DATA),
                Click.on(AddCandidateForm.SAVE),
                Click.on(RecruitmentPage.SHORTLIST),
                SendKeys.of(TestData.NOTES).into(ShortlistForm.NOTES),
                Click.on(ShortlistForm.SAVE),
                Click.on(RecruitmentPage.SCHEDULE_INTERVIEW),
                SendKeys.of("Interview title test").into(ScheduleInterviewForm.INTERVIEW_TITLE),
                SendKeys.of("Peter Mac Anderso").into(ScheduleInterviewForm.SELECT_INTERVIEWER),
                Click.on(ScheduleInterviewForm.PETER_MAC_ANDERSON),
                Click.on(ScheduleInterviewForm.CALENDAR),
                Click.on(ScheduleInterviewForm.MONTHS),
                Click.on(ScheduleInterviewForm.MONTH_DECEMBER),
                Click.on(ScheduleInterviewForm.YEARS),
                Click.on(ScheduleInterviewForm.YEAR_2024),
                Click.on(ScheduleInterviewForm.DAY_1),
                Click.on(ScheduleInterviewForm.HOURS),
                Click.on(ScheduleInterviewForm.UP_HOUR),
                Click.on(ScheduleInterviewForm.PM),
                SendKeys.of(TestData.NOTES).into(ScheduleInterviewForm.NOTES),
                Click.on(ScheduleInterviewForm.SAVE),
                Click.on(RecruitmentPage.MARK_INTERVIEW_PASSED),
                SendKeys.of(TestData.NOTES).into(MarkInterviewPassedForm.NOTES),
                Click.on(MarkInterviewPassedForm.SAVE),
                Click.on(RecruitmentPage.OFFER_JOB),
                SendKeys.of(TestData.NOTES).into(OfferJobForm.NOTES),
                Click.on(OfferJobForm.SAVE),
                Click.on(RecruitmentPage.HIRE),
                SendKeys.of(TestData.NOTES).into(HireForm.NOTES),
                Click.on(HireForm.SAVE)

        );
    }

    public static RegisterHiringOrangeHRM information() {
        return instrumented(RegisterHiringOrangeHRM.class);
    }
}


