package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    @FindBy(className = "udlite-accordion-panel-title")
    List<WebElement> learningFor;
    @FindBy(name = "Web Developer")
    WebElement webDev;
    @FindBy(css = "button")
    List<WebElement> next;

    public Pages (WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void goToSignUp(){
        btnSignUp.click();
        setName.sendKeys("Zubair Hasan");
        setMail.sendKeys("zubairdastan@yahoo.com");
        setPass.sendKeys("987654321dcba");
        checkBox.click();
        btnSubmitSignUp.click();
    }

    public void selectGoal(){
        careerGoal.get(2).click();
        learningFor.get(5).click();
        webDev.click();
        next.get(69).click();

    }



}
