# Respuestas teóricas - Parte I

Aquí se desarrollan las respuestas a los ejercicios teóricos de la Parte I de la guía.


# Respuestas Teóricas - Guía de Ejercicios 3 (POO)

## 1) Conceptos básicos

- **Clase**: Plantilla o modelo que define atributos (estado) y métodos (comportamiento) comunes a un conjunto de objetos.
- **Objeto**: Instancia concreta de una clase; representa una entidad con identidad, estado y comportamiento.
- **Atributo**: Propiedad o característica de una clase/objeto que define su estado.
- **Sobrecarga (Overload)**: Definición de múltiples métodos con el mismo nombre pero distinta lista de parámetros.
- **Sobreescritura (Override)**: Redefinición en una subclase de un método heredado de la superclase, conservando la misma firma.
- **Jerarquía de clases**: Organización en árbol de las clases según relaciones de herencia.
- **Herencia**: Mecanismo por el cual una clase (subclase) adquiere atributos y métodos de otra (superclase).
- **Polimorfismo**: Capacidad de un objeto de adoptar distintas formas; en Java, que una referencia pueda apuntar a objetos de diferentes clases relacionadas por herencia.
- **Binding**: Proceso de asociar una llamada a método con su implementación.  
  - *Estatico (early binding)*: Se resuelve en tiempo de compilación.  
  - *Dinámico (late binding)*: Se resuelve en tiempo de ejecución.
- **Abstracción**: Enfocarse en los aspectos esenciales de un objeto, ignorando los irrelevantes.
- **Encapsulamiento**: Ocultar los detalles internos de un objeto, exponiendo solo lo necesario mediante interfaces públicas.
- **Modularidad**: División de un sistema en partes independientes y reutilizables.

---

## 2) Agrupación de objetos en clases

- **Clase Mineral**: Rubí, Esmeralda, Cristal.  
- **Clase Vivienda**: Mansión, Apartamento, Cabaña, Casa.  
- **Clase Animal**: Gato, Cerdo, Conejo, Oveja, Perro.  
- **Clase Útil de Escritura**: Lapicero, Lápiz de Color, Lápiz.  
- **Clase Objeto de Organización**: Agenda, Carpeta.  
- **Clase Figura Geométrica**: Hexágono.

---

## 3) Diferencia entre sobrecarga y sobreescritura

- **Sobrecarga**: mismo nombre de método, distinta lista de parámetros, misma clase.  
- **Sobreescritura**: redefinición de un método heredado, misma firma, distinta implementación en la subclase.

---

## 4) ¿La sobrecarga es polimorfismo?

Sí, es una forma de polimorfismo **en tiempo de compilación** (polimorfismo estático).  
La sobreescritura es polimorfismo **en tiempo de ejecución** (dinámico).

---

## 5) Características de la POO con ejemplos

- **Abstracción**: un “Auto” se define por atributos esenciales (modelo, motor), sin incluir cómo se fabricó.  
- **Encapsulamiento**: un “CuentaBancaria” expone `depositar()` y `retirar()`, pero oculta cómo maneja internamente el saldo.  
- **Herencia**: la clase “Ave” puede tener subclases “Gorrión” y “Águila”.  
- **Polimorfismo**: una referencia a “Ave” puede apuntar tanto a un “Gorrión” como a un “Águila”.

---

## 6) Condiciones para la sobrecarga

- Mismo nombre de método.  
- Diferente lista de parámetros (cantidad, tipo o ambos).  
- El tipo de retorno **no** es suficiente para diferenciar sobrecarga.

---

## 7) Medios de transporte (modelado)

- **Clase abstracta**: `MedioTransporte`  
  - Atributos: velocidad, estadoMantenimiento  
  - Métodos: trasladar()  

- **Subclases**:  
  - `Natural` (atributos: origen, extremidades, raza, color, etc.)  
  - `Artificial` (atributos: material, fabricante, fechaFabricación)  
    - `Terrestre` (cilindros, combustible, ruedas)  
    - `Acuático` (calado, eslora)  
    - `Aéreo` (modelo, propulsión)  
    - `Anfibio` (tierra + agua)

---

## 8) Lenguaje OO tipificado vs no tipificado

- **Tipificado (Java, C#)**: cada variable tiene un tipo definido en tiempo de compilación; se realizan chequeos estáticos.  
- **No tipificado (Python, JavaScript)**: el tipo se conoce en tiempo de ejecución.  
- **Situaciones sintácticas**: declaración de variables, parámetros de métodos, retornos de funciones.

---

## 9) Ejemplos que violan SOLID

1. **Violación SRP (Responsabilidad Única)**  
   - Una clase `Empleado` que gestiona su salario y además imprime reportes → debería dividirse en `Empleado` y `GeneradorReporte`.  

2. **Violación OCP (Cerrado/Abierto)**  
   - Una clase `Figura` con un `if` gigante que calcula área para círculo, cuadrado y triángulo → debería usar herencia y polimorfismo.  

3. **Violación LSP (Sustitución de Liskov)**  
   - Subclase `Rectangulo` y `Cuadrado` donde `Cuadrado` rompe las expectativas de `Rectangulo.setAltura()` → no cumple LSP.  

4. **Violación ISP (Segregación de Interfaces)**  
   - Una interfaz `Trabajador` con métodos `programar()`, `cocinar()`, `limpiar()` → clientes que solo necesitan uno se ven obligados a implementar todos.  

5. **Violación DIP (Inversión de Dependencias)**  
   - Una clase `Controlador` que depende directamente de `MySQLConexion` en lugar de una abstracción `BaseDeDatos`.

---
