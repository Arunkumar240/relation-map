package com.library.relation.dto;

import java.util.List;

import lombok.Data;

@Data
public class AuthorDto {
	private int authorId;
	private String authorName;
	private int authorAge;
	private String authorGender;
	private List<BookDto> bookDto;
}

