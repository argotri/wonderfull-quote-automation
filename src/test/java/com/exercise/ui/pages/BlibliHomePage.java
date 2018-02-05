package com.exercise.ui.pages;

import net.thucydides.core.pages.PageObject;

public class BlibliHomePage extends PageObject {

    public String getTitle(){
        return getDriver().getTitle();
    }

}
