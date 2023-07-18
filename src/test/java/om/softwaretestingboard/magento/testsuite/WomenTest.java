package om.softwaretestingboard.magento.testsuite;

import om.softwaretestingboard.magento.pages.HomePage;
import om.softwaretestingboard.magento.pages.WomenTestPage;
import om.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {
    HomePage homePage;
    WomenTestPage womenPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        womenPage = new WomenTestPage();
    }

    @Test
    public void verifyTheSortByProductNameFilter(){
        womenPage.clickOnWomenMenu();
        womenPage.clickOnTops();
        womenPage.clickOnJackets();
        womenPage.clickOnProductName();
    }
    @Test
    public void verifyTheSortByPriceFilter(){
        womenPage.clickOnWomenMenu();
        womenPage.clickOnTops();
        womenPage.clickOnJackets();
        womenPage.clickOnPriceSortBy();
    }




}