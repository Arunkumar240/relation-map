package com.library.relation.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.relation.dto.AuthorDto;
import com.library.relation.dto.BookDto;
import com.library.relation.entity.Author;
import com.library.relation.entity.Book;
import com.library.relation.repository.AuthorRepository;
import com.library.relation.repository.BookRepository;
@Service
public class AuthorService {
	@Autowired
	AuthorRepository authorRepository;
	BookRepository bookRepository;

	public Author saveDetails(AuthorDto authorDto) {
		Author obj = new Author();
		obj.setAuthorAge(authorDto.getAuthorAge());
		obj.setAuthorGender(authorDto.getAuthorGender());
		obj.setAuthorName(authorDto.getAuthorName());
		List<Book> total = new ArrayList<>();
		for(BookDto dto : authorDto.getBookDto()) {
			Book book=new Book();
			book.setBookName(dto.getBookName());
			book.setAuthor(obj);
			total.add(book);
			}
		obj.setBooks(total);
		authorRepository.save(obj);
		return obj;
		
	}

	
}
