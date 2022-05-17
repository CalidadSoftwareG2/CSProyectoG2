Feature: Eliminar carpetas
  Para no tener que eliminar todas las carpetas una a una
  Como usuario
  Quiero poder eliminarlas todas a la vez

  @deleteFolders
  Scenario: Eliminar todas las carpetas
    Given hay alguna carpeta en el sistema
    When pulso el botón de eliminar carpetas
    Then se borran todas las carpetas de la aplicación


