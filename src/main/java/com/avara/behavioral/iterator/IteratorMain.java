package com.avara.behavioral.iterator;

public class IteratorMain {
  public static void main(String[] args) {
    Library library = new Library();

    library.addBook(new Book("Book1"));
    library.addBook(new Book("Book2"));
    library.addBook(new Book("Book3"));

    BookIterator iterator = library.createIterator();
    while (iterator.hasNext()) {
      Book book = iterator.next();
      System.out.println("Book: " + book.getTitle());
    }
  }
}
