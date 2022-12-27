$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Windows 11/eclipse-workspace/Cucumber-new/src/test/resources/Features/Tv.feature");
formatter.feature({
  "name": "Tv",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv purchage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    },
    {
      "name": "@tv1"
    }
  ]
});
formatter.step({
  "name": "user search Tv",
  "keyword": "When "
});
formatter.match({
  "location": "TvSearch.user_search_Tv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the Tv",
  "keyword": "And "
});
formatter.match({
  "location": "TvSearch.user_choose_the_Tv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user doing payment by using UPI2",
  "keyword": "And "
});
formatter.match({
  "location": "TvSearch.user_doing_payment_by_using_UPI2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receives confirmation message2",
  "keyword": "Then "
});
formatter.match({
  "location": "TvSearch.user_receives_confirmation_message2()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});