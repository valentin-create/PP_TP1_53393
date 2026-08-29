# PP_TP1_53393
# Repositorio de Actividades - Programación Orientada a Objetos

Este repositorio contiene el desarrollo de las actividades prácticas de la materia, implementadas en Java. Cada actividad se encuentra organizada en su propio paquete/carpeta, aplicando conceptos de Programación Orientada a Objetos (POO) como encapsulamiento, constructores, constructor copia, atributos y métodos estáticos, entre otros.

## 📁 Estructura del repositorio

```
├── actividad1/
│   ├── App.java
│   ├── EventoUniversitario.java
│   └── Salas.java
├── actividad2/
│   ├── Actividad.java
│   ├── App.java
│   ├── Estudiante.java
│   ├── EventoUniversitario.java
│   ├── Inscripción.java
│   └── Salas.java
├── actividad3/
│   ├── Actividad.java
│   ├── App.java
│   ├── Charla.java
│   ├── Estudiante.java
│   ├── EventoUniversitario.java
│   ├── Inscripción.java
│   ├── Sala.java
│   └── Taller.java
└── README.md
```

> El repositorio se irá actualizando a medida que se agreguen nuevas actividades, cada una en su propia carpeta/paquete.

---

## Actividades


| **Actividad 1** | Modelo básico de evento universitario con costo estimado y constructor copia | Clases `EventoUniversitario`, `Salas`, `App` |
### Cómo ejecutar

```bash
cd actividad1
javac *.java
java actividad1.App
```
### Ejemplo de salida

```
------Eventos------
ID: Evento 1
Título: Inteligencia Artificial
Gratuito: No
Costo Estimado: $6767.0
ID: Evento 2
Título: Charla de Bienvenida
Gratuito: Sí
Costo Estimado: $0.0
------Eventos Copias------

Total de eventos registrados en la aplicación: 2
```

| **Actividad 2** | Se agregan salas, actividades dentro de un evento e inscripción de estudiantes | Clases `EventoUniversitario`, `Actividad`, `Estudiante`, `Inscripción`, `Salas`, `App` |

### Cómo ejecutar

```bash
cd actividad2
javac *.java
java actividad2.App
```

| **Actividad 3** | Herencia y polimorfismo: `Actividad` abstracta con subclases `Charla` y `Taller`, manejo de cupos y costo con IVA | `EventoUniversitario`, `Actividad` (abstracta), `Charla`, `Taller`, `Estudiante`, `Inscripcion`, `Sala`, `App` |

### Cómo ejecutar

```bash
cd actividad3
javac *.java
java Actividad3.App
```

## Tecnologías utilizadas

- Java (JDK)

## Autor

- Hidalgo Vargas Valentin
