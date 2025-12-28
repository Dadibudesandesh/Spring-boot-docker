# This file helps you to understand what i do actually in this docker+springboot project

* So first , I initialize the project using spring initializer,
* Then next step is add/create Docker file as (Dockerfile) 
* In this file we actually do commands to create container | To build docker image 

## - Dockerfile instructions

- FROM eclipse-temurin:17  // for define base image or parent image
- LABEL mentainer="sandesh@gmail.com" // for defin maintainer or author
- WORKDIR /app // when we deployee docker image in docker container app directory created in container
- COPY target/spring-boot-docker-0.0.1-SNAPSHOT.jar /app/springboot-docker-app.jar // for copy project from local project to docker container
- ENTRYPOINT["java","-jar","springboot-docker-app.jar"]  // this is a entrypoint where project run into docker container 


## - Build Images And Run Container

* docker build -t spring-boot-docker .  ( . = indicates root folder)

![img.png](img.png)

* View Docker images

![img_1.png](img_1.png)

* Add Tag to image

![img_2.png](img_2.png)

*  Run docker container | -p : for mapping port | (host machine port)8080:8080(container port)

![img_3.png](img_3.png)

* Change port 

![img_4.png](img_4.png)

* View running containers 

![img_5.png](img_5.png)

* Run Container in detached mode / Background mode (-d : detached mode )

![img_6.png](img_6.png)

* View Longs 

![img_7.png](img_7.png)

* Stop Container providing container id

![img_9.png](img_9.png)

## - Push Image From local machine to Docker Hub 

* First login

![img_11.png](img_11.png)

* Push image

![img_10.png](img_10.png)


## Pull Images from Docker Hub

* Pull pushed image 

![img_13.png](img_13.png)

* Pull existing images

![img_14.png](img_14.png)

* List of images exist in local machine

![img_15.png](img_15.png)

* Run container

![img_16.png](img_16.png)

* View Logs

![img_17.png](img_17.png)

* Use Container

![img_18.png](img_18.png)

