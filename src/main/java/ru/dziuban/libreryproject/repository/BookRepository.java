package ru.dziuban.libreryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dziuban.libreryproject.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
