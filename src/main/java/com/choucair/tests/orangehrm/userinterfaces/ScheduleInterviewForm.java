package com.choucair.tests.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ScheduleInterviewForm {

    public static final Target INTERVIEW_TITLE = Target.the("interview_title")
            .locatedBy("(//input[@class=\"oxd-input oxd-input--active\"])[6]");
    public static final Target SELECT_INTERVIEWER = Target.the("select_interviewer")
            .locatedBy("//input[@include-employees=\"onlyCurrent\"]");
    public static final Target PETER_MAC_ANDERSON = Target.the("peter_mac_anderson")
            .locatedBy("//span[text()=\"Peter Mac Anderson\"]");
    public static final Target CALENDAR = Target.the("calendar")
            .locatedBy("//i[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"]");
    public static final Target MONTHS = Target.the("months")
            .locatedBy("//div[@class=\"oxd-calendar-selector-month-selected\"]");
    public static final Target MONTH_DECEMBER = Target.the("december")
            .locatedBy("//li[text()=\"December\"]");
    public static final Target YEARS = Target.the("years")
            .locatedBy("//div[@class=\"oxd-calendar-selector-year-selected\"]");
    public static final Target YEAR_2024 = Target.the("2024")
            .locatedBy("//li[text()=\"2024\"]");
    public static final Target DAY_1 = Target.the("first")
            .locatedBy("//div[text()=\"1\"]");
    public static final Target HOURS = Target.the("hours")
            .locatedBy("//input[@placeholder=\"hh:mm\"]");
    public static final Target UP_HOUR = Target.the("up_hour_button")
            .locatedBy("//i[@class=\"oxd-icon bi-chevron-up oxd-icon-button__icon oxd-time-hour-input-up\"]");
    public static final Target PM = Target.the("pm")
            .locatedBy("//input[@name=\"pm\"]");
    public static final Target NOTES = Target.the("notes")
            .locatedBy("//textarea[@placeholder=\"Type here\"]");
    public static final Target SAVE = Target.the("save_button")
            .locatedBy("//button[text()=\" Save \"]");

}
