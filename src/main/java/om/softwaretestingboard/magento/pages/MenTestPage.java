package om.softwaretestingboard.magento.pages;

import om.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MenTestPage extends Utility {
   @CacheLookup
           @FindBy(xpath = ("//span[normalize-space()='Men']"))
    WebElement menMenu;
  @CacheLookup
          @FindBy(xpath = ("//a[@id='ui-id-18']"))
          WebElement bottoms;
  @CacheLookup
          @FindBy(xpath = ("//a[@id='ui-id-23']//span[contains(text(),'Pants')]"))
          WebElement pants;
   @CacheLookup
           @FindBy(xpath = ("//a[@class='product-item-link']"))
           WebElement cronusYoga;
    @CacheLookup
            @FindBy(xpath = ("//div[@class='swatch-option text'])[1]"))
            WebElement size32;
    @CacheLookup
            @FindBy(xpath = ("//div[@id='option-label-color-93-item-49']"))
            WebElement blackColour;

    @CacheLookup
            @FindBy(xpath = ("//a[normalize-space()='Cronus Yoga Pant']"))
            WebElement addToCart;
    @CacheLookup
            @FindBy(xpath = ("//div[contains(text(),'Cronus ')]"))
    WebElement addedCronusMeg;
    @CacheLookup
            @FindBy(xpath = ("//a[contains(text(),'shopping cart')]"))
            WebElement shoppingCartLink;
    @CacheLookup
            @FindBy(xpath = ("//span[text()='Shopping Cart']"))
            WebElement txtShoppingCart;
    @CacheLookup
            @FindBy(xpath = ("//a[text()='Cronus Yoga Pant ']"))
            WebElement cronusName;
    @CacheLookup
            @FindBy(xpath = ("//dd[contains(text(),'32')]"))
            WebElement size32Verify;
    @CacheLookup
            @FindBy(xpath = ("//dd[contains(text(),'Black')]"))
    WebElement colouBlackverify;

    //////////////////////////////////////////////////////////////////////////////////
    public void clickOnMenMenu(){mouseHoverToElement(menMenu);}
    public void clickOnBottoms(){mouseHoverToElement(bottoms);}
    public void clickOnPants(){mouseHoverToElementAndClick(pants);}
    public void clickOnCronusYoga(){mouseHoverToElement(cronusYoga);}
    public void clickOnSize32(){mouseHoverToElementAndClick(size32);}
    public void clickOnBlackColour(){mouseHoverToElementAndClick(blackColour);}
    public void clickOnAddToCart(){clickOnElement(addToCart);}
    public String getVerifyCronusMessage(){return getTextFromElement(addedCronusMeg);}
    public void clickOnShoppingCart(){clickOnElement(shoppingCartLink);}
    public String getVerifyShoppingCart(){return getTextFromElement(txtShoppingCart);}
    public String getVerifyCronusName(){return getTextFromElement(cronusName);}
    public String getVerifySize(){return getTextFromElement(size32Verify);}
    public String getVerifyColourBlack(){return getTextFromElement(colouBlackverify);}
}
