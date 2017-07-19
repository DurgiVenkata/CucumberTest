$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features\\gmail.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 3,
  "name": "I Want Test Gmail Functionality",
  "description": "",
  "id": "i-want-test-gmail-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@gmailfeature"
    }
  ]
});
formatter.scenario({
  "line": 14,
  "name": "Checking Inbox Value",
  "description": "",
  "id": "i-want-test-gmail-functionality;checking-inbox-value;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@gmailfeature"
    },
    {
      "line": 5,
      "name": "@gmailinbox"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I want to open webdriver and connect to the gmail login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter userid as \"ravi.venkat50@gmail.com\"  and click next button",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I enter password as \"guntur@123\" and click submit button",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I verify the inbox",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps101.I_want_to_open_webdriver_and_connect_to_the_gmail_login_page()"
});
formatter.result({
  "duration": 16377271204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravi.venkat50@gmail.com",
      "offset": 19
    }
  ],
  "location": "Steps101.I_enter_userid_as_and_click_next_button(String)"
});
formatter.result({
  "duration": 3253539479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "guntur@123",
      "offset": 21
    }
  ],
  "location": "Steps101.I_enter_password_as_and_click_submit_button(String)"
});
formatter.result({
  "duration": 10684232980,
  "status": "passed"
});
formatter.match({
  "location": "Steps101.I_verify_the_inbox()"
});
formatter.result({
  "duration": 1330013294,
  "status": "passed"
});
});