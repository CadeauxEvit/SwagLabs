import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage{
    //Elements
    @FindBy(css = "#continue-shopping")
    WebElement continueShoppingButton;
    @FindBy(css = "#checkout")
    WebElement checkOutButton;
    @FindBy(xpath = "//button[@class='btn btn_secondary btn_small cart_button']")
    List<WebElement> removeButton ;
    @FindBy(xpath = "//div [@class='inventory_item_name']")
    List<WebElement> items;
    WebElement shoppingCart;
    @FindBy(xpath = "//button [@id ='react-burger-menu-btn']")
    WebElement menuButton;
    @FindBy(css = "#inventory_sidebar_link")
    WebElement inventorySidebarLink;
    @FindBy(css = "#about_sidebar_link")
    WebElement aboutSidebarLink;
    @FindBy(css = "#logout_sidebar_link")
    WebElement logoutSidebarLink;
    @FindBy(css = "#reset_sidebar_link")
    WebElement resetSidebarLink;

    public CartPage(WebDriver driver) {
        super(driver);
    }
}
