package ru.dziuban.libreryproject.service;

import ru.dziuban.libreryproject.dto.AuthorDto;

public interface AuthorService {
    AuthorDto getAuthorById(Long id);
}
