$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "LoginFeature",
  "description": "deals with login functionality",
  "id": "loginfeature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3181271882,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login with correct username and password",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter user email address as Email:admin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter following for login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ],
      "line": 9
    },
    {
      "cells": [
        "admin2",
        "adminpass2"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "should see userform page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.navigateToLoginPage()"
});
formatter.result({
  "duration": 1599259363,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 34
    }
  ],
  "location": "LoginSteps.enterUserEmailAddressAsEmailAdmin(String)"
});
formatter.result({
  "duration": 12570087,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enterUsernameAndPassword(DataTable)"
});
formatter.result({
  "duration": 306313006,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "duration": 386461063,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.shouldSeeUserformPage()"
});
formatter.result({
  "duration": 34468301,
  "status": "passed"
});
formatter.after({
  "duration": 83268363,
  "status": "passed"
});
formatter.before({
  "duration": 2170139414,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login with correct username and password to fail",
  "description": "",
  "id": "loginfeature;login-with-correct-username-and-password-to-fail",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "navigate to login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "enter following for login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 17
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ],
      "line": 18
    },
    {
      "cells": [
        "admin2",
        "adminpass2"
      ],
      "line": 19
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "should see userform page wrongly",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.navigateToLoginPage()"
});
formatter.result({
  "duration": 1361281749,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enterUsernameAndPassword(DataTable)"
});
formatter.result({
  "duration": 472926956,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "duration": 384356293,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.shouldSeeUserformPageWrongly()"
});
formatter.result({
  "duration": 36755021,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"aaadsdsd\"}\n  (Session info: chrome\u003d63.0.3239.84)\n  (Driver info: chromedriver\u003d2.34.522940 (1a76f96f66e3ca7b8e57d503b4dd3bccfba87af1),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027DESKTOP-KHDQ4OS\u0027, ip: \u002710.22.91.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.34.522940 (1a76f96f66e3ca..., userDataDir: C:\\Users\\BASIAE~1\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.84, webStorageEnabled: true}\nSession ID: efac87dec630cffc58ccea721701927f\n*** Element info: {Using\u003did, value\u003daaadsdsd}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:417)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:218)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat steps.LoginSteps.shouldSeeUserformPageWrongly(LoginSteps.java:56)\r\n\tat ✽.Then should see userform page wrongly(Login.feature:21)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 107399348,
  "status": "passed"
});
});