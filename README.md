# KafkaProject_One

# download kafka - https://dlcdn.apache.org/kafka/3.5.0/kafka_2.13-3.5.0.tgz and place it in c   drive
# Create a folder called data and kafka & zookeeper folder inside data 
# edit config/zookeeper.properties file to edit dataDir variable with C:\kafka\data\zookeeper 
# navigate to bin/window of kafka folder and turn on zookeeper and kafka server using below cmds

bin\windows\zookeeper-server-start.bat config\zookeeper.properties

# this will turn on zookeeper at port 2181
# [2023-08-15 12:28:14,868] INFO binding to port 0.0.0.0/0.0.0.0:2181 

bin\windows\kafka-server-start.bat config\server.properties

# this will turn kafka server at port 9092
# [2023-08-15 12:31:41,392] INFO Awaiting socket connections on 0.0.0.0:9092.


# once zookeeper & kafka are up & running, create a spring boot producer & consumer class to  #publish & read message

# check message are delivered to kafka topic
bin\windows\kafka-console-consumer.bat --topic javaGuides --from-beginning --bootstrap-server localhost:9092

# kafka does not have a serializer & deserializer for JSON message, for that instead of using kafka deserializer, spring provide json deserializer to help with the same.
