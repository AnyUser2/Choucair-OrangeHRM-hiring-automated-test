package com.choucair.tests.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RecruitmentPage {

    public static final Target ADD = Target.the("add_button")
            .locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");
    public static final Target SHORTLIST = Target.the("shortlist_button")
            .locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--success\"]");
    public static final Target SCHEDULE_INTERVIEW = Target.the("schedule_interview")
            .locatedBy("//button[text()=\" Schedule Interview \"]");
    public static final Target MARK_INTERVIEW_PASSED = Target.the("mark_interview_passed")
            .locatedBy("//button[text()=\" Mark Interview Passed \"]");
    public static final Target OFFER_JOB = Target.the("offer_job")
            .locatedBy("//button[text()=\" Offer Job \"]");
    public static final Target HIRE = Target.the("hire")
            .locatedBy("//button[text()=\" Hire \"]");
    public static final Target NAME = Target.the("name")
            .locatedBy("(//p[@class=\"oxd-text oxd-text--p\"])[1]");
    public static final Target VACANCY = Target.the("vacancy")
            .locatedBy("(//p[@class=\"oxd-text oxd-text--p\"])[2]");
    public static final Target STATUS = Target.the("status")
            .locatedBy("//p[@class=\"oxd-text oxd-text--p oxd-text--subtitle-2\"]");
    public static final Target FIRST_NAME = Target.the("first_name")
            .locatedBy("//input[@name=\"firstName\"]");
    public static final Target MIDDLE_NAME = Target.the("middle_name")
            .locatedBy("//input[@name=\"middleName\"]");
    public static final Target LAST_NAME = Target.the("last_name")
            .locatedBy("//input[@name=\"lastName\"]");
    public static final Target JOB_VACANCY = Target.the("job_vacancy")
            .locatedBy("//div[@class=\"oxd-select-text-input\"]");
    public static final Target EMAIL = Target.the("email")
            .locatedBy("(//input[@class=\"oxd-input oxd-input--active\"])[2]");
    public static final Target CONTACT_NUMBER = Target.the("contact_number")
            .locatedBy("(//input[@class=\"oxd-input oxd-input--active\"])[3]");
    public static final Target KEYWORDS = Target.the("keywords")
            .locatedBy("(//input[@class=\"oxd-input oxd-input--active\"])[4]");
    public static final Target DATE = Target.the("date")
            .locatedBy("(//input[@class=\"oxd-input oxd-input--active\"])[5]");
    public static final Target NOTES = Target.the("notes")
            .locatedBy("//textarea[@placeholder=\"Type here\"]");
    public static final Target FILE_NAME = Target.the("file_name")
            .locatedBy("//p[@title=\"cv.txt\"]");

}
