package om.softwaretestingboard.magento.pages;

import om.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearTestPage extends Utility {
    @CacheLookup
    @FindBy(xpath = ("//span[normalize-space()='Gear']"))
    WebElement Gear;
    @CacheLookup
    @FindBy(xpath = ("//span[contains(text(),'Bags')]"))
    WebElement Bags;
    @CacheLookup
    @FindBy(xpath = ("//a[normalize-space()='Overnight Duffle']"))
    WebElement OvernightDuffle;
@CacheLookup
@FindBy(xpath = ("//span[@class='base']"))
WebElement txtOvernightDuffle;
@CacheLookup
@FindBy(xpath = "(//input[@id='qty']), 3)")
WebElement quantity3;
@CacheLookup
@FindBy(xpath = ("//button[@id='product-addtocart-button']"))
WebElement cartButton;
@CacheLookup
@FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
WebElement addedOvernightDuffle;
@CacheLookup
@FindBy(xpath = ("//a[normalize-space()='shopping cart']"))
WebElement shoppingCart;
@CacheLookup
@FindBy(xpath = ("//input[@title='Qty']"))
WebElement quantityTxt;
@CacheLookup
@FindBy(xpath = ("//span[@class='cart-price']//span)[2]"))
WebElement priceTxt;
@CacheLookup
        @FindBy(xpath = ("//input[@class='input-text qty'])[1]"))
        WebElement quantityChange;
@CacheLookup
        @FindBy(xpath = ("//span[normalize-space()='Update Shopping Cart']"))
        WebElement updateCart;
@CacheLookup
        @FindBy(xpath = ("//span[@class='cart-price']//span)[2]"))
WebElement txtPrice;









    public void clickOnGearMenu(){clickOnElement(Gear);}

    public void clickOnBags(){mouseHoverToElementAndClick(Bags);}
    public void clickOnOvernightDuffle(){clickOnElement(OvernightDuffle);}
    public String txtOvernightDuffle(){
        String message = getTextFromElement(OvernightDuffle);
        return message;
    }
    public void sendChangeQuantity(){sendTextToElement(quantity3, "3");}
    public void clickOnCart(){clickOnElement(cartButton);}
    public String getVerifyOvernightAdded(){return getTextFromElement(addedOvernightDuffle);}
    public void clickOnShoppingCart(){clickOnElement(shoppingCart);}
    public String getVerifyQuantity(){return getTextFromElement(quantityTxt);}
    public String getverifyPrice(){return getTextFromElement(priceTxt);}
    public void sendQuantityChange(){sendTextToElement(quantityChange,"5");}
    public void clickOnUpdateCart(){clickOnElement(updateCart);}
    public String getVerifyTxtPrice(){return getTextFromElement(txtPrice);}


}
