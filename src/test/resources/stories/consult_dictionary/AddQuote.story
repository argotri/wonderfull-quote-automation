Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Add Quote Scenario
Given user is on wonderful quote website
When user input quote 'The two most powerful warriors are patience and time'
And user input Author 'Leo Tolstoy'
And user choose background color 'yellow'
And user click button Add Quote
Then total quotes should be '6'
When user click table view
And user hover on blue button
Then the table should be appear
When user hover on red button
Then the table should dissapear
When user click on green button
Then the table should be appear after 10 seconds
When user click on source link
Then user should get the browser open brainyquote website on new tab
When user click on blibli link
Then user should get browser open blibli on new window