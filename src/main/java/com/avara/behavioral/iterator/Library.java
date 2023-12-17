package com.avara.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.AllArgsConstructor;


public class Library implements BookIterable{
  private final List<Book> books;

  public Library () {
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) {
    this.books.add(book);
  }

  public BookIterator createIterator() {
    return new LibraryIterator(books);
  }
}
