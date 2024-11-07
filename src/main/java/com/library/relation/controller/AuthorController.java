package com.library.relation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.library.relation.dto.AuthorDto;
import com.library.relation.entity.Author;
import com.library.relation.repository.BookRepository;
import com.library.relation.service.AuthorService;

@RestController
@RequestMapping("/author/api")
public class AuthorController {
    @Autowired
    private BookRepository bookRepository;

    //@PostMapping("/post")
  //  public Author saveDetails(@RequestBody AuthorDto authorDto) {
   //     return authorService.saveDetails(authorDto);
  //  }

    @DeleteMapping("/delete-book/{id}")
    public String deleteBook(@PathVariable int id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return "Book deleted successfully";
        } else {
            return "Book not found";
        }
    }
}
