# language:es
# encoding :UTF-8

Característica: Quiero Modificar usuarios

  @ModificarUsuarioAdmin
  Esquema del escenario: Ingresar a OrangeHRM y modificar un usuario
    Dado que el usuario se encuentra en la pagina de orange
    Cuando hace login
      | Usuario  | Password  |
      | <Usuario> | <Password> |
    Y busque el usuario "<NuevoUsuario>"
    Entonces modificara el usuario "<Usuario1>", "<ClaveNueva>", "<ConfirmarClave>"
    Ejemplos:
      | Usuario | Password | NuevoUsuario   | Usuario1          | ClaveNueva    | ConfirmarClave |
      | Admin   | admin123 | 1ALEJANDRO1234 | 098ALEJANDRO12345 | 098Alejo12345 | 098Alejo12345  |


