package TestRunner;

import Page.Pages;
import Setup.EnvironmentSetup;
import org.testng.annotations.Test;

public class UdemyTestRunner extends EnvironmentSetup {

    @Test(priority = 1)
    public void doSignUp() throws InterruptedException {
        int i;
        Pages pages = new Pages(driver);
        for (i = 0; i <= 2; i++) {
            driver.get("https://www.udemy.com/");
            if (i == 0) {
                pages.signUp1();
            } else if (i == 1) {
                pages.signUp2();
            } else {
                pages.signUp3();
            }
            Thread.sleep(3);
            pages.selectGoal();
            driver.get("https://www.udemy.com/topic/selenium-webdriver/");
            Thread.sleep(2000);
            if (i == 0) {
                pages.enrollCourse1();
            } else if (i == 1) {
                pages.enrollCourse2();
            } else {
                pages.enrollCourse3();
            }
            pages.logOut();
        }
    }
}
