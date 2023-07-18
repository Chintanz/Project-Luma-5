package om.softwaretestingboard.magento.pages;

import om.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WomenTestPage extends Utility {
    @CacheLookup
            @FindBy(xpath = ("//a[@id='ui-id-4']//span[contains(text(),'Women')]"))
    WebElement womenMenu;
    @CacheLookup
            @FindBy(xpath = ("//a[@id='ui-id-9']//span[text()='Tops']"))
            WebElement tops;
    @CacheLookup
            @FindBy(xpath = ("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]"))
            WebElement jackets;
    @CacheLookup
    @FindBy(xpath = ("//select[@id='sorter'])[1]"))
    WebElement productName;
    @CacheLookup
            @FindBy(xpath = ("//select[@id='sorter']"))
    WebElement price;


    public void clickOnWomenMenu(){mouseHoverToElement(womenMenu);}
    public void clickOnTops(){mouseHoverToElement(tops);}
    public void clickOnJackets(){mouseHoverToElementAndClick(jackets);}
    public void clickOnProductName(){selectByVisibleTextFromDropDown(productName);}
    public void clickOnPriceSortBy(){selectByVisibleTextFromDropDown(price);}
}
