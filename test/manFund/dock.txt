



docker container run hello-world

Docker registery is nothing but docker store
docker client is the application 

Docker daemon - The background service running on the host that manages building, running and distributing Docker containers.
Docker client - The command line tool that allows the user to interact with the Docker daemon.
Docker Store - Store is, among other things, a registry of Docker images. You can think of the registry as a directory of all available Docker images. You’ll be using this later in this tutorial.

Containers - Running instances of Docker images — containers run the actual applications. A container includes an application and all of its dependencies. It shares the kernel with other containers, and runs as an isolated process in user space on the host OS. 

1. The Docker client contacted the Docker daemon.
 2. The Docker daemon pulled the "hello-world" image from the Docker Hub.
    (amd64)
 3. The Docker daemon created a new container from that image which runs the
    executable that produces the output you are currently reading.
 4. The Docker daemon streamed that output to the Docker client, which sent it
    to your terminal.

The VM is a hardware abstraction: it takes physical CPUs and RAM from a host, and divides and shares it across several smaller virtual machines. There is an OS and application running inside the VM, but the virtualization software usually has no real knowledge of that.
A container is an application abstraction: the focus is really on the OS and the application, and not so much the hardware abstraction. Many customers actually use both VMs and containers today in their environments and, in fact, may run containers inside of VMs

docker image ls
docker image pull imagename
docker container run imagename somecommand  // it will open image in container executes command inside the container and exit"
docker container ls -a // list all the container you ran

docker container exec <container ID> ls  executes command in the container isntance
docker container start <container ID>  running a specific container instance

docker container commit CONTAINER_ID
docker image pull alpine
docker image inspect alpine
docker image build -t hello:v0.2 .
docker exec -it <container name> /bin/bash
after the above command if apt-get not supproted use
apk update and apk add inspite of apt-get update and apt-get install
docker start -i <container> 

docker logs -f <container-id|container-name>

vim Dockerfile
FROM ubuntu:latest
RUN apt-get update \
	&& apt-get install -y --no-install-recommends maven \						\\basically no install recomends will not allow unwanted 	libries to be installed
	&& apt-get clean															\\ delete temp files
docker build . -t <tag_name>

docker rm <container>
docker rmi <image>

docker ps
docker container ls -a   // -a for running instance
docker image ls -a

Layers - A Docker image is built up from a series of layers. Each layer represents an instruction in the image’s Dockerfile. Each layer except the last one is read-only.
Dockerfile - A text file that contains all the commands, in order, needed to build a given image. The Dockerfile reference page lists the various commands and format details for Dockerfiles.
Volumes - A special Docker container layer that allows data to persist and be shared separately from the container itself. Think of volumes as a way to abstract and manage your persistent data separately from the application itself.

useful linux commands 

sudo -i // root
cd ..
cd /user/bin

docker run -u root -p 8080:8080 -p 50000:50000 -v jenkins-data:/var/jenkins_home -v /var/run/docker.sock:/var/run/docker.sock jenkinsci/blueocean
http://13.126.123.232:8080/
docker run -u root -p 8080:8080 jenkinsci/blueocean jenkinsci/blueocean
bossraths
#buska@123
docker container id: 615e7892d1f7

docker exec -it <container name> /bin/bash

/var/jenkins_home/secrets/initialAdminPassword  you can found jenkins key here


