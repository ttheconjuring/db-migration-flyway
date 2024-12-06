package com.example.demo;

import com.example.demo.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
@Log4j2
public class DemoApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        log.info("Data in table 'books': ");
        this.bookRepository.findAll().forEach(book -> System.out.println(book));
    }
}
