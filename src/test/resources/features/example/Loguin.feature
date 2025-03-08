# language:es
# encoding :UTF-8
@Test
Característica: Quiero validar las excepciones de loguin

  @LoginErroneo
  Esquema del escenario: ingresar a la pagina de orange (credenciales invalidas)
    Dado  que el usuario ingrese a la pagina de orange
    Cuando complete el formulario con la siguiente informacion,luego da clic boton login
      | Usuario   | Password   |
      | <Usuario> | <Password> |
    Entonces visualizara el mensaje de error 'Invalid credentials'

    Ejemplos:
      | Usuario | Password |
      | Prueba  | 123456  |

  @LoginSoloUsuario
  Esquema del escenario: ingresar a la pagina de orange (credencial solo usuario)
    Dado  que el usuario ingrese a la pagina de orange
    Cuando complete el formulario con la siguiente informacion,luego da clic boton login
      |Usuario|Password|
      |<Usuario>|<Password>|
    Entonces vera el mensaje en el campo Username 'Required'

    Ejemplos:
      | Usuario | Password |
      | Prueba1 |          |

  @LoginVacio
  Esquema del escenario: ingresar a la pagina de orange con credenciales vacias
   Dado  que el usuario ingrese a la pagina de orange
    Cuando complete el formulario con la siguiente informacion,luego da clic boton login
      |Usuario|Password|
      |<Usuario>| <Password> |
    Entonces vera el mensaje en los campos Username y Password 'Required'
    Ejemplos:
      |Usuario  |Password |
      |        |            |