## Template:

-   Permite redefinir ciertos pasos de un algoritmo, sin cambiar toda la estructura.
-   Debe de tener ciertos métodos fijos, que son los que nunca cambian, y tienen
    métodos delegados que son los que, dependiendo de cada subclase, cambian.
-   Además de que en el método Template tiene ciertos métodos hook que se pueden
    ejecutar u omitir, también dependiendo de cada subclase.

## Iterator:

-   Es una forma de acceder secuencialmente a los elementos de una estructura, sin tener que exponerlos.
-   Se caracteriza por tener solamente los métodos necesarios para poder recorrer la estructura y otro para regresar un elemento de esa estructura.
-   Su intención es proteger los elementos de una estructura.

## State:

-   Tiene un objeto de contexto el cual va cambiando su comportamiento cuando lo hace su estado interno, lo cual hace parecer que está cambiando de clase.
-   Dicho objeto cambia sus estados dependiendo de las transiciones que implementa el programador.
-   Cuando hay una transición el estado actual es sustituido por el estado al que lleve esa transición.
-   En java los estados serían interfaces y cada estado que vaya a tener el objeto de contexto tiene que implementar esta interfaz
