import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InventoryPage extends BasePage{
    //Elements
    @FindBy(xpath = "//select")
    WebElement select;
    @FindBy(xpath = "//div [@class='inventory_item_name']")
    List<WebElement> items;
    @FindBy(xpath = "//button [@class ='btn btn_primary btn_small btn_inventory']")
    List<WebElement> addToCartButton;
    @FindBy(css = "#shopping_cart_container")
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


    public InventoryPage(WebDriver driver) {
        super(driver);
    }
}
