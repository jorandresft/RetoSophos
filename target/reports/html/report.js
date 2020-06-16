$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com.sophossolutions.www.features/get_rest_photos.feature");
formatter.feature({
  "name": "Ejecutar servicio de consulta Rest",
  "description": "  Yo como usuario necesito realizar una consulta de un servicio Rest\n  para validar el contenido de la respuesta",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Consultar photos por id",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Necesito consultar una photo en \u003curl\u003e",
  "keyword": "Given "
});
formatter.step({
  "name": "El id de la photo es \u003cid\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Valido el album con id \u003calbumId\u003e y el title sea \u003ctitle\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url",
        "id",
        "albumId",
        "title"
      ]
    },
    {
      "cells": [
        "\"https://gorest.co.in/public-api/photos/\"",
        "19",
        "1533",
        "\"Sit adipisci qui quibusdam quos provident eos error. Voluptas incidunt non aut consequatur.\""
      ]
    },
    {
      "cells": [
        "\"https://gorest.co.in/public-api/photos/\"",
        "55",
        "1906",
        "\"A Omnis et amet fugit tempore suscipit esse et. Illum dolor aut nostrum deserunt enim.\""
      ]
    }
  ]
});
formatter.scenario({
  "name": "Consultar photos por id",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Necesito consultar una photo en \"https://gorest.co.in/public-api/photos/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "GetRestPhostosStepDefinition.necesitoConsultarUnaPhotoEn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El id de la photo es 19",
  "keyword": "When "
});
formatter.match({
  "location": "GetRestPhostosStepDefinition.elIdDeLaPhotoEs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido el album con id 1533 y el title sea \"Sit adipisci qui quibusdam quos provident eos error. Voluptas incidunt non aut consequatur.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GetRestPhostosStepDefinition.validoElAlbumConIdYElTitleSea(int,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nJSON path result.album_id doesn\u0027t match.\nExpected: 1533\n  Actual: 1532\n\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:301)\r\n\tat com.sophossolutions.www.steps.GetRestPhostosStepDefinition.validoElAlbumConIdYElTitleSea(GetRestPhostosStepDefinition.java:36)\r\n\tat ✽.Valido el album con id 1533 y el title sea \"Sit adipisci qui quibusdam quos provident eos error. Voluptas incidunt non aut consequatur.\"(src/test/resources/com.sophossolutions.www.features/get_rest_photos.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Consultar photos por id",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Necesito consultar una photo en \"https://gorest.co.in/public-api/photos/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "GetRestPhostosStepDefinition.necesitoConsultarUnaPhotoEn(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "El id de la photo es 55",
  "keyword": "When "
});
formatter.match({
  "location": "GetRestPhostosStepDefinition.elIdDeLaPhotoEs(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido el album con id 1906 y el title sea \"A Omnis et amet fugit tempore suscipit esse et. Illum dolor aut nostrum deserunt enim.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GetRestPhostosStepDefinition.validoElAlbumConIdYElTitleSea(int,String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nJSON path result.title doesn\u0027t match.\nExpected: A Omnis et amet fugit tempore suscipit esse et. Illum dolor aut nostrum deserunt enim.\n  Actual: Omnis et amet fugit tempore suscipit esse et. Illum dolor aut nostrum deserunt enim.\n\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:301)\r\n\tat com.sophossolutions.www.steps.GetRestPhostosStepDefinition.validoElAlbumConIdYElTitleSea(GetRestPhostosStepDefinition.java:40)\r\n\tat ✽.Valido el album con id 1906 y el title sea \"A Omnis et amet fugit tempore suscipit esse et. Illum dolor aut nostrum deserunt enim.\"(src/test/resources/com.sophossolutions.www.features/get_rest_photos.feature:8)\r\n",
  "status": "failed"
});
});