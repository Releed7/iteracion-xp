# Zair Roberto Chavarin Pérez Y Kennay Alberto Montijo García

## Preguntas de reflexion
### 1. ¿Que ventaja tuvo escribir primero los casos de prueba?
Permitió tener absoluta claridad sobre las reglas de negocio y los casos frontera (como $499.99 vs $500.00) antes de escribir el código. Al definir primero qué debía hacer el programa, la implementación fue más directa, se previnieron errores de lógica antes de codificar y se contó con un criterio claro para saber cuándo el código estaba listo (fase Green).
### 2. ¿Qué aporto trabajar en pareja?
El trabajo en pareja mejoró la calidad del código desde el primer momento. Mientras el Driver se enfocaba en la sintaxis y la escritura, el Navigator podía anticipar casos de prueba faltantes, corregir errores tipográficos al instante y sugerir mejoras de diseño (como la extracción de constantes). Además, la rotación de roles mantuvo a ambos activos en el proceso.
### 3. ¿Fue facil incorporar el nuevo requerimiento?
Sí, fue un proceso sencillo e intuitivo. Como ya existía una suite de pruebas automatizadas funcionando, agregar el requerimiento del cliente Premium solo requirió añadir nuevos test cases en la fase Red y ajustar el método existente. La batería de pruebas previa garantizó que el nuevo cambio no rompiera la lógica de los clientes estándar que ya funcionaba.
### 4. ¿Qué practica de XP facilitó más el cambio?
**TDD (Test-Driven Development)** junto a la **Refactorización**, respaldados por una suite de pruebas automatizadas con JUnit. El tener una "malla de seguridad" con las pruebas unitarias existentes permitió modificar la firma del método y la lógica del cliente Premium con la confianza de que ningún comportamiento previo se distorsionó.