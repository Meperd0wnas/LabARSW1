# LabARSW1

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

    Metodos que preguntan uántas ocurrencias/chequeos hicieron.

  ![alt text](./assets/metodos1.png)

    checkHost ahora recibe el parámetro N y haces validaciones.

  ![alt text](./assets/ValidacionesConN.png)

  ## 2.

    Lanzamiento de los hilos y LOG

  ![alt text](./assets/Lanzamiento.png)


    Salida
  
  ![alt text](./assets/salida.png)

  

