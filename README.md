# scraper-ubuntu-docker

## build Docker test image

docker build --no-cache -t scraper-test-ubuntu .

## run Docker image

docker run -it --cpus=10 scraper-test-ubuntu
