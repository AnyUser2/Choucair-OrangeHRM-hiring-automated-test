package com.choucair.tests.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HireForm {

    public static final Target NOTES = Target.the("notes")
            .locatedBy("//textarea[@placeholder=\"Type here\"]");
    public static final Target SAVE = Target.the("save_button")
            .locatedBy("//button[text()=\" Save \"]");

}
