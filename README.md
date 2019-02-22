# docker_handson
Hands-on session on Docker. 

## Preperation
For this handson you'll need `docker-ce`.

## Assignment 0
In this assignment you'll see how Docker operates in it's basics. Create an image from the files in folder named `opdracht_0` and run that image. View the website that's on it.  

## Opdracht 1
In the folder `opdracht_1` you can find a jar-file. This file has to run inside a container.

1. Find a appropriate base image on [https://hub.docker.com/](https://hub.docker.com/).
2. Write a docker file and build the image.
3. Start the container and check if the application is available on port `8080` at the path `/list`. (over http)

## Opdracht 2

1. For this assignment get [this image](https://hub.docker.com/r/xanvier/secret/).
2. The image is based on the [Nginx](https://hub.docker.com/_/nginx/) image. So it is running a webserver.
3. You have to run a container based on this image run on port 8080 and use port forwarding in the run command.
4. Change the image such that Nginx runs on port 80, make use of the `interactive shell` and the `commit` command.
5. Create a docker hub account and put your newly created image there.

## Bonus opdracht
Spin up a MySQL container and think (google) how you can solve the persistence problem we've discussed earlier in the presentation. Think about the fact that a container can shutdown and reboot every moment.

