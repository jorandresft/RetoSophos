Feature: Ejecutar servicio de consulta Rest
  Yo como usuario necesito realizar una consulta de un servicio Rest
  para validar el contenido de la respuesta

  Scenario Outline: Consultar photos por id
    Given Necesito consultar una photo en <url>
    When El id de la photo es <id>
    Then Valido el album con id <albumId> y el title sea <title>

    Examples:
      | url                                       | id   | albumId | title                                                                                        |
      | "https://gorest.co.in/public-api/photos/" | 19   | 1533    | "Sit adipisci qui quibusdam quos provident eos error. Voluptas incidunt non aut consequatur."|
      | "https://gorest.co.in/public-api/photos/" | 55   | 1906    | "A Omnis et amet fugit tempore suscipit esse et. Illum dolor aut nostrum deserunt enim."       |