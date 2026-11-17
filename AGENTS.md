# AGENTS.md

Instrucciones para el agente de IA que abra este repositorio (Claude Code, Cursor, Codex, Copilot, Gemini). Se cargan solas: no hay que pegar nada en ningun chat.

## Que es este repositorio

Es el codigo base de un reto de aprendizaje de Pragma: **Construcción de API REST para ordenes**.

| | |
|---|---|
| Tema | servidor (API y lógica de negocio) |
| Nivel | senior-l2 |
| Chapter | Backend |
| Especialidad | Java |
| Stack | Java / Spring Boot 3.5 |
| Patron arquitectonico | capas estándar (dominio, aplicación, infraestructura) |
| Tiempo estimado | 10 horas |

## Herramientas

- **React**: Tecnologia pedida sin componente propio en este reto: el ejercicio no la construye, pero queda como contexto del pedido.

## Receta del stack

Esqueleto obligatorio:

- `pom.xml en la raiz`
- `clase con @SpringBootApplication`
- `application.yml en src/main/resources`
- `capa de dominio con entidades y puertos`
- `capa de aplicacion con casos de uso`
- `capa de infraestructura con adaptadores y @RestController`

Trampas conocidas:

- TODA `<version>` del pom va con tres segmentos: la del parent (ej. `3.5.6`) y la de cada dependencia que la lleve (ej. Resilience4j `2.2.0`). `3.4` y `2.0` no existen como artefacto y el build muere resolviendo dependencias.
- Las dependencias que el parent POM gestiona van SIN `<version>`: `spring-boot-starter-web`, `-data-jpa`, `-validation`, `-test`, etc.
- Resilience4j publica un artefacto por linea de Spring Boot. Con Spring Boot 3 va `resilience4j-spring-boot3` con version de tres segmentos (ej. `2.2.0`, no `2.0`). `resilience4j-spring-boot2` es de Spring Boot 2 y rompe el arranque.
- Si usas anotaciones de validacion (`@NotNull`, `@Size`, `@Positive`) declara `spring-boot-starter-validation`: el starter web no las trae.
- El `spring-boot-maven-plugin` tiene que estar en `<build><plugins>` o no se empaqueta ejecutable.
- Spring Boot 3 usa `jakarta.*`, nunca `javax.*`.
- Cada archivo empieza con su `package` y con un `import` por cada clase del proyecto que viva en otro paquete. Usar `PaymentService` desde `infrastructure` sin `import com.x.application.PaymentService` no compila.

Dependencias:

- org.springframework.boot:spring-boot-starter-web
- org.springframework.boot:spring-boot-starter-test
- com.h2database:h2
- org.springdoc:springdoc-openapi-starter-webmvc-ui 2.10.0
- org.springframework.boot:spring-boot-starter-actuator
- org.springframework.boot:spring-boot-starter-data-jpa
- org.springframework.boot:spring-boot-starter-validation

## Tu tarea

Dejar este proyecto en estado **verificable**: que el comando de verificacion corra sin errores. Escribi los archivos en disco, en este repositorio. No generes ZIPs ni archivos adjuntos.

En orden:

1. Corre `mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package` y mira que falla.
2. Completa lo que falte de la lista de abajo: manifiesto de dependencias, punto de entrada, capa de interfaz y las capas del patron declarado.
3. Arregla SOLO los errores que impiden compilar o arrancar.
4. Volve a correr `mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package` hasta que pase.
5. Pará ahí.

## Regla dura: las fases son trabajo del humano

**PROHIBIDO implementar los entregables de las fases.** El valor del reto esta en que la persona los resuelva. Tu trabajo es que tenga un proyecto que arranca; el hueco pedagogico se queda como esta.

No resuelvas nada de esto:

- **Fase 1 — Definición de la API**: Documentación de la API REST con endpoints definidos y documentados.
- **Fase 2 — Implementación de la API**: API REST implementada con los endpoints necesarios para visualizar y filtrar ordenes.
- **Fase 3 — Pruebas y optimización**: API REST con pruebas unitarias y de integración realizadas, y optimizada si es necesario.

Distincion operativa:

