package com.choucair.tests.orangehrm.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DashboardPage {

    public static final Target RECRUITMENT = Target.the("recruitment")
            .locatedBy("//a[@href=\"/web/index.php/recruitment/viewRecruitmentModule\"]");

}
