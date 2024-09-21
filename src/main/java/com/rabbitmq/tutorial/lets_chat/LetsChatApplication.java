package com.rabbitmq.tutorial.lets_chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rabbitmq.tutorial.lets_chat.producer.UploadPostService;

@SpringBootApplication
public class LetsChatApplication {

	@Autowired
	private UploadPostService uploadPostService;
	
	public static void main(String[] args) {
		SpringApplication.run(LetsChatApplication.class, args);
	}

	@Bean
    public CommandLineRunner CommandLineRunnerBean() {
        return (args) -> {
            System.out.println("In CommandLineRunnerImpl ");
            //uncomment to publish directly or make a rest api to pusblish the message
            //uploadPostService.uploadPostForUser("PS1405", "1001");
        };
    }
}
