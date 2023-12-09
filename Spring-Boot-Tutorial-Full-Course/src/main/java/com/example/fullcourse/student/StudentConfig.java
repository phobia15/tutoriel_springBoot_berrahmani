package com.example.fullcourse.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student khaled = new Student( "khaled", "berrahmani@gmail.com", LocalDate.of(2000, 06, 28)
            );

            Student berra = new Student( "berrahmani", "berrahmanikhaled@gmail.com", LocalDate.of(1999, 12, 15)
            );

            repository.saveAll(List.of(khaled, berra));
        };
    }
}
