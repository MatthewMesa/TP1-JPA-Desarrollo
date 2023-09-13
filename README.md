# TP1-JPA-Desarrollo
Autor: Matías Mesa, legajo 47841

Estructura de Paquetes y Clases:
Creamos una estructura de paquetes con "entidades" y "repositorios" para organizar nuestras clases de modelo, 
que incluyen "Usuario", "Domicilio", "Cliente", "Rubro", "Pedido", "Factura" y "DetallePedido". 
Aseguramos que cada clase tenga un constructor adecuado y atributos con valores realistas.

Mapeo de Relaciones: 
Usamos anotaciones JPA para mapear relaciones como @OneToMany, @ManyToOne y @OneToOne según lo definido en el modelo. 
Por ejemplo, configuramos la relación entre "Cliente" y "Domicilio" como @OneToMany, y "Pedido" y "Factura" como @OneToOne.
Operaciones de Consulta y Manipulación: Implementamos consultas JPA para recuperar datos realistas de la base de datos H2 
y demostramos operaciones como crear pedidos, actualizar clientes y eliminar registros.

Demostración de Asociaciones:
Mostramos cómo trabajar con objetos relacionados, como agregar pedidos a clientes y recuperar listas de pedidos de clientes, siguiendo las relaciones definidas en el modelo.

Escenarios de Prueba: 
Creamos escenarios de prueba para garantizar el correcto funcionamiento del modelo, incluyendo pruebas de relaciones entre objetos y casos excepcionales.

En resumen, hemos desarrollado y demostrado la implementación del modelo para asegurar su correcto funcionamiento en situaciones del mundo real.
