package com.library.relation.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "author_details")

public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "author_id")
	private int authorId;
	@Column(name = "author_name")
	private String authorName;
	@Column(name = "author_age")
	private int authorAge;
	@Column(name = "author_gender")
	private String authorGender;

	 @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	    private List<Book> books;
}
