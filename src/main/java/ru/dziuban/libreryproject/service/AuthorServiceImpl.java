package ru.dziuban.libreryproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dziuban.libreryproject.dto.AuthorDto;
import ru.dziuban.libreryproject.dto.BookDto;
import ru.dziuban.libreryproject.model.Author;
import ru.dziuban.libreryproject.repository.AuthorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorDto getAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow();
        AuthorDto authorDto = convertEntityToDto(author);
        return authorDto;
    }

    private AuthorDto convertEntityToDto(Author author){
        List<BookDto> bookDtoList = author.getBooks().stream()
                .map(book -> BookDto.builder()
                        .genre(book.getGenre.getName())
                        .name(book.getName())
                        .id(book.getId())
                        .build())
                .toList();


        AuthorDto authorDto =  AuthorDto.builder()
                .id(author.getId())
                .name(author.getName())
                .surname(author.getSername())
                .books(bookDtoList)
                .build();
        return authorDto;
    }
}
