$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resource/com/restservice/dao/runner/calculator.feature");
formatter.feature({
  "id": "calculator",
  "description": "As a user\r\nI want to use a calculator\r\nSo that I don\u0027t need to calculate myself",
  "name": "Calculator",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 3367613,
  "status": "passed"
});
formatter.scenario({
  "id": "calculator;add-two-numbers",
  "description": "",
  "name": "Add two numbers",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I have a calculator",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I add 2 and 3",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "the result should be 5",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "CalculatorDAOSteps.i_have_a_calculator()"
});
formatter.result({
  "duration": 136759845,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    },
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "CalculatorDAOSteps.i_add_and(int,int)"
});
formatter.result({
  "duration": 2061995970,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 21
    }
  ],
  "location": "CalculatorDAOSteps.the_result_should_be(int)"
});
formatter.result({
  "duration": 193634,
  "status": "passed"
});
});