#language: es
#Autores: ovargas - hbenavidez

@regresionCargaDirecta

Característica: Autorizaciones de medicamentos - Pruebas de regresión
  Como usuario de Natal Salud, quiero poder generar una solicitud directa de medicamentos

  Antecedentes:
    Dado que el usuario "svcAutomatPsal" esta en la pagina principal de login

  @solicitudDirecta
  Esquema del escenario: Ingreso de la solicitud - Carga de solicitud de medicamentos y derivación a nivel 2
    Cuando selecciona la opción Solicitudes Directas del menu Autorizaciones
    Entonces accede a la pantalla Solicitud Directa
    Cuando ingresa el código de afiliado <afiliado>
    Y selecciona el tipo de Autorización
    Y completa los demás campos obligatorios Email <email>, Situación Terapeutica <situacionTerapeutica>
    E ingresa un Producto <producto> y la cantidad <cantidad>
    Entonces se visualiza debajo del producto agregado el mensaje "Para mayor información sobre el producto, haga click aquí"
    Y agrega un archivo en la sección documentación
    Cuando selecciona Derivar a auditoría médica, indicando que se Deriva a: <auditoriaMedicaNivel>
    Entonces se informa registro exitoso


    Ejemplos:
      | afiliado  | email                            | situacionTerapeutica | diagnostico            | producto | cantidad | auditoriaMedicaNivel |
      | 100302-04 | hbenavidez@ext.sancorseguros.com | Inmunización         | Anticonceptivos Orales | 17887    | 1        | nivel 2              |


  @gestionSolicitud
  Esquema del escenario: Gestión de solicitud - Consulta de la solicitud y aceptar dictamen
    Cuando selecciona la opción Grilla de supervisión del menu Autorizaciones
    Entonces accede a la pantalla Grilla de supervisión de solicitudes
    Cuando consulta una solicitud
    Entonces se muestra la informacion de la solicitud <estado>
    Cuando se gestiona la solicitud y se acepta el dictamen
    Entonces regresa a la pantalla grilla de supervisión de solicitudes pero con el estado: Registrar autorización y notificar

    Ejemplos:
      | estado  |
      | Nivel 2 |

  @gestionSolicitud
  Esquema del escenario: Gestión de solicitud - Solicitud en el estado Registrar Autorización y Notificar
    Cuando selecciona la opción Grilla de supervisión del menu Autorizaciones
    Entonces accede a la pantalla Grilla de supervisión de solicitudes
    Cuando consulta una solicitud
    Entonces se muestra la informacion de la solicitud <estado>
    Cuando se gestiona la solicitud
    Entonces se muestra la información del afiliado, de la solicitud y los productos
    Cuando se registra y notifica
    Entonces se genera la autorización

    Ejemplos:
      | estado                             |
      | Registrar Autorizacion y Notificar |



