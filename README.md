# middleware_technology_sem2
WS2022-23

#endpoints http://localhost:8080/tweet -GET method, http://localhost:8080/tweet/{id} -POST method, DELETE method, PUT method

#docker yml file docker-compose up

###some docker commands


docker build -t mwt-backend:dockerfile .

docker start

docker logs -f

docker-compose up

docker login

docker tag mwt-backend:dockerfile msantrupt/mwt-backend 
docker push msantrupt/mwt-backend 

docker-compose down
