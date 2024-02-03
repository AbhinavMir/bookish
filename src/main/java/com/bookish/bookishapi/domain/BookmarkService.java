package com.bookish.bookishapi.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;

        @Transactional(readOnly = true)
    public List<Bookmark> getBookmarks(){
        // taken from JPA repository
        return repository.findAll();
    }
}
