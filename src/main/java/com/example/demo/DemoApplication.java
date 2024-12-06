package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @RequiredArgsConstructor
// @Log4j2
public class DemoApplication {

    // private final BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /* @Override
    public void run(String... args) {
        log.info("Data in table 'books': ");
        this.bookRepository.findAll().forEach(book -> System.out.println(book));
    } */

    // TODO: you can remove the comments after the the install command has finished successfullyclear
}
