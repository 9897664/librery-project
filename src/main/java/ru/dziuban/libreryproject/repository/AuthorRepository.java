package ru.dziuban.libreryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dziuban.libreryproject.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
