#Sample Feature Definition Template
@gmailfeature
Feature: I Want Test Gmail Functionality

  @gmailinbox
  Scenario Outline: Checking Inbox Value
    Given I want to open webdriver and connect to the gmail login page
    When I enter userid as "<userid>"  and click next button
    And I enter password as "<password>" and click submit button
    Then I verify the inbox

    Examples: 
      | userid                  | password    |
      | ravi.venkat50@gmail.com | guntur@123  |
     # | sapravi57@gmail.com     | Reliance123 |
      #| samba65@gmail.com       | samba123    |
     # | uiravi57@gmail.com      | Naresh123   |
     # | selenium57@gmail.com    | selenium123 |
