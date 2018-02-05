package com.exercise.ui.steps.serenity;

import com.exercise.ui.pages.BrainyQuotePage;
import com.exercise.ui.pages.WonderfulQuotePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class EndUserStepsBrainyQuotePage {

    WonderfulQuotePage wonderfulQuotePage;
    BrainyQuotePage brainyQuotePage;

    @Step
    public void isOnThisPage(){
        wonderfulQuotePage.switchTab(1);
        String title = brainyQuotePage.getTitle();
        wonderfulQuotePage.closeTab();
        wonderfulQuotePage.switchTab(0);
        assertThat("Is Not in BrainyQuote Website",title,containsString("Famous Quotes at BrainyQuote"));
    }
}
