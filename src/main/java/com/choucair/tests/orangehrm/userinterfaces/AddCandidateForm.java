package com.choucair.tests.orangehrm.userinterfaces;

import com.choucair.tests.orangehrm.constants.TestData;
import net.serenitybdd.screenplay.targets.Target;

public class AddCandidateForm {

    public static final Target FIRST_NAME = Target.the("first_name")
            .locatedBy("//input[@name=\"firstName\"]");
    public static final Target MIDDLE_NAME = Target.the("middle_name")
            .locatedBy("//input[@name=\"middleName\"]");
    public static final Target LAST_NAME = Target.the("last_name")
            .locatedBy("//input[@name=\"lastName\"]");
    public static final Target VACANCY_LIST = Target.the("vacancy_list")
            .locatedBy("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]");
    public static final Target VACANCY = Target.the("vacancy")
            .locatedBy("//span[text()=\"" + TestData.VACANCY + "\"]");
    public static final Target EMAIL = Target.the("email")
            .locatedBy("(//input[@placeholder='Type here'])[1]");
    public static final Target CONTACT_NUMBER = Target.the("contact_number")
            .locatedBy("(//input[@placeholder='Type here'])[2]");
    public static final Target CV_INPUT = Target.the("cv_input")
            .locatedBy("//input[@class=\"oxd-file-input\"]");
    public static final Target KEYWORDS = Target.the("keywords")
            .locatedBy("//input[@placeholder=\"Enter comma seperated words...\"]");
    public static final Target CALENDAR = Target.the("calendar")
            .locatedBy("//i[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"]");
    public static final Target MONTHS = Target.the("months")
            .locatedBy("//div[@class=\"oxd-calendar-selector-month-selected\"]");
    public static final Target MONTH_DECEMBER = Target.the("december")
            .locatedBy("//li[text()=\"December\"]");
    public static final Target YEARS = Target.the("years")
            .locatedBy("//div[@class=\"oxd-calendar-selector-year-selected\"]");
    public static final Target YEAR_2023 = Target.the("2023")
            .locatedBy("//li[text()=\"2023\"]");
    public static final Target DAY_1 = Target.the("first")
            .locatedBy("//div[text()=\"1\"]");
    public static final Target NOTES = Target.the("notes")
            .locatedBy("//textarea[@placeholder=\"Type here\"]");
    public static final Target KEEP_DATA = Target.the("keep_data_checkbox")
            .locatedBy("//span[@class=\"oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input\"]");
    public static final Target SAVE = Target.the("save_button")
            .locatedBy("//button[@type=\"submit\"]");

}
