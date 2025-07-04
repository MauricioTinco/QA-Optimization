# 🧪 Serenity BDD + REST Assured

Automatización de pruebas de servicios REST usando **Serenity BDD**, **Rest Assured** y **JUnit5**.

![Serenity BDD](https://serenity-bdd.github.io/img/serenity-bdd-logo.png)

---

## 📚 Descripción

Este proyecto implementa pruebas automatizadas para APIs RESTful utilizando el patrón **Screenplay** de Serenity BDD. Es ideal para proyectos que requieren reportes detallados, legibilidad en los scripts y una arquitectura escalable de pruebas.

---

## 🚀 Tecnologías utilizadas

- 🔹 [Java 17+](https://www.oracle.com/java/)
- 🔹 [Maven](https://maven.apache.org/)
- 🔹 [Serenity BDD](https://serenity-bdd.github.io/)
- 🔹 [Rest Assured](https://rest-assured.io/)
- 🔹 [JUnit 5](https://junit.org/junit5/)

---

## 📁 Estructura del proyecto

serenity-rest/
├── src/
│ ├── main/
│ └── test/
│ ├── java/
│ │ ├── tasks/
│ │ ├── questions/
│ │ ├── models/
│ │ └── stepdefinitions/
│ └── resources/
│ └── serenity.conf
├── pom.xml
└── README.md
---

## 🔧 Configuración

1. Clona el repositorio:

```bash
git clone https://github.com/MauricioTinco/QA-Optimization.git

cd serenity-rest

mvn clean verify
