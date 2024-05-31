package com.tyk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tyk.entity.Book;
import com.tyk.repository.BookRepository;

@Service
public class BookServiceImpl  implements BookService{
	
	private BookRepository repo;
	
	public BookServiceImpl(BookRepository repo) {
		// TODO Auto-generated constructor stub
		this.repo=repo;
	}

	@Override
	public String addOrUpdateBook(Book book) {
		
		Integer id = book.getBookId();
		 repo.save(book);
		 if(id==null)
		 {
			 return "Recod Inserted";
		 }
		 else
		 {
			 return "Record Updated";
		 }
		
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = repo.findAll();
		return list;
	}

	@Override
	public String deleteBook(Integer bookId) {
		repo.deleteById(bookId);
		return "Book Deleted";
	}

}
