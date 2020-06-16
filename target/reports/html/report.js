$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com.sophossolutions.www.features/realizar_compra_metro.feature");
formatter.feature({
  "name": "Realizar compra",
  "description": "  Yo como usuario necesito realizar la compra de un producto",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Realizar compra",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Necesito realizar una compra",
  "keyword": "Given "
});
formatter.match({
  "location": "RealizarCompraMetroStepDefinition.necesitoRealizarUnaCompra()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selecciono el producto \"PS4 Videojuego Days Gone\"",
  "keyword": "When "
});
formatter.match({
  "location": "RealizarCompraMetroStepDefinition.seleccionoElProducto(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valido que el producto fue agregado exitosamente \"Videojuego Days Gone\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RealizarCompraMetroStepDefinition.validoQueElProductoFueAgregadoExitosamente(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: \r\nExpected: \"Videojuego Days Gone\"\r\n     but: was \"PS4 Videojuego Days Gone\"\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:301)\r\n\tat com.sophossolutions.www.steps.RealizarCompraMetroStepDefinition.validoQueElProductoFueAgregadoExitosamente(RealizarCompraMetroStepDefinition.java:45)\r\n\tat ✽.Valido que el producto fue agregado exitosamente \"Videojuego Days Gone\"(src/test/resources/com.sophossolutions.www.features/realizar_compra_metro.feature:7)\r\n",
  "status": "failed"
});
});