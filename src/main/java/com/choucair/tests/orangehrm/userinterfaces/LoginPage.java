package com.choucair.tests.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USERNAME = Target.the("username_field")
            .locatedBy("//input[@name=\"username\"]");
    public static final Target PASSWORD = Target.the("password_field")
            .locatedBy("//input[@name=\"password\"]");
    public static final Target LOGIN = Target.the("login_button")
            .locatedBy("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");

}
