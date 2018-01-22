Feature REST testing examples

  Scenario: Testing get for all countries
    Given endpoint for getting countries
    When response status is equal 200
#    Then list of all countries is displayed

#    Scenario: Testing get for given country
#      Given Country ISO
#      When response status is equal 200
#      Then display details of selected country