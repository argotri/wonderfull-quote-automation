package com.exercise.ui.pages;

import com.sun.org.glassfish.gmbal.DescriptorFields;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

@DefaultUrl("http://gosoft.web.id/wonderfulQuote/")
public class WonderfulQuotePage extends PageObject {

    @FindBy(xpath = "//textarea[@class='form-control']")
    private WebElementFacade txtAreaQuote;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElementFacade txtInputAuthor;

    @FindBy(xpath = "//select[@class='form-control']")
    private WebElementFacade selectBackgroundColor;

    @FindBy(xpath = "//button[contains(text(),'Add Quote')]")
    private WebElementFacade btnAddQuote;

    @FindBy(xpath = "//div[@role='progressbar']")
    private WebElementFacade progressBar;

    @FindBy(xpath = "//a[text()='Table View']")
    private WebElementFacade tabTableView;

    @FindBy(xpath = "//button[text()='Hover Me To See Table']")
    private WebElementFacade btnBlue;

    @FindBy(xpath = "//button[text()='Hover Me To Hide Table']")
    private WebElementFacade btnRed;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    private WebElementFacade btnGreen;

    private String xpathTableQuote = "//table";

    @FindBy(xpath = "//a[@href='https://www.brainyquote.com']")
    private WebElementFacade linkSource;

    @FindBy(xpath = "//a[contains(text(),'Blibli.com')]")
    private WebElementFacade linkBlibli;


    public void inputTxtAreaQuote(String quote){
        txtAreaQuote.type(quote);
    }

    public void inputTxtInputAuthor(String authorName){
        txtInputAuthor.type(authorName);
    }

    public void selectBackgroundColor(String color){
        selectBackgroundColor.selectByVisibleText(color);
    }

    public void clickBtnAddQuote(){
        btnAddQuote.click();
    }

    public Integer getTotalQuote(){
        return Integer.parseInt(progressBar.getAttribute("aria-valuenow"))/10;
    }

    public void scrollDown(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0,250)");
    }

    public void scrollUp(){
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("window.scrollBy(0,-250)");
    }

    public void clickTabTableView(){
        tabTableView.click();
    }

    public void hoverBtnBlue(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnBlue).build().perform();
    }

    public void hoverBtnRed(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(btnRed).build().perform();
    }

    public void clickGreen(){
        btnGreen.click();
    }

    public boolean isTableQuoteDisplayed(){
        try {
            WebElementFacade tableQuote = find(By.xpath(xpathTableQuote));
            tableQuote.setImplicitTimeout(new Duration(15, TimeUnit.SECONDS));
            tableQuote.waitUntilPresent();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void clickLinkSource(){
        linkSource.click();
    }

    public void clickLinkBlibli(){
        linkBlibli.click();
    }

    public void switchTab(Integer index){
        ArrayList<String> tabs = new ArrayList<String>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(index));
    }

    public void closeTab(){
        getDriver().close();
    }

}
