Desde el incio pense en una forma simple de hacerlo fue creando objetos y dandole estados como por ejemplo el Ascensor ¿En que piso esta? ¿esta subiendo o bajando? o con las puertas si esta estaba abierta o cerrada; esa me parecio la forma mas simple de empezar a hacer la solucion.

Despues era pensar que era lo que hacia cada objeto y darle sus metodos como **mover** el ascensor **detenerlo**, para las puertas **abrirlas** o **cerrarlas**.

Al final solo era pensar en todo como objetos en este caso la clase Ascensor tiene una composicion que seria la puerta. Al haber dos tipos de botones cree una herencia donde las clases BotonPiso y BotonElevador heredan puertas, tambien añadiendo cambios con @override, que en este caso fue usado para cambiar la accion de presionar, en el caso de presionar BotonPiso este lo que hace es pedir una solicitud y al presionar BotonElevador lo que hace es seleccionar un destino.

Al final solo era crear la clase control elevador, que es como en cerebro pricncipal, ya que es la que inicializa el sistema, creando el elevador los botones, ella maneja las solicitudes de los pisos o del ascensor detecta si se presiono un boton ilumina el boton cierra las puertas mueve el ascensor al piso solicitado, abre las puertas y etc

Despues creamos SistemaControlAscensor que es como la simulacion desde ahi iniciamos el sistema control elevador de damos la cantidad de pisos, mostramos diferente escenarios donde se hacen solicitudes a pisos y mostrando el estado de todo para saber lo que esta pasando


[DiagramaDeClases_POO.pdf](https://github.com/user-attachments/files/23597136/DiagramaDeClases_POO.pdf)
