package com.bookish.bookishapi.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository <Bookmark, Long>
{

}
