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
    @FindBy(name = "price")
    List<WebElement> free;
    @FindBy(css = "img")
    List<WebElement> courseImage;
    @FindBy(css = "button")
    List<WebElement> btnEnroll;
    @FindBy(xpath = "//a[contains(aria-label, \"My profile\")]")
    WebElement profile;
    @FindBy(className = "udlite-block-list-item-content")
    List<WebElement> clkLogout;

    public Pages (WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void signUp(){
        btnSignUp.click();
        setName.sendKeys("Zubair Hasan");
        setMail.sendKeys("zubairdastan11@yahoo.com");
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
        btnFinish.get(1).click();
    }

    public void enrollCourse(){
        ((JavascriptExecutor) webDriver).executeScript(
                "arguments[0].scrollIntoView();", priceFilter);
        priceFilter.get(6).click();
        free.get(1).click();
        courseImage.get(14).click();
        btnEnroll.get(6).click();
    }

    public void logOut() throws InterruptedException {
        Actions actions = new Actions(webDriver);
        actions.moveToElement(profile).perform();
        Thread.sleep(1000);
        clkLogout.get(27).click();
    }
}
