package com.hunsley.kafkaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KafkaExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(KafkaExampleApplication.class, args);
		MessageProducer producer = context.getBean(MessageProducer.class);
		producer.sendMessage("Hello World....................");
	}

}
