# scraper-ubuntu-docker

## build Docker test image

docker build --no-cache -t scraper-test-ubuntu .

## run Docker image

docker run -it scraper-test-ubuntu

## run test in container

git clone https://github.com/smatei/scraper-ubuntu-docker.git

cd scraper-ubuntu-docker/

mvn compile

mvn exec:java
