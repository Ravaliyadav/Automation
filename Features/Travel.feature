Feature:Test Php Travels Application
Scenario: to test Register page of Travels
Given Open chrome browser and the url
When enter all mandatory fields
Then Register Successfully

Scenario: to test Login page of Travels
Given Details are Registered
When enter email&password
Then Login Successfully

Scenario: to test Home page of Travels
Given opens the dashboard
When view cart is clicked
Then Registered details are displayed
