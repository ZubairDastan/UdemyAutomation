package TestRunner;

import Page.Pages;
import Setup.EnvironmentSetup;
import org.testng.annotations.Test;

public class UdemyTestRunner extends EnvironmentSetup {

    @Test(priority = 1)
    public void doSignUp(){
        driver.get("https://www.udemy.com/");
        Pages pages = new Pages(driver);
        pages.signUp();
    }

    @Test(priority = 2)
    public void goalSelect() throws InterruptedException {
        Thread.sleep(3);
        Pages pages = new Pages(driver);
        pages.selectGoal();
    }


}
