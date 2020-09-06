Feature: Como cliente, quiero ingresar las credenciales de mi cuenta, para ingresar en este sitio de compras


  @Login
  Scenario: el cliente inicia sesión en el sitio de compras
    Given El cliente se encuentra en la página de home
    When el cliente hace click en el botón sign in
    Then el cliente verifica que fue redireccionado a la pantalla login

    When el cliente ingresa su email: direccionfalsa1@live.com
    And el cliente ingresa su password: 12345
    And el cliente hace click en el botón sign in.
    Then el cliente verifica que fue redireccionado a la pantalla My Account

