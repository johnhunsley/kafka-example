Kafka Springboot example

Run the docker-compose which will launch 3 containers -
1. Kafka running on 9092 and exposed to localhost outside the compose network on 29092
2. Zookeeper required by Kafka
3. Kafdrop - a Kafka UI tool which is available on localhost:9100

The use the springboot:run maven command to run the simple example project which creates
a producer and lister. When run the producer will send a hellow world message to a configured 
topic which is consumed by the listener and printed out in the console.
