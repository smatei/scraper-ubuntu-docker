FROM ubuntu:18.04
RUN  apt-get update \
##################################################################
# install java
  && apt-get install -y openjdk-8-jdk \
  && apt-get install -y maven \
  && apt-get install -y git-core \
#  && apt-get install -y unzip xvfb libxi6 libgconf-2-4 \
  && apt-get install -y openjfx \
##########################
# cleanup install packages  
  && rm -rf /var/lib/apt/lists/*
##########################
ENTRYPOINT bash  


