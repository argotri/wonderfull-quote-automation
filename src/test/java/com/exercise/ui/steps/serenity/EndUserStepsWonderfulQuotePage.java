package com.exercise.ui.steps.serenity;

import com.exercise.ui.pages.WonderfulQuotePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EndUserStepsWonderfulQuotePage {

    WonderfulQuotePage wonderfulQuotePage;

    @Step
    public void openWebPage(){
        wonderfulQuotePage.open();
    }

    @Step
    public void inputQuote(String quote){
        wonderfulQuotePage.inputTxtAreaQuote(quote);
    }

    @Step
    public void inputAuthor(String authorName){
        wonderfulQuotePage.inputTxtInputAuthor(authorName);
    }

    @Step
    public void selectBackgroundColor(String color){
        wonderfulQuotePage.selectBackgroundColor(color);
    }

    @Step
    public void clickAddQuote(){
        wonderfulQuotePage.clickBtnAddQuote();
    }

    @Step
    public void checkTotalQuote(String totalQuote){
        Integer mustBe = Integer.parseInt(totalQuote);
        Integer fromUi = wonderfulQuotePage.getTotalQuote();
        assertThat("Total Quote Not Same",fromUi,equalTo(mustBe));
    }

    @Step
    public void switchTableView(){
        wonderfulQuotePage.clickTabTableView();
    }

    @Step
    public void hoverRedButton(){
        wonderfulQuotePage.hoverBtnRed();
    }

    @Step
    public void hoverBlueButton(){
        wonderfulQuotePage.scrollDown();
        wonderfulQuotePage.hoverBtnBlue();
    }

    @Step
    public void checkTable(boolean isAppear){
        String text = "Table is "+ (isAppear? "Appear" : "Dissapear");
        assertThat(text,wonderfulQuotePage.isTableQuoteDisplayed(),equalTo(isAppear));
    }

    @Step
    public void clickGreenButton(){
        wonderfulQuotePage.clickGreen();
    }

    @Step
    public void clickOnSourceLink(){
        wonderfulQuotePage.scrollUp();
        wonderfulQuotePage.scrollUp();
        wonderfulQuotePage.clickLinkSource();
    }

    @Step
    public void clickOnBlibliLink(){
        wonderfulQuotePage.scrollDown();
        wonderfulQuotePage.scrollDown();
        wonderfulQuotePage.clickLinkBlibli();
    }
}
