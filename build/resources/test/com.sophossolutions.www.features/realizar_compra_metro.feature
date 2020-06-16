Feature: Realizar compra
  Yo como usuario necesito realizar la compra de un producto

  Scenario: Realizar compra
    Given Necesito realizar una compra
    When Selecciono el producto "PS4 Videojuego Days Gone"
    Then Valido que el producto fue agregado exitosamente "Videojuego Days Gone"