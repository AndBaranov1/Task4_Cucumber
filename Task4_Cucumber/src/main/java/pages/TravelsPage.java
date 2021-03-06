package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.Set;

/**
 * Created by 1 on 08.06.2018.
 */
public class TravelsPage {


    //название заголовка
    @FindBy(xpath = "//H3[text()='Страхование путешественников']")
    public WebElement title;

    //кнопка оформить онлайн
    @FindBy(xpath = "(//P[@class='kit-button kit-button_color_green kit-button_size_m'])[1]")
    public WebElement issueButtonClick;

    public TravelsPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 20, 1000);
        wait.until(ExpectedConditions.visibilityOf(issueButtonClick));
    }

    public void switchTab() {
        String parentWindow = BaseSteps.getDriver().getWindowHandle();
        Set<String> handles =  BaseSteps.getDriver().getWindowHandles();
        for(String windowHandle  : handles) {
            if (!windowHandle.equals(parentWindow)) {
                BaseSteps.getDriver().switchTo().window(windowHandle);
            }
        }
    }
}