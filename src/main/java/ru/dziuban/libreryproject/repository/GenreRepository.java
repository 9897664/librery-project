package ru.dziuban.libreryproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dziuban.libreryproject.model.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
