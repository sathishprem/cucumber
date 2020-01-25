$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "Add Customer feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
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
formatter.step({
  "name": "User click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate add customer module with oneDim list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@ab"
    },
    {
      "name": "@bc"
    }
  ]
});
formatter.step({
  "name": "User enters all the field with oneDim",
  "rows": [
    {
      "cells": [
        "karthi",
        "rajan",
        "kr@gmail.com",
        "tanjore",
        "34562123341"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_enters_all_the_field_with_oneDim(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed customer id",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_should_be_displayed_customer_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "validate add customer module with oneDim list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@bc"
    }
  ]
});
formatter.step({
  "name": "User enters all the field with oneDimMap",
  "rows": [
    {
      "cells": [
        "fname",
        "karthi"
      ]
    },
    {
      "cells": [
        "lname",
        "rajan"
      ]
    },
    {
      "cells": [
        "mail",
        "rajan@gmail.com"
      ]
    },
    {
      "cells": [
        "addr",
        "peravurani"
      ]
    },
    {
      "cells": [
        "phno",
        "12347893533"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_enters_all_the_field_with_oneDimMap(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be displayed customer id",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_should_be_displayed_customer_id()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});