Feature: Place API validation

Scenario: validate user add new place on server
Given: user create a payload
When: user send post request
Then: user validate status code
And: Validate response body attribute
