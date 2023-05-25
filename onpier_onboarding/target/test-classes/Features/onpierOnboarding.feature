Feature: Onpier web application for onboarding
  Scenario Outline: Creating application for Private Person
    Given User navigates to landing page
    When User selects Pramie beantragen button
    When User Upload Files
    Then User verifies that Enter Personal Information page is loaded
    When User selects Private person radio button
    Then User verifies that Company name and Sales tax ID field should not be dispalyed
    And User enters data in fields for Private Person <Anrede> and <Vorname> and <Nachname> and <E-mail> and <Kontoinhaber> and <IBAN>
    Then User clicks Next button and verifies Personal details are correctly captured in Third page <Anrede> and <Vorname> and <Nachname> and <E-mail> and <Kontoinhaber> and <IBAN>
   
 
 Examples: 
      | Anrede |Vorname  |Nachname| E-mail      |Kontoinhaber |IBAN|
      | Frau   | Kapoor  |Prachi  |xyz@pqr.com |Poonam Kapoor |DE68500105178297336485|  
    
 @last
 Scenario Outline: Creating application for Company
    Given User navigates to landing page
    When User selects Pramie beantragen button
    When User Upload Files
    Then User verifies that Enter Personal Information page is loaded
    When User selects Unternehmen radio button
    Then User verifies that Company name and Sales tax ID field should be dispalyed
    And User enters data in fields Company name and Sales tax ID <Company_Name> <Sales_Tax_ID>
    And User enters data in fields for Private Person <Anrede> and <Vorname> and <Nachname> and <E-mail> and <Kontoinhaber> and <IBAN>
    Then User clicks Next button and verifies Personal details of Company are correctly captured in Third page <Company_Name> and <Sales_Tax_ID> and <Anrede> and <Vorname> and <Nachname> and <E-mail> and <Kontoinhaber> and <IBAN>
   
  Examples: 
      | Anrede |Vorname  |Nachname| E-mail      |Kontoinhaber |IBAN                  |Company_Name               |Sales_Tax_ID|
      | Frau   | Kapoor  |Prachi  |xyz@pqr.com |Poonam Kapoor |DE68500105178297336485|  Tata Concultancy Services|DE324235456 |
    