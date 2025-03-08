# language:es
# encoding :UTF-8

Característica: Quiero Eliminar un usuarios

  @oAdminEliminarUsuari
  Esquema del escenario: Ingresar a OrangeHRM y eliminar un usuario
    Dado que el usuario esta en la pagina
    Y hace login en orange
      | Usuario   | Password    |
      | <Usuario> | <Password>  |
    Cuando busque un usuario registrado "<NuevoUsuario>"
    Entonces dara clic en la opcion eliminar y confirmara la eliminacion
    Ejemplos:
      | Usuario | Password | NuevoUsuario      |
      | Admin   | admin123 | 098ALEJANDRO12345 |


