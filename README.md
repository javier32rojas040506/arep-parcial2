### AREP PARCIAL

[VIDEO](https://youtube.com/shorts/K1rFYwLsAOw?feature=share)

#### Como clonarlo y compilarlo
1) ````git clone https://github.com/javier32rojas040506/arep-parcial2.git````
2) ``mvn package``
## ARQUITECTURA
En este caso implementamos un servidor web que expone uno archivos estaticos que sirven de cliente web

![img.png](ReadmeImges/img.png)

El cliente envia un enpoint especificando el value por un query param

![img_1.png](ReadmeImges/img_1.png)

del tipo

http://host:{port}/collatzsequence?value=13

![img_2.png](ReadmeImges/img_2.png)

por el lado del servidor atendemos a la solicitud con un get asi;

![img_3.png](ReadmeImges/img_3.png)

## Local steps
1) CREAR DOCKER FILE
  
![img_4.png](ReadmeImges/img_4.png)

3) Construir imagen

``` docker build --tag parcial-arep . ```

4) correr contenedor

``docker run -d -p 80:80 --name parcial fj32rojas/parcial-arep``

![img.png](img.png)
![img_1.png](img_1.png)

## AWS STEPS
1) CREAR DOCKER FILE

![img_4.png](ReadmeImges/img_4.png)

3) Construir imagen

``` docker build --tag parcial-arep . ```

3) crear repo

![img_5.png](ReadmeImges/img_5.png)

5) crear tag con repo

```` docker tag parcial-arep/fj32rojas ````

5) conectarse a instancia y descragar docker

![img_6.png](ReadmeImges/img_6.png)

7) correr contenedor


``sudo docker run -d -p 80:80 --name parcial fj32rojas/parcial-arep``


![img_7.png](ReadmeImges/img_7.png)

7) Verifique que tenga los puertos abiertos

![img_8.png](ReadmeImges/img_8.png)

8) pruebe con la ip de su instancia

![img_9.png](ReadmeImges/img_9.png)
![img_10.png](ReadmeImges/img_10.png)
