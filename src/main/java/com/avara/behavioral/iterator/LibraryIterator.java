package com.avara.behavioral.iterator;

import java.util.List;

public class LibraryIterator implements BookIterator{
  private final List<Book> books;
  private int position;

  public LibraryIterator(List<Book> books){
    this.books = books;
    this.position = 0;
  }

  public boolean hasNext() {
    return position < books.size();
  }

  public Book next() {
    if(this.hasNext()){
      Book book = books.get(position);
      position++;
      return book;
    }
    return null;
  }
}
