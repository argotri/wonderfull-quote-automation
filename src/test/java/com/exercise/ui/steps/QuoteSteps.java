package com.exercise.ui.steps;

import com.exercise.ui.steps.serenity.EndUserStepsBlibliHomePage;
import com.exercise.ui.steps.serenity.EndUserStepsBrainyQuotePage;
import com.exercise.ui.steps.serenity.EndUserStepsWonderfulQuotePage;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class QuoteSteps {

    @Steps
    EndUserStepsBlibliHomePage endUserStepsBlibliHomePage;

    @Steps
    EndUserStepsBrainyQuotePage endUserStepsBrainyQuotePage;

    @Steps
    EndUserStepsWonderfulQuotePage endUserStepsWonderfulQuotePage;


    @Given("user is on wonderful quote website")
    public void userIsOnWonderfulQuoteWebsite(){
        endUserStepsWonderfulQuotePage.openWebPage();
    }

    @When("user input quote '$quote'")
    public void userInputQuote(String quote){
        endUserStepsWonderfulQuotePage.inputQuote(quote);
    }

    @When("user input Author '$authorName'")
    public void userInputAuthor(String authorName){
        endUserStepsWonderfulQuotePage.inputAuthor(authorName);
    }

    @When("user choose background color '$color'")
    public void userChooseBackgroundColor(String color){
        endUserStepsWonderfulQuotePage.selectBackgroundColor(color);
    }

    @When("user click button Add Quote")
    public void userClickButtonAddQuote(){
        endUserStepsWonderfulQuotePage.clickAddQuote();
    }

    @Then("total quotes should be '$totalQuote'")
    public void totalQuoteShouldBe(String totalQuote){
        endUserStepsWonderfulQuotePage.checkTotalQuote(totalQuote);
    }

    @When("user click table view")
    public void userClickTableView(){
        endUserStepsWonderfulQuotePage.switchTableView();
    }

    @When("user hover on blue button")
    public void userHoverOnBlueButton(){
        endUserStepsWonderfulQuotePage.hoverBlueButton();
    }

    @Then("the table should be appear")
    public void theTableShouldBeAppear(){
        endUserStepsWonderfulQuotePage.checkTable(true);
    }

    @When("user hover on red button")
    public void userHoverOnRedButton(){
        endUserStepsWonderfulQuotePage.hoverRedButton();
    }

    @Then("the table should dissapear")
    public void theTableShouldDissapear(){
        endUserStepsWonderfulQuotePage.checkTable(false);
    }

    @When("user click on green button")
    public void userClickOnGreenButton(){
        endUserStepsWonderfulQuotePage.clickGreenButton();
    }

    @Then("the table should be appear after 10 seconds")
    public void theTableShouldBeAppearAfterTenSeconds(){
        endUserStepsWonderfulQuotePage.checkTable(true);
    }

    @When("user click on source link")
    public void userClickOnSourceLink(){
        endUserStepsWonderfulQuotePage.clickOnSourceLink();
    }

    @Then("user should get the browser open brainyquote website on new tab")
    public void userShouldGetTheBrowserOpenBrainyquoteWebsiteOnNewTab(){
        endUserStepsBrainyQuotePage.isOnThisPage();
    }

    @When("user click on blibli link")
    public void userClickOnBlibliLink(){
        endUserStepsWonderfulQuotePage.clickOnBlibliLink();
    }

    @Then("user should get browser open blibli on new window")
    public void userShouldGetBrowserOpenBlibliOnNewWindow(){
        endUserStepsBlibliHomePage.isOnBlibliHomePage();
    }
}
