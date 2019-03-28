$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "A user can register to create a new account",
  "description": "",
  "id": "a-user-can-register-to-create-a-new-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Successful Registration",
  "description": "",
  "id": "a-user-can-register-to-create-a-new-account;successful-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@REGISTRATION"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user fills out the registration form",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "clicks register",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged in after submitting the registration form \"\u003cTestname\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "a-user-can-register-to-create-a-new-account;successful-registration;",
  "rows": [
    {
      "cells": [
        "Testname"
      ],
      "line": 17,
      "id": "a-user-can-register-to-create-a-new-account;successful-registration;;1"
    },
    {
      "cells": [
        "Success"
      ],
      "line": 18,
      "id": "a-user-can-register-to-create-a-new-account;successful-registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "launching app",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.launchBrowser()"
});
formatter.result({
  "duration": 3312770864,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Successful Registration",
  "description": "",
  "id": "a-user-can-register-to-create-a-new-account;successful-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@REGISTRATION"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "user fills out the registration form",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "clicks register",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be logged in after submitting the registration form \"Success\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_fills_out_the_registration_form()"
});
formatter.result({
  "duration": 31814070077,
  "error_message": "java.lang.NullPointerException\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\n\tat PageObjects.RegistrationPage.enterConfirmPassword(RegistrationPage.java:120)\n\tat Steps.Steps.user_fills_out_the_registration_form(Steps.java:97)\n\tat ✽.Given user fills out the registration form(Registration/Registration.feature:11)\n",
  "status": "failed"
});
formatter.match({
  "location": "Steps.clicks_register()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Success",
      "offset": 65
    }
  ],
  "location": "Steps.user_should_be_logged_in_after_submitting_the_registration_form(String)"
});
formatter.result({
  "status": "skipped"
});
});