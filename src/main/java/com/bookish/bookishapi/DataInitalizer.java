package com.bookish.bookishapi;

import com.bookish.bookishapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.bookish.bookishapi.domain.Bookmark;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitalizer implements CommandLineRunner
{
    private final BookmarkRepository repository;

    @Override
    public void run(String...  args) throws Exception
    {
        repository.save(new Bookmark(null, "https://www.google.com", "Google", Instant.now()));
        repository.save(new Bookmark(null, "https://www.yahoo.com", "Yahoo", Instant.now()));
        repository.save(new Bookmark(null, "https://www.bing.com", "Bing", Instant.now()));
        repository.save(new Bookmark(null, "https://www.duckduckgo.com", "DuckDuckGo", Instant.now()));
        repository.save(new Bookmark(null, "https://www.ask.com", "Ask", Instant.now()));
        repository.save(new Bookmark(null, "https://www.aol.com", "AOL", Instant.now()));
        repository.save(new Bookmark(null, "https://www.lycos.com", "Lycos", Instant.now()));
    }
}
