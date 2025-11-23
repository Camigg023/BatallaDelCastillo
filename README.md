# BatallaDelCastillo
Sistema de coordinacion estrategica del cuerpo de cazadores

**Examen Final – Construcción de Software 2**  
**Por:** Camila Gómez Gómez  
**Tecnologías utilizadas:** Java · Spring Boot · MySQL · NetBeans

Descripción del proyecto

El proyecto consiste en un sistema de coordinación estratégica para el Cuerpo de Cazadores durante la Batalla del Castillo Infinito. Su objetivo principal es gestionar y procesar información táctica proveniente de los pilares, permitiendo la toma de decisiones eficiente en tiempo real.

El sistema permite:

**Registrar y actualizar la posición de los pilares en el campo de batalla.**
**Registrar mensajes tácticos fragmentados enviados desde los pilares.**
**Reconstruir mensajes completos a partir de fragmentos.**
**Calcular posiciones trianguladas para determinar ubicaciones exactas de eventos o amenazas.**

Funcionamiento

Los pilares envían mensajes al sistema, que pueden llegar fragmentados.
El sistema almacena y procesa estos mensajes, reconstruyéndolos de manera automática para garantizar información coherente.
Los casos de uso incluyen registrar mensajes, actualizar posiciones de pilares y calcular triangulaciones dinámicas.
La información procesada puede consultarse mediante solicitudes al sistema, como obtener datos de pilares, reconstruir mensajes o calcular posiciones trianguladas.

