package com.library.relation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.library.relation.entity.Author;
@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer>{
	    @Query(value = "SELECT * FROM author_details WHERE author_name = :authorName", nativeQuery = true)
	    Optional<Author> findByAuthorName(@Param("authorName") String authorName);
	}


