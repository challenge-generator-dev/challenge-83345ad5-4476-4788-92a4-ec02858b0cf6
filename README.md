# Construcción de API REST para ordenes

Construye una API REST en Spring Boot que permita a los usuarios visualizar y filtrar ordenes por estado. La API debe manejar el estado y los errores adecuadamente.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | servidor (API y lógica de negocio) |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 10 horas |

## Stack

- **Lenguaje:** Java
- **Framework:** Spring Boot 3.5
- **Version:** Java 17

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Tener el proyecto base del reto funcionando en tu máquina: clonar el repositorio, instalar las herramientas y verificar que compila y arranca antes de empezar a practicar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Instala las herramientas para ejecutar el proyecto: JDK 17+ y Maven 3.9+.
- Clona el repositorio del reto (el enlace viene en la entrega del reto y en la sección "Repositorio del Proyecto" del PDF) y ábrelo en tu IDE.
- Instala las dependencias y compila ejecutando `mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package` en la raíz del repositorio.
- Confirma que el comando termina sin errores: el proyecto arranca y sus pruebas corren.
- Ubica los archivos de práctica: son los que contienen `TODO(reto)` (búscalos en el repositorio). Lee el README.md y el AGENTS.md antes de empezar.

**Entregable:** El proyecto compila/arranca sin errores con `mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package`.

<details>
<summary>Pistas de conocimiento</summary>

- Los archivos con `TODO(reto)` son el ejercicio: el resto del repositorio ya está resuelto y no hace falta tocarlo.
- Si el comando de verificación falla, revisa la versión de las herramientas instaladas antes de modificar código.
- AGENTS.md describe el reto, el comando de verificación y las reglas del repositorio.

</details>

### Fase 1: Definición de la API

**Objetivo:** Definir y documentar la estructura de la API REST.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica los endpoints necesarios para visualizar y filtrar ordenes.
- Documenta cada endpoint con los métodos HTTP permitidos, parámetros de entrada y posibles respuestas.

**Entregable:** Documentación de la API REST con endpoints definidos y documentados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los diferentes estados de las ordenes y cómo se pueden filtrar.

</details>

### Fase 2: Implementación de la API

**Objetivo:** Implementar los endpoints definidos en la fase anterior.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Crea los controladores necesarios para cada endpoint.
- Implementa la lógica de negocio para manejar las peticiones y respuestas.
- Asegura que la API maneje adecuadamente los errores y las excepciones.

**Entregable:** API REST implementada con los endpoints necesarios para visualizar y filtrar ordenes.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza buenas prácticas de Spring Boot para estructurar tu código.
- Considera cómo manejar los errores y las excepciones de manera efectiva.

</details>

### Fase 3: Pruebas y optimización

**Objetivo:** Realizar pruebas unitarias y de integración para asegurar la calidad de la API.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Escribe pruebas unitarias para cada controlador y servicio.
- Realiza pruebas de integración para asegurar que los endpoints funcionen correctamente.
- Optimiza el rendimiento de la API si es necesario.

**Entregable:** API REST con pruebas unitarias y de integración realizadas, y optimizada si es necesario.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza herramientas de testing como JUnit y Mockito para escribir tus pruebas.
- Considera cómo puedes optimizar el rendimiento de la API sin comprometer la calidad.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una API REST y por qué se usa en este contexto?
- **paraQueSirve**: ¿Para qué sirve cada endpoint definido en la API?
- **comoSeUsa**: ¿Cómo se usa Spring Boot para implementar la API?
- **erroresComunes**: ¿Cuáles son los errores comunes que pueden ocurrir al implementar una API REST y cómo se manejan?
- **queDecisionesImplica**: ¿Qué decisiones de diseño implica la implementación de la API y cómo afectan al rendimiento y la mantenibilidad?

## Criterios de Evaluacion

- Definición y documentación de la API REST.
- Implementación de los endpoints definidos.
- Manejo de errores y excepciones en la API.
- Realización de pruebas unitarias y de integración.
- Optimización del rendimiento de la API.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT) si no tenes un agente en el IDE. Declara lo mismo que AGENTS.md; los archivos que te devuelva el chat los guardas en esta carpeta respetando las rutas.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Herramientas

- **React**: Tecnologia pedida sin componente propio en este reto: el ejercicio no la construye, pero queda como contexto del pedido.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
