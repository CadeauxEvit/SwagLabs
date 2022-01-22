import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {

    //Elements
    WebDriver driver;

    //Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Methods
    public void fillText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }


    public void clickElement(WebElement element){
        element.click();
    }

    public String pickItem(List<WebElement> elements, int index){
        WebElement pickedItem = elements.get(index);

        clickElement(pickedItem);
        return getElementText(pickedItem);
    }

    public String getElementText(WebElement element){
        return(element.getText());
    }

    public void sleep(long mills){
        try {
            Thread.sleep(mills);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void tearDown(){
        driver.quit();
    }
    public boolean elementIsDisplayed (WebElement element){
        return element.isDisplayed();
    }

}
