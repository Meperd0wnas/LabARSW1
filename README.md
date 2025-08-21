# Lab ARSW1 
## Daniel RIcardo Ruge Gomez


## Parte I

## 1.  

![hilo](./assets/image.png)  

## 2.  

i

![hilaMain](./assets/image-1.png)

ii y iii

![salida1](./assets/salida1.png)

iv

![alt text](./assets/salida2.png)

## Explicación

Cuando se usa start(), se crea un hilo en el sistema operativo. La JVM le pide al SO un hilo nuevo, y este comienza a ejecutar el método run() al mismo tiempo que el flujo principal del programa, haciendo que el orden de ejecución de los hilos sea impredecible.

En cambio, cuando se usa run() directamente, no se crea un nuevo hilo: simplemente el mismo hilo principal (main) ejecuta el código. Por eso, la ejecución se vuelve secuencial.


 ## Parte II - Ejercicio Black List Search

  ## 1. 
    Declaración de la clase, el constructor y el metodo run()

  ![alt text](./assets/claseThread.png)

    Metodos que preguntan cuántas ocurrencias/chequeos hicieron.

  ![alt text](./assets/metodos1.png)

    checkHost ahora recibe el parámetro N y haces validaciones.

  ![alt text](./assets/ValidacionesConN.png)

  ## 2.

    Lanzamiento de los hilos y LOG

  ![alt text](./assets/Lanzamiento.png)


    Salida
  
  ![alt text](./assets/salida.png)

 ## Parte II.I

   Se podría modificar la implementación introduciendo un contador global compartido que todos los hilos consulten antes de seguir buscando. De esta forma, cuando ya se llegue al mínimo requerido de ocurrencias, los demás hilos pueden detenerse inmediatamente, aunque se deberia tener en cuenta la coordinación y sincronización entre hilos para evitar condiciones de carrera al acceder a ese contador compartido.

## Parte III

  1 hilo

  ![alt text](./assets/1Hilo.png)

  4 hilos

  ![alt text](./assets/4hilos.png)

  8 hilos

  ![alt text](./assets/8hilos.png)

  50 hilos

  ![alt text](./assets/16hilos.png)

  100 hilos

  ![alt text](./assets/100hilos.png)

  ## grafica 

  ![alt text](./assets/grafica.png)