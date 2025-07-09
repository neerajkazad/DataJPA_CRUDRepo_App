package com.nk;

import com.nk.entity.Book;
import com.nk.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        BookRepository repo = context.getBean(BookRepository.class);

        //System.out.println(repo.getClass().getName());
        /*
        Book b = new Book();
        b.setBookId(101);
        b.setBookName("Spring Boot");
        b.setBookPrice(2000.00);

        repo.save(b);

        System.out.println("Record inserted...."); */

        Optional<Book> findById = repo.findById(101);
        System.out.println(findById.get());

    }

}
