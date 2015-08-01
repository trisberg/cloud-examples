FROM java
ADD ./target/mysink-0.0.1-SNAPSHOT-exec.jar /mysink-0.0.1-SNAPSHOT-exec.jar
ADD ./run.sh /run.sh
RUN chmod a+x /run.sh
CMD /run.sh