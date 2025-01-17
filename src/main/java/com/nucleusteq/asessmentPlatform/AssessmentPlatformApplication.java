package com.nucleusteq.asessmentPlatform;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * The main class that initializes and runs the Assessment Platform application.
 */
@SpringBootApplication
public class AssessmentPlatformApplication {

    /**
     * The main method to start the Assessment Platform application.
     *
     * @param args The command line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(AssessmentPlatformApplication.class, args);
    }

    /**
     * Creates and configures a ModelMapper bean.
     *
     * @return A ModelMapper instance configured as a Spring bean.
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
