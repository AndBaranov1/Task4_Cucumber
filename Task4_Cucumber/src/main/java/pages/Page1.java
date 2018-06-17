package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

/**
 * Created by 1 on 08.06.2018.
 */
public class Page1 {

    @FindBy(xpath = "//DIV[@ng-click='setProdProg(prodProg)']")
    public WebElement titlesumma;

    @FindBy(xpath = "//SPAN[@ng-click='save()'][text()='Оформить']")
    public WebElement issueButton;

    public Page1(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(),10, 1000);
        wait.until(ExpectedConditions.visibilityOf(titlesumma));
        wait.until(ExpectedConditions.visibilityOf(issueButton));
    }


}