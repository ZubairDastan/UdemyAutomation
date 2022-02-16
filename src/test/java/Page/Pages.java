package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Pages {
    WebDriver webDriver;

    @FindBy(xpath = "//body/div[2]/div[1]/div[3]/div[7]/a[1]")
    WebElement btnSignUp;
    @FindBy(id = "id_fullname")
    WebElement setName;
    @FindBy(id = "email--1")
    WebElement setMail;
    @FindBy(id = "password")
    WebElement setPass;
    @FindBy(className = "checkbox-label")
    WebElement checkBox;
    @FindBy(id = "submit-id-submit")
    WebElement btnSubmitSignUp;
    @FindBy(className = "udlite-toggle-input-block-outline")
    List<WebElement> careerGoal;
    @FindBy(css = "button")
    List<WebElement> next1;
    @FindBy(className = "udlite-accordion-panel-title")
    List<WebElement> learningFor;
    @FindBy(name = "Web Developer")
    WebElement webDev;
    @FindBy(css = "button")
    List<WebElement> next2;
    @FindBy(css = "a")
    List<WebElement> btnFinish;
    @FindBy(className = "udlite-accordion-panel-title")
    List<WebElement> priceFilter;
    @FindBy(xpath = "//body[1]/div[3]/div[3]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[9]/div[1]")
    WebElement scrollTo;
    @FindBy(xpath = "//body[1]/div[3]/div[3]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[7]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[2]")
    WebElement free;
    @FindBy(xpath = "//a[contains(text(),'Selenium WebDriver with Java Quickstart')]")
    WebElement course1;
    @FindBy(xpath = "//a[contains(text(),'Selenium Webdriver Java : Learn from Scratch (Free')]")
    WebElement course2;
    @FindBy(xpath = "//a[contains(text(),'Cucumber, Selenium & Java -Develop a Framework in ')]")
    WebElement course3;
    @FindBy(css = "button")
    List<WebElement> btnEnroll;
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[9]")
    WebElement profile;
    @FindBy(className = "udlite-block-list-item-content")
    List<WebElement> clkLogout;

    public Pages(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void signUp1() {
        btnSignUp.click();
        setName.sendKeys("Zubair Hasan");
        setMail.sendKeys("udemytest0001@yahoo.com");
        setPass.sendKeys("987654321dcba");
        checkBox.click();
        btnSubmitSignUp.click();
    }

    public void signUp2() {
        btnSignUp.click();
        setName.sendKeys("Zubair Hasan");
        setMail.sendKeys("udemytest102@yahoo.com");
        setPass.sendKeys("987654321dcba");
        checkBox.click();
        btnSubmitSignUp.click();
    }

    public void signUp3() {
        btnSignUp.click();
        setName.sendKeys("Zubair Hasan");
        setMail.sendKeys("udemytest103@yahoo.com");
        setPass.sendKeys("987654321dcba");
        checkBox.click();
        btnSubmitSignUp.click();
    }

    public void selectGoal() throws InterruptedException {
        careerGoal.get(2).click();
        next1.get(0).click();
        Thread.sleep(1000);
        learningFor.get(5).click();
        Thread.sleep(1000);
        ((JavascriptExecutor) webDriver)
                .executeScript("window.scrollTo(0, document.body.scrollHeight)");
        webDev.click();
        Thread.sleep(1000);
        next2.get(69).click();
        Thread.sleep(2000);
        btnFinish.get(1).click();
    }

    public void enrollCourse1() throws InterruptedException {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(scrollTo).perform();
        priceFilter.get(6).click();
        Thread.sleep(1000);
        free.click();
        Thread.sleep(2000);
        course1.click();
        Thread.sleep(3000);
        btnEnroll.get(6).click();
        Thread.sleep(3000);
    }

    public void enrollCourse2() throws InterruptedException {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(scrollTo).perform();
        priceFilter.get(6).click();
        Thread.sleep(1000);
        free.click();
        Thread.sleep(2000);
        course2.click();
        Thread.sleep(3000);
        btnEnroll.get(6).click();
        Thread.sleep(3000);
    }

    public void enrollCourse3() throws InterruptedException {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(scrollTo).perform();
        priceFilter.get(6).click();
        Thread.sleep(1000);
        free.click();
        Thread.sleep(2000);
        course3.click();
        Thread.sleep(3000);
        btnEnroll.get(6).click();
        Thread.sleep(3000);
    }

    public void logOut() throws InterruptedException {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profile).perform();
        Thread.sleep(1000);
        clkLogout.get(27).click();
    }
}
