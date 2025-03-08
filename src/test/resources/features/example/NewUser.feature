# language:es
# encoding :UTF-8

Característica: Quiero registrar usuarios

  @CrearUsuarioAdmin
  Esquema del escenario:ingresar a la pagina de orange
    Dado que el usuario ingresa a orange
    Cuando ingrese los datos correctos,luego da clic boton login
      | Usuario  | Password  |
      | <Usuario> | <Password> |
    Entonces ingresara un nuevo usuario "<EmployeeName>", "<NuevoUsuario>", "<Clave>", "<ConfirmarClave>"

    Ejemplos:
      | Usuario | Password | EmployeeName | NuevoUsuario   | Clave        | ConfirmarClave |
      | Admin   | admin123 | F            | 1ALEJANDRO1234 | Alejandro123 | Alejandro123   |


