package com.exercise.ui.steps.serenity;

import com.exercise.ui.pages.BlibliHomePage;
import com.exercise.ui.pages.WonderfulQuotePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class EndUserStepsBlibliHomePage {

    WonderfulQuotePage wonderfulQuotePage;
    BlibliHomePage blibliHomePage;

    @Step
    public void isOnBlibliHomePage(){
        wonderfulQuotePage.switchTab(1);
        String title = blibliHomePage.getTitle();
        wonderfulQuotePage.closeTab();
        wonderfulQuotePage.switchTab(0);
        assertThat("Is Not in Blibli Website",title,containsString("Toko Online Blibli.com"));
    }
}
