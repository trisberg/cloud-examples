FROM java
ADD ./target/mysource-0.0.1-SNAPSHOT-exec.jar /mysource-0.0.1-SNAPSHOT-exec.jar
ADD ./run.sh /run.sh
RUN chmod a+x /run.sh
CMD /run.sh