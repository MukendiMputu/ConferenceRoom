package de.archmukkilocalnet.conferenceroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ConferenceRoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceRoomApplication.class, args);
    }

}
