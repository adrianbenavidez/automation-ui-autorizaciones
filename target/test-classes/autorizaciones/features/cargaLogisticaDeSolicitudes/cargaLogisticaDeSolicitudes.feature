#language: es
#Autores: mmusso
@estabilidad

Característica: Pruebas Estabilidad
  Como usuario de Natal Salud, quiero poder cargar una solicitud logística

  Antecedentes:
    Dado que el usuario "svcAutomatPsal" esta en la pagina principal de login

  #Precondición->Login + acceso a natal.

  #HYQA-78685	01- Solicitud de Autorización - Carga Logística(Crear Solicitud)
  #OK
  @estabilidad-Caso1-CrearSolicitudLogistica
  Esquema del escenario: 01- Solicitud de Autorización - Carga Logística
    Cuando selecciona la opcion Carga Logistica de Solicitudes del menu Autorizaciones
    E ingresa afiliado <afiliado>
    Y carga una solicitud del tipo <tipo solicitud>
    Entonces visualiza un mensaje indicando que la solicitud se creo correctamente
    Ejemplos:gi
      | afiliado  | tipo solicitud          |
      #Practica Ambulatoria
      | 1000-02 | Practica Ambulatoria      |

  @estabilidad:Caso2Versubmenúdirecta
  Escenario: 02- Solicitud de Autorización - Solicitud directa
    Cuando selecciona la opcion solicitudes directas del menu Autorizaciones
    Entonces visualiza un mensaje que se encuentra en el submenú de directas

  @estabilidad-Caso3-VerCargarSolicitudReintegro
  Escenario: 03 - Menú Reintegros - SubMenú Cargar solicitud de reintegro
    Cuando selecciona la opcion Carga solicitud de reintegro del menu Reintegro
    Entonces visualiza un mensaje indicando que se encuentre el submenu cagar solicitud de reintegro

  @estabilidad-Caso4-NuevoProcesoBatch
  Escenario: 04 - Menú Procesos Batch - Nuevo Proceso
    Cuando selecciona la opcion Nuevo proceso del menú procesos batch
    Entonces visualiza un mensaje indicando que se encuentre el submenu nuevo poceso del menú procesos batch

  @estabilidad-Caso5-ListaBatchs
  Escenario: 05 - Menú Procesos Batch - Lista de Procesos
    Cuando selecciona la opcion Listas de procesos del menú procesos batch
    Entonces visualiza un mensaje indicando que se encuentre el submenu listas de pocesos del menú procesos batch

  @estabilidad-Caso6-GestiónAfiliados
  Escenario: 06 - Menú Afiliaciones - Gestión de afiliados
    Cuando selecciona la opcion Gestión de afiliados del menú Afiliaciones
    Entonces visualiza un mensaje indicando que se encuentre el submenu gestión de afiliados del menú afiliaciones