- **Arreglar** (si): import faltante, tipo que no existe, dependencia sin declarar, error de sintaxis, archivo referenciado que no existe.
- **No tocar** (no): logica de negocio incompleta, validaciones ausentes, secretos hardcodeados, APIs deprecadas que funcionan, concurrencia insegura, patrones mejorables. Eso es lo que la persona tiene que encontrar.

## Superficie de practica (NO completes)

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs. No toques la logica que el reto pide completar.

- [ ] `src/main/java/com/example/orders/application/OrderService.java` — La fase "Definición de la API" (f1) practica src/main/resources/api-docs.yaml (o equivalente) aqui: este archivo es el ejercicio (blueprint).
- [ ] `src/main/java/com/example/orders/infrastructure/web/OrderController.java` — La fase "Implementación de la API" (f2) practica OrderController.getOrders, OrderController.getOrdersByStatus aqui: este archivo es el ejercicio (blueprint).
- [ ] `src/main/java/com/example/orders/infrastructure/persistence/OrderJpaRepository.java` — La fase "Implementación de la API" (f2) practica OrderRepository.findAll, OrderRepository.findByStatus aqui: este archivo es el ejercicio (blueprint).

## Lo que falta y tenes que completar

No se detectaron huecos: estan los archivos declarados, el boilerplate del stack y ninguna referencia quedo colgando. Igual corre el comando de verificacion — que los archivos existan no garantiza que compilen.

### Presentes (12)

- `src/main/java/Application.java`
- `pom.xml`
- `src/main/java/com/example/orders/domain/Order.java`
- `src/main/java/com/example/orders/domain/OrderStatus.java`
- `src/main/java/com/example/orders/domain/OrderRepository.java`
- `src/main/java/com/example/orders/application/OrderService.java`
- `src/main/java/com/example/orders/infrastructure/persistence/OrderJpaRepository.java`
- `src/main/java/com/example/orders/application/dto/OrderResponseDto.java`
- `src/main/resources/api-docs.yaml`
- `src/main/java/com/example/orders/infrastructure/web/OrderController.java`
- `src/main/java/com/example/orders/infrastructure/web/GlobalExceptionHandler.java`
- `src/main/resources/application.yml`

### Capas del patron declarado

Son las capas que la propuesta arquitectonica plantea, marcadas segun existan hoy en el repo. Orientan donde poner el codigo nuevo; no son una condicion para compilar.

- `src/main/java/com/example/orders/application` (presente)
- `src/main/java/com/example/orders/domain` (presente)
- `src/main/java/com/example/orders/infrastructure` (presente)
- `src/main/java/com/example/orders/infrastructure/persistence` (presente)
- `src/main/java/com/example/orders/infrastructure/web` (presente)
- `src/main/resources` (presente)
- `src/test/java/com/example/orders` (ausente)

## Verificacion

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

El comando tiene que pasar SIN implementar los archivos de la superficie de practica: solo andamiaje.

Ese comando pasando es la definicion de "terminado" para vos.

## Convenciones que tenes que respetar

- Un solo ecosistema: no declares librerias de otro lenguaje ni mezcles gestores de paquetes.
- Toda libreria que uses tiene que estar declarada en el manifiesto de dependencias.
- Todo import declarado tiene que usarse; todo tipo usado tiene que existir o venir de una dependencia declarada.
- El patron es **capas estándar (dominio, aplicación, infraestructura)**: los contratos (interfaces, puertos) los define la capa interna y los implementa la externa, nunca al revés.
- Los archivos que crees llevan implementacion real, no stubs: sin `TODO`, sin cuerpos vacios, sin `// getters y setters`.

## Contexto del candidato

Sirve para calibrar el nivel del codigo, no para resolver las fases.

- Perfil: Chapter Backend, Especialidad Desarrollador, Tecnología Java, Senior L2
- Brecha que el reto ataca: Construir un panel web en React que consuma la API REST de ordenes
- Mision: Visualizar y filtrar ordenes

---

*Generado por Challenge Generator — Pragma. `README.md` tiene el enunciado completo del reto para la persona. `PROMPT_MEJORA.md` es la variante para pegar en un chat, si se prefiere ese flujo.*
