package com.library.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.relation.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
