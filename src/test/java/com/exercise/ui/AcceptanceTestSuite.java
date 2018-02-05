package com.exercise.ui;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.ArrayList;
import java.util.List;

public class AcceptanceTestSuite extends SerenityStories {

    @Override
    public List<String> storyPaths() {
        List<String> stories = new ArrayList<>();
        stories.add("stories/consult_dictionary/AddQuote.story");
        return stories;
    }
}
