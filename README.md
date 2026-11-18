## Por el momento
1. FXML WelcomeView (HU-1)
2. FXML juego principal
3. Programar WelcomeView (HU-1)
4. Iniciar preparación (HU-2)





<br>


### HU-1 Inicio
- El jugador humano podrá seleccionar si desea jugar con 1, 2 o 3 jugadores máquina.
- El jugador humano podrá iniciar el juego.


<br>


### HU-2 - Preparación
- El jugador humano y los jugadores máquina reciben 4 cartas cada uno.
- Una carta se coloca boca arriba en la mesa como carta inicial.
- El resto de las cartas quedan en el mazo boca abajo.
- El juego muestra la mano inicial de cada jugador y la carta en la mesa.
- Las cartas del jugador humano se muestran boca arriba.
- Las cartas de los jugadores maquina se muestran boca abajo.
- El mazo restante está disponible para que los jugadores tomen cartas.


<br>


### HU-3 Jugar carta
- El jugador humano puede seleccionar una carta que cumple con la regla de no exceder el 50 la suma de la mesa.
- El jugador maquina puede seleccionar una carta en un tiempo entre 2 a 4 segundos que cumple con la regla de no exceder el 50 la suma de la mesa.
- La carta jugada se coloca encima de la carta anterior en la mesa.
- La carta seleccionada se mueve de la mano del jugador a la mesa.
- Se actualiza la carta visible en la mesa.


<br>


### HU-4 Tomar carta del mazo
- El jugador humano puede tomar una carta del mazo después de jugar una en la mesa.
- El jugador maquina puede tomar una carta del mazo en un tiempo entre 2 a 4 segundos después de jugar una en la mesa.
- La carta tomada se agrega a la mano del jugador.
- La mano del jugador se actualiza con la nueva carta.
- El turno pasa al siguiente jugador.


<br>


### HU-5 Eliminación jugador
- Un jugador es eliminado cuando en su mano no tenga una carta para jugar.
- Las cartas del jugador eliminado son enviadas al mazo y quedan disponibles para ser tomadas por un jugador.


<br>


### HU-6 Final
- Se finalizará el juego cuando solo queda un jugador en juego.
- Declara ganador al único jugador en juego.


<br>


### Transversales
- Excepciones marcadas, no marcadas y propias (usar finally, cerrar conexiones)
    - Advertencia de que ya no hay más cartas en el mazo - Posible caso de uso
- Implementar dos hilos

- Interfaz intuitiva con aspectos básicos de UX y UI.
- MVC
- Javadoc


<br>
<br>


## _Developers_
- Brian Rodríguez - 2420014
- Juan Manuel Parra - 2538414
- Nicolas Martinez Mendez - 2541072
