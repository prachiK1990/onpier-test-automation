$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/onpierOnboarding.feature");
formatter.feature({
  "name": "Onpier web application for onboarding",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creating application for Private Person",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User navigates to landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User selects Pramie beantragen button",
  "keyword": "When "
});
formatter.step({
  "name": "User Upload Files",
  "keyword": "When "
});
formatter.step({
  "name": "User verifies that Enter Personal Information page is loaded",
  "keyword": "Then "
});
formatter.step({
  "name": "User selects Private person radio button",
  "keyword": "When "
});
formatter.step({
  "name": "User verifies that Company name and Sales tax ID field should not be dispalyed",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters data in fields for Private Person \u003cAnrede\u003e and \u003cVorname\u003e and \u003cNachname\u003e and \u003cE-mail\u003e and \u003cKontoinhaber\u003e and \u003cIBAN\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Next button and verifies Personal details are correctly captured in Third page \u003cAnrede\u003e and \u003cVorname\u003e and \u003cNachname\u003e and \u003cE-mail\u003e and \u003cKontoinhaber\u003e and \u003cIBAN\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Anrede",
        "Vorname",
        "Nachname",
        "E-mail",
        "Kontoinhaber",
        "IBAN"
      ]
    },
    {
      "cells": [
        "Frau",
        "Kapoor",
        "Prachi",
        "xyz@pqr.com",
        "Poonam Kapoor",
        "DE68500105178297336485"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating application for Private Person",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.verifyLanding()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Pramie beantragen button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userSelectsPramieBeantragenButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Upload Files",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userUploadFiles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that Enter Personal Information page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userVerfiesPersonalInformationLoadedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Private person radio button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userSelectPrivateRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that Company name and Sales tax ID field should not be dispalyed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userVerifiesCompanynameSalesTaxIdNotDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters data in fields for Private Person Frau and Kapoor and Prachi and xyz@pqr.com and Poonam Kapoor and DE68500105178297336485",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userEntersDataInFieldsForPivatePerson(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Next button and verifies Personal details are correctly captured in Third page Frau and Kapoor and Prachi and xyz@pqr.com and Poonam Kapoor and DE68500105178297336485",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userVerifyDataCapturedInThirdPage(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Creating application for Company",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@last"
    }
  ]
});
formatter.step({
  "name": "User navigates to landing page",
  "keyword": "Given "
});
formatter.step({
  "name": "User selects Pramie beantragen button",
  "keyword": "When "
});
formatter.step({
  "name": "User Upload Files",
  "keyword": "When "
});
formatter.step({
  "name": "User verifies that Enter Personal Information page is loaded",
  "keyword": "Then "
});
formatter.step({
  "name": "User selects Unternehmen radio button",
  "keyword": "When "
});
formatter.step({
  "name": "User verifies that Company name and Sales tax ID field should be dispalyed",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters data in fields Company name and Sales tax ID \u003cCompany_Name\u003e \u003cSales_Tax_ID\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User enters data in fields for Private Person \u003cAnrede\u003e and \u003cVorname\u003e and \u003cNachname\u003e and \u003cE-mail\u003e and \u003cKontoinhaber\u003e and \u003cIBAN\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks Next button and verifies Personal details of Company are correctly captured in Third page \u003cCompany_Name\u003e and \u003cSales_Tax_ID\u003e and \u003cAnrede\u003e and \u003cVorname\u003e and \u003cNachname\u003e and \u003cE-mail\u003e and \u003cKontoinhaber\u003e and \u003cIBAN\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Anrede",
        "Vorname",
        "Nachname",
        "E-mail",
        "Kontoinhaber",
        "IBAN",
        "Company_Name",
        "Sales_Tax_ID"
      ]
    },
    {
      "cells": [
        "Frau",
        "Kapoor",
        "Prachi",
        "xyz@pqr.com",
        "Poonam Kapoor",
        "DE68500105178297336485",
        "Tata Concultancy Services",
        "DE324235456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating application for Company",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@last"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.verifyLanding()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Pramie beantragen button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userSelectsPramieBeantragenButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Upload Files",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userUploadFiles()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that Enter Personal Information page is loaded",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userVerfiesPersonalInformationLoadedSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Unternehmen radio button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userSelectUnternehmenRadioButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies that Company name and Sales tax ID field should be dispalyed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userVerifiesCompanynameSalesTaxIdDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters data in fields Company name and Sales tax ID Tata Concultancy Services DE324235456",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userEntersDataInFieldsForCompany(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters data in fields for Private Person Frau and Kapoor and Prachi and xyz@pqr.com and Poonam Kapoor and DE68500105178297336485",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userEntersDataInFieldsForPivatePerson(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Next button and verifies Personal details of Company are correctly captured in Third page Tata Concultancy Services and DE324235456 and Frau and Kapoor and Prachi and xyz@pqr.com and Poonam Kapoor and DE68500105178297336485",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OnpierSteps.userVerifyCompanyDataCapturedInThirdPage(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});