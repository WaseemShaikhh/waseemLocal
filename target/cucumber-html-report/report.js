$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/expertronsweb.feature");
formatter.feature({
  "name": "Testing Expertrons application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing Expertrons Login functionality for valid user",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already haveing application URL",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "also having Valid Mobile number",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user enter valid mobile number,Generate otp",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Expertrons home page will be displayed",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});