$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/login.feature");
formatter.feature({
  "name": "To validate the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify the facebook login functionality with valid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to launch the chrome browser and hit the fb url",
  "keyword": "Given "
});
formatter.match({
  "location": "FaceBookLogin.user_has_to_launch_the_chrome_browser_and_hit_the_fb_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBookLogin.user_enter_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBookLogin.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBookLogin.user_should_be_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
});