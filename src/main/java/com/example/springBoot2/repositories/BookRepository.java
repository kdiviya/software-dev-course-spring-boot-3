
package com.example.springBoot2.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springBoot2.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
