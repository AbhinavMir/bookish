package com.bookish.bookishapi.domain;

import com.bookish.bookishapi.domain.domain.BookmarksDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public BookmarksDTO getBookmarks(Integer page) {
        int PageNo = page <1 ? 0 : page - 1;
        Pageable pageable = PageRequest.of(PageNo, 2, Sort.Direction.DESC, "createdAt");
        return new BookmarksDTO(repository.findAll(pageable));
    }
}
