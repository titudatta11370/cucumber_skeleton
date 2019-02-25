$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/google.feature");
formatter.feature({
  "name": "google site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Google",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to google site",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iGoToGoogleSite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search for \"item\"",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.iSearchFor(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});