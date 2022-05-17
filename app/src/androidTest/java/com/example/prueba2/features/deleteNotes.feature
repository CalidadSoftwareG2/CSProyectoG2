Feature: Eliminar notas
  Para no tener que eliminar todas las notas una a una
  Como usuario
  Quiero poder eliminarlas todas a la vez

  @deleteNotes
  Scenario: Eliminar todas las notas
    Given hay alguna nota en el sistema
    When pulso el botón de eliminar notas
    Then se borran todas las notas de la aplicación


